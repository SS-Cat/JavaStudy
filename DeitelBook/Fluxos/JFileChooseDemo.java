import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import javafx.scene.control.TextArea;

/**
 * JFileChoseDemo
 */
public class JFileChooseDemo extends JFrame{

    private final JTextArea outputArea;

    public JFileChooseDemo()throws IOException {
        super("JFileChooser Demo");
        outputArea = new JTextArea();
        add(new JScrollPane(outputArea));
        analyzePath();
    }

    public void analyzePath() throws IOException {
        
        Path path = getFileOrDirectoryPath();

        if (path != null && Files.exists(path)) {   // se existir, exibe as informações
            //coleta as informações sobre o arquivo (ou diretório)
            StringBuilder builder = new StringBuilder();
            builder.append(String.format("%s:\n", path.getFileName()));
            builder.append(String.format("%s a directory\n", 
                Files.isDirectory(path) ? "Is" : "Is not"));
            builder.append(String.format("%s an absolute path\n",
                path.isAbsolute() ? "Is" : "Is not"));
            builder.append(String.format("Last modified: %s\n",
                Files.getLastModifiedTime(path)));
            builder.append(String.format("Size: %s\n", Files.size(path)));
            builder.append(String.format("Path: %s\n", path));
            builder.append(String.format("Absolute Path: %s\n", path.toAbsolutePath()));

            if(Files.isDirectory(path)){
                builder.append(String.format("\nDirectory contents:\n"));

                // objeto para iteração pelo conteúdo de um diretório
                DirectoryStream<Path> directoryStream = Files.newDirectoryStream(path);

                for (Path p : directoryStream) {
                    builder.append(String.format("%s\n", p));
                }
            }

            outputArea.setText(builder.toString());

        } else {
            JOptionPane.showMessageDialog(this,
                path.getFileName() + "does not exist", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    private Path getFileOrDirectoryPath() {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(
            JFileChooser.FILES_AND_DIRECTORIES
        );
        int result = fileChooser.showOpenDialog(this);

        if(result == JFileChooser.CANCEL_OPTION)
            System.exit(1);

        return fileChooser.getSelectedFile().toPath();
    }
}