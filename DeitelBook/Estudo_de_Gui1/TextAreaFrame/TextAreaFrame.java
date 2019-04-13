import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.Box;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JScrollPane;

/**
 * TextAreaFrame
 */
public class TextAreaFrame extends JFrame{

    private final JTextArea textArea1;
    private final JTextArea textArea2;
    private final JButton copyJButton;

    public TextAreaFrame() {
        super("TextArea Demo");
        Box box = Box.createHorizontalBox();
        String demo = "This is a demo string to\n" +
        "illustrate copying text\nfrom one textarea to \n" +
        "another textarea using an\nexternal event\n";

        textArea1 = new JTextArea(demo, 10, 15);
        textArea1.setLineWrap(true);
        box.add(new JScrollPane(textArea1));

        copyJButton = new JButton("Copy >>>");
        box.add(copyJButton);
        copyJButton.addActionListener(new ActionListener(){
        
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea2.setText(textArea1.getSelectedText());
            }
        });

        textArea2 = new JTextArea(10, 15);
        textArea2.setEditable(false);
        box.add(textArea2);

        add(box);

    }
    
}