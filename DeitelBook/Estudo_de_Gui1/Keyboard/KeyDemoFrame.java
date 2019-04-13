import java.awt.Color;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import java.awt.event.InputEvent;

/**
 * KeyDemoFrame
 */
public class KeyDemoFrame extends JFrame implements KeyListener{

    private String line1 = "";
    private String line3 = "";
    private String line2 = "";

    private final JTextArea textArea;

    public KeyDemoFrame() {
        super("Demonstrating Keystroke Events");

        textArea = new JTextArea(10, 15);
        textArea.setText("Press any key on the keyboard...");
        textArea.setEnabled(false);
        textArea.setDisabledTextColor(Color.BLACK);
        add(textArea);

        addKeyListener(this);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        line1 = String.format("Key pressed: %s", KeyEvent.getKeyText(e.getKeyCode()));
        setLines2and3(e);
    }

    @Override
    public void keyReleased(KeyEvent e) {
        line1 = String.format("Key released: %s", KeyEvent.getKeyText(e.getKeyCode()));
        setLines2and3(e);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        line1 = String.format("Key typed: %s", KeyEvent.getKeyText(e.getKeyCode()));
        setLines2and3(e);
    }

    public void setLines2and3(KeyEvent e){
        line2 = String.format("This key is %san action key", (e.isActionKey()?"":"not "));

        String temp = KeyEvent.getModifiersExText(e.getModifiersEx());

        line3 = String.format("Modifier keys pressed: %s", (temp.equals("")? "none": temp));

        textArea.setText(String.format("%s\n%s\n%s\n", line1, line2, line3));
    }
}