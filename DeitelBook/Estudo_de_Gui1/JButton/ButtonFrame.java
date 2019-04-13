import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 * ButtonFrame
 */
public class ButtonFrame extends JFrame{

    private static final long serialVersionUID = 1L;
    private final JButton plainJButton;
    private final JButton fancyJButton;

    public ButtonFrame() {
        super("Testing Buttons");
        setLayout(new FlowLayout());

        plainJButton = new JButton("Plain Button");
        add(plainJButton);

        Icon image1 = new ImageIcon("C:\\Users\\Ivens\\Documents\\Java\\DeitelBook\\Estudo_de_Gui1\\JButton\\image1.jpg");
        Icon image2 = new ImageIcon("C:\\Users\\Ivens\\Documents\\Java\\DeitelBook\\Estudo_de_Gui1\\JButton\\image2.png");

        fancyJButton = new JButton("Fancy Button", image1);
        fancyJButton.setRolloverIcon(image2);
        add(fancyJButton);

        ButtonHandler buttonHandler = new ButtonHandler();
        plainJButton.addActionListener(buttonHandler);
        fancyJButton.addActionListener(buttonHandler);

    }

    private class ButtonHandler implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            
            JOptionPane.showMessageDialog(ButtonFrame.this, String.format("You pressed: %s",
             e.getActionCommand()));
        }
    }
}