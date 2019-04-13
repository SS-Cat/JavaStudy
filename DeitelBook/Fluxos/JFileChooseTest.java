import java.io.IOException;
import javax.swing.JFrame;

/**
 * JFileChooseTest
 */
public class JFileChooseTest {

    public static void main(String[] args) throws IOException{
        JFileChooseDemo application = new JFileChooseDemo();
        application.setSize(400, 400);
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.setVisible(true);
    }
}