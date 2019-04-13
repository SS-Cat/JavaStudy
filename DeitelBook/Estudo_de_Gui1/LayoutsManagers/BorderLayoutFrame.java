import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 * BorderLayoutFrame
 */
public class BorderLayoutFrame extends JFrame implements ActionListener{

    private JButton[] buttons;
    private static final String[] names = {"Hide North", "Hide South", "Hide East",
        "Hide West", "Hide Center"};
    private static final String[] indexx = {BorderLayout.NORTH, BorderLayout.SOUTH,
        BorderLayout.EAST, BorderLayout.WEST, BorderLayout.CENTER};
    private final BorderLayout layout;

    private final JPanel panel;
    private final JButton[] buttons2;

    public BorderLayoutFrame() {
        super("BorderLayout Demo");

        layout = new BorderLayout(5, 5);
        setLayout(layout);
        buttons = new JButton[names.length];

        for(int count = 0; count < names.length; count++){

            buttons[count] = new JButton(names[count]);
            buttons[count].addActionListener(this);
            add(buttons[count], indexx[count]);
        }

        buttons2 = new JButton[5];
        panel = new JPanel(new GridLayout(1, buttons2.length));

        for(int count = 0; count < names.length; count++){
            buttons2[count] = new JButton("Button" + (count + 1));
            buttons2[count].addActionListener(this);
        }

        add(panel, BorderLayout.SOUTH);
    }

    @Override
        public void actionPerformed(ActionEvent e){

            for(JButton button : buttons){
                
                if(e.getSource() == button)
                    button.setVisible(false);
                else
                    button.setVisible(true);
            }



            layout.layoutContainer(getContentPane());
        }
    
}