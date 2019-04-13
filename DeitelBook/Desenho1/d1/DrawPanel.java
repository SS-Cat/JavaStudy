import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JPanel;

/**
 * DrawPanel 
 * classe que é um JPanel
 */
public class DrawPanel extends JPanel{

    private static final long serialVersionUID = 1L;
    private Random randomNumbers = new Random();
    private MyLine[] lines; // array de objetos MyLine

    public DrawPanel() {
        setBackground(Color.WHITE);

        lines = new MyLine[5 + randomNumbers.nextInt(5)]; // Cria tantas variaveis de tal objeto

        // cria coordenadas aleatorias
        for(int count = 0 ; count < lines.length ; count++ ){
            int x1 = randomNumbers.nextInt(300);
            int y1 = randomNumbers.nextInt(300);
            int x2 = randomNumbers.nextInt(300);
            int y2 = randomNumbers.nextInt(300);

            //gera uma cor aleatoria
            Color color = new Color(randomNumbers.nextInt(256),
            randomNumbers.nextInt(256), randomNumbers.nextInt(256) );

            //agora inicializa a variavel tal do array
            lines[count] = new MyLine(x1, y1, x2, y2, color);
        }
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);

        for (MyLine line : lines) {
            line.draw(g);
        }
    }
}