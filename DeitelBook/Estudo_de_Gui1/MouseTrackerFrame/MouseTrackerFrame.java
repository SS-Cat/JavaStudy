import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.plaf.basic.BasicTabbedPaneUI.MouseHandler;
import javax.swing.JLabel;

/**
 * MouseTrackerFrame
 */
public class MouseTrackerFrame extends JFrame{

    private final JPanel mousePanel;
    private final JLabel statusBar;

    public MouseTrackerFrame() {
        super("Demonstrating Mouse Events");

        mousePanel = new JPanel();
        mousePanel.setBackground(Color.WHITE);
        add(mousePanel, BorderLayout.CENTER);

        statusBar = new JLabel("Mouse outside JPanel");
        add(statusBar, BorderLayout.SOUTH);

        MouseHandler handler = new MouseHandler();
        mousePanel.addMouseListener(handler);
        mousePanel.addMouseMotionListener(handler);
    }

    private class MouseHandler implements MouseListener, MouseMotionListener{
        
        @Override
        public void mouseClicked(MouseEvent e) {
            statusBar.setText(String.format( "Clicked at [%d, %d]", e.getX(), e.getY() ));
        }

        @Override
        public void mousePressed(MouseEvent e) {
            statusBar.setText(String.format( "Pressed at [%d, %d]", e.getX(), e.getY() ));
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            statusBar.setText(String.format( "Released at [%d, %d]", e.getX(), e.getY() ));
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            statusBar.setText(String.format( "Mouse entered at [%d, %d]", e.getX(), e.getY() ));
            mousePanel.setBackground(Color.GREEN);
        }

        @Override
        public void mouseExited(MouseEvent e) {
            statusBar.setText("Mouse outside JPanel");
            mousePanel.setBackground(Color.WHITE);
        }

        @Override
        public void mouseDragged(MouseEvent e) {
            statusBar.setText(String.format( "Dragged at [%d, %d]", e.getX(), e.getY() ));
        }

        @Override
        public void mouseMoved(MouseEvent e) {
            statusBar.setText(String.format( "Moved at [%d, %d]", e.getX(), e.getY() ));
        }
    }
}