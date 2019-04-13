import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * Fractal
 */
public class Fractal extends JFrame {

    private static final int WIDTH = 400;
    private static final int HEIGHT = 480;
    private static final int MIN_LEVEL = 0;
    private static final int MAX_LEVEL = 15;

    public Fractal() {
        super("Fractal");

        // configura levelJLabel para adicionar ao controlJPanel
        final JLabel levelJLabel = new JLabel("Level: 0");
        
        final FractalJPanel drawSpace = new FractalJPanel(0);

        // configura o painel de controle
        final JPanel controlJPanel = new JPanel();
        controlJPanel.setLayout(new FlowLayout());

        // configura o botão de cor e registra o ouvinte
        final JButton changeColor = new JButton("Color");
        controlJPanel.add(changeColor);
        changeColor.addActionListener(event -> {
            Color color = JColorChooser.showDialog(this, "Choose a Color", Color.BLUE);
            // configura cor padrão se nenhuma cor for escolhida
            if (color == null) {
                color = Color.BLUE;
            }
            drawSpace.setColor(color);
        });

        // configura o botao decrease level para adicionar painel de controle 
        // e ouvinte registrado
        final JButton decreaseLevelJButton = new JButton("Decrease Level");
        controlJPanel.add(decreaseLevelJButton);
        decreaseLevelJButton.addActionListener(event -> {
            int level = drawSpace.getLevel();
            --level;
            // modifica o nível se possivel
            if((level >= MIN_LEVEL) && (level <= MAX_LEVEL)){
                levelJLabel.setText("Level: " + level);
                drawSpace.setLevel(level);
                repaint();
            }
        });

        // configura o botao increase level para adicionar painel de controle 
        // e ouvinte registrado
        final JButton increaseLevelJButton = new JButton("Increase Level");
        controlJPanel.add(increaseLevelJButton);
        increaseLevelJButton.addActionListener(event -> {
            int level = drawSpace.getLevel();
            ++level;
            // modifica o nível se possivel
            if((level >= MIN_LEVEL) && (level <= MAX_LEVEL)){
                levelJLabel.setText("Level: " + level);
                drawSpace.setLevel(level);
                repaint();
            }
        });

        controlJPanel.add(levelJLabel);

        // Cria mainJPanel para conter controlJPanel e drawSpace
        final JPanel mainJPanel = new JPanel();
        mainJPanel.add(controlJPanel);
        mainJPanel.add(drawSpace);

        add(mainJPanel);

        setSize(WIDTH, HEIGHT);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String... args) {
        new Fractal();
    }
}