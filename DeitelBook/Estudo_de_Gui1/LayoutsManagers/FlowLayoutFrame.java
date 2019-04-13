import java.awt.FlowLayout;
import java.awt.Container;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;

/**
 * FlowLayoutFrame
 */
public class FlowLayoutFrame extends JFrame{

    private JButton leftButton;
    private JButton centerButton;
    private JButton rigthButton;
    private FlowLayout layout;
    private Container container;

    public FlowLayoutFrame() {
        super("FlowLayout Demo");
        
        layout = new FlowLayout();
        container = getContentPane();
        setLayout(layout);

        leftButton = new JButton("Left");
        add(leftButton);
        leftButton.addActionListener(new ActionListener(){
        
            @Override
            public void actionPerformed(ActionEvent e) {
                layout.setAlignment(FlowLayout.LEFT);

                layout.layoutContainer(container);
            }
        });

        centerButton = new JButton("Center");
        add(centerButton);
        centerButton.addActionListener(new ActionListener(){
        
            @Override
            public void actionPerformed(ActionEvent e) {
                layout.setAlignment(FlowLayout.CENTER);

                layout.layoutContainer(container);
            }
        });

        rigthButton = new JButton("Rigth");
        add(rigthButton);
        rigthButton.addActionListener(new ActionListener(){
        
            @Override
            public void actionPerformed(ActionEvent e) {
                layout.setAlignment(FlowLayout.RIGHT);

                layout.layoutContainer(container);
            }
        });

    }

}