import javax.swing.JFrame;

/**
 * TextFieldTest
 */
public class TextFieldTest {

    public static void main(String[] args) {
        
        TextFieldFrame textField = new TextFieldFrame();
        textField.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        textField.setSize(350, 100);
        textField.setVisible(true);
    }
}