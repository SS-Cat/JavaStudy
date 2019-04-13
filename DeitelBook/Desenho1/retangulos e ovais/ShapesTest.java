import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JLabel;

/**
 * ShapesTest
 */
public class ShapesTest {

    public static void main(String[] args) {
        //obtém a escolha do usuario
        String input = JOptionPane.showInputDialog(null,
            "Enter 1 to draw rectangles\n" + 
            "Enter 2 to draw ovals\n" +
            "Enter 3 to Cicles");

        int choice = Integer.parseInt(input.trim()); //converte a entrada em int

        //cria o painel com a entrada do usuário
        Shapes panell = new Shapes(choice);
        JFrame application = new JFrame();
        

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panell);
        application.setSize(300, 300);
        application.setVisible(true);
        
    }
}