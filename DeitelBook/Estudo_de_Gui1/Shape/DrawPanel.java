import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * DrawPanel
 */
public class DrawPanel extends JPanel{

    MyShape[] shapes;
    int shapeCount;
    int shapeType;
    MyShape currentShape;
    Color currentColor;
    boolean filledShape;
    JLabel statusLabel;

    public DrawPanel() {
        super();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
    }
}