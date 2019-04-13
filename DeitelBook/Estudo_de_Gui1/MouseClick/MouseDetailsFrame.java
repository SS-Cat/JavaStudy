import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * MouseDetailsFrame
 */
public class MouseDetailsFrame extends JFrame{

    private String details;
    private final JLabel statusBar;

    public MouseDetailsFrame() {
        super("Mouse clicks and buttons");

        statusBar = new JLabel("Click the mouse");
        add(statusBar, BorderLayout.SOUTH);
        addMouseListener(new MouseClickHandler());
    }

    private class MouseClickHandler extends MouseAdapter{

        @Override
        public void mouseClicked(MouseEvent e) {
            int xPos = e.getX();
            int yPos = e.getY();

            details = String.format("Clicked %d time(s)", e.getClickCount());

            if(e.getButton() == MouseEvent.BUTTON3)//botao direito do mouse
                details += "with rigth mouse button";
            else if(e.getButton() == MouseEvent.BUTTON2)//botao do meio do mouse
                details += "with center mouse button";
            else
                details += "with left mouse button";

            statusBar.setText(details);

        }
    }
}