import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

/**
 * MultipleSelectionList
 */
public class MultipleSelectionList extends JFrame{

    private final JList<String> colorJList; // lista para armazenar nomes de cor
    private final JList<String> copyJList; // lista para armazenar nomes copiados
    private JButton copyJButton; // botão para copiar nomes selecionados
    private static final String[] colorNames = {"Black", "Blue", "Cyan",
    "Dark Gray", "Gray", "Green", "Light Gray", "Magenta", "Orange",
    "Pink", "Red", "White", "Yellow"};

    public MultipleSelectionList() {
        super("Multiple Selection Lists");
        setLayout(new FlowLayout());

        colorJList = new JList<String>(colorNames);
        colorJList.setVisibleRowCount(5);
        colorJList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        add(new JScrollPane(colorJList));

        copyJButton = new JButton("Copy >>>");
        copyJButton.addActionListener(new ActionListener(){
        
            @Override
            public void actionPerformed(ActionEvent e) {
                copyJList.setListData(colorJList.getSelectedValuesList().toArray(new String[0]));
            }
        });

        add(copyJButton);

        copyJList = new JList<String>();
        copyJList.setVisibleRowCount(5);
        copyJList.setFixedCellWidth(100);
        copyJList.setFixedCellHeight(15);
        copyJList.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        add(new JScrollPane(copyJList));
    }
}
