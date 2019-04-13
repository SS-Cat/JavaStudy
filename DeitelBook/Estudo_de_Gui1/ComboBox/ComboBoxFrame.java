import java.awt.FlowLayout;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 * ComboBoxFrame
 */
public class ComboBoxFrame extends JFrame{

    private static final long serialVersionUID = 1L;
    private final JComboBox<String> imagesJComboBox;
    private final JLabel label;

    private static final String[] names = {"cas.png", "cir.png", "sat.png", "sub.png"};
    private final Icon[] icons = {
        new ImageIcon( "cas.png" ),
        new ImageIcon( "cir.png" ),
        new ImageIcon( "sat.png" ),
        new ImageIcon( "sub.png" )
    };
    
    public ComboBoxFrame() {
        super("Testing JComboBox");
        setLayout(new FlowLayout());

        imagesJComboBox = new JComboBox<String>(names);
        imagesJComboBox.setMaximumRowCount(3);

        add(imagesJComboBox);
        label = new JLabel(icons[0]);
        add(label);
        
        imagesJComboBox.addItemListener(e -> {
                if(e.getStateChange() == ItemEvent.SELECTED)
                    label.setIcon(icons[imagesJComboBox.getSelectedIndex()]);
        });
    }
}