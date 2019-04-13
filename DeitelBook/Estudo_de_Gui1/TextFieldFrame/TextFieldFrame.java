import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;

/**
 * TextFieldFrame
 */
public class TextFieldFrame extends JFrame{

    private final JTextField textField1;
    private final JTextField textField2;
    private final JTextField textField3;
    private final JPasswordField passwordField1;

    public TextFieldFrame() {
        super("Testing JTextField and JPasswprdField");
        setLayout(new FlowLayout());

        textField1 = new JTextField(10);
        add(textField1);

        textField2 = new JTextField("Enter text here");
        add(textField2);

        textField3 = new JTextField("Uneditable text field", 21);
        textField3.setEditable(false);
        add(textField3);

        passwordField1 = new JPasswordField("Hidden text");
        add(passwordField1);

        TextFieldHandler handler = new TextFieldHandler();
        textField1.addActionListener(handler);
        textField2.addActionListener(handler);
        textField3.addActionListener(handler);
        passwordField1.addActionListener(handler);

    }

    private class TextFieldHandler implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            String string = " ";

            if(e.getSource() == textField1)
                string = String.format("textField1: %s", e.getActionCommand());

            else if(e.getSource() == textField2)
                string = String.format("textField2: %s", e.getActionCommand());

            else if(e.getSource() == textField3)
                string = String.format("textField3: %s", e.getActionCommand());

            else if(e.getSource() == passwordField1)
                string = String.format("passwordField1: %s", e.getActionCommand());

            JOptionPane.showMessageDialog(null, string);
        }
    }
}