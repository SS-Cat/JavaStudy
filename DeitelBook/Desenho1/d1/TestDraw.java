import javax.swing.JFrame;

/**
 * TestDraw
 */
public class TestDraw {

    public static void main(String[] args) {
        
        DrawPanel pnl = new DrawPanel();
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(pnl);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}