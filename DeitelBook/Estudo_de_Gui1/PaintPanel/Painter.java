import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * Painter
 */
public class Painter {

    public static void main(String[] args) {
        
        PaintPanel paintPanel = new PaintPanel();
        JFrame framePaint = new JFrame();

        framePaint.add(paintPanel, BorderLayout.CENTER);
        framePaint.add(new JLabel("Drag the mouse to draw"), BorderLayout.SOUTH);

        framePaint.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        framePaint.setSize(400, 200);
        framePaint.setVisible(true);

    }
}