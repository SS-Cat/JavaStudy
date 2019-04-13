import javax.swing.JFrame;

/**
 * BorderLayoutDemo
 */
public class BorderLayoutDemo {
    public static void main(String[] args) {
        
        BorderLayoutFrame borderFrame = new BorderLayoutFrame();
        borderFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        borderFrame.setSize(300, 200);
        borderFrame.setVisible(true);
    }
}