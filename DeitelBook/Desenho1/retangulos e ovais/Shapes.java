import java.awt.Graphics;
import javax.swing.JPanel;

/**
 * Shapes
 */
public class Shapes extends JPanel{

    private static final long serialVersionUID = 1L;
    private int choice; // escolha do usúario de qual forma desenhar

    //constructor configura a escolha do usuario
    public Shapes(int userChoice){
        choice = userChoice;
    }

    //desenha uma cascata de formas que iniciam do canto superior esquerdo
    public void paintComponent( Graphics g ){
        super.paintComponent(g);
        
        for ( int i = 0; i<14 ; i++ ){
            //seleciona a forma com base na escolha
            switch (choice) {
                case 1: // desenha retângulos
                    g.drawRect(10 + i * 10, 10 + i * 10, 
                    50 + i * 10, 50 + i * 10);
                    break;

                case 2: // desenha elipses
                    g.drawOval(10 + i * 10, 10 + i * 10,
                     50 + i * 10, 50 + i * 10);
                     break;

                case 3: 
                    int tamanho = 10 + i * 10;
                    g.drawOval((getWidth() - tamanho)/2, (getHeight() - tamanho)/2,
                    tamanho, tamanho);
                break;
            
            }
        }
    }
}