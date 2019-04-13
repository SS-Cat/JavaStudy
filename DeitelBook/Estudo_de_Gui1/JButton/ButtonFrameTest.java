import javax.swing.JFrame;

/**
 * LabelTest
 */
public class ButtonFrameTest {

    public static void main(String[] args) {
        
        ButtonFrame buttonFrame = new ButtonFrame();
        buttonFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        buttonFrame.setSize(275, 110);
        buttonFrame.setVisible(true);
    }
}