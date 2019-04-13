import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

/**
 * FibonacciNumbers
 */
public class FibonacciNumbers extends JFrame{

    // componentes para calcular o número de Fibonacci inserido pelo usuário
    private final JPanel workerJPanel = new JPanel(new GridLayout(2, 2, 5, 5));
    private final JTextField numberJTextField = new JTextField();
    private final JButton goJButton = new JButton("Go");
    private final JLabel fibonacciJLabel = new JLabel();

    // componentes e variáveis para obter o próximo número de Fibonacci
    private final JPanel eventThreadJPanel = new JPanel(new GridLayout(2, 2, 5, 5));
    private long n1 = 0;
    private long n2 = 1;
    private long count = 1;
    private final JLabel nJLabel = new JLabel("Fibonacci of 1: ");
    private final JLabel nFibonacciJLabel = new JLabel(String.valueOf(n2));
    private final JButton nextNumberJButton = new JButton("Next Number");

    public FibonacciNumbers() {
        super("Fibonacci Numbers");
        setLayout(new GridLayout(2, 1, 10, 10));

        // adiciona componentes GUI ao painel SwingWorker
        workerJPanel.setBorder(new TitledBorder(new LineBorder(Color.BLACK), "With SwingWorker"));
        workerJPanel.add(new JLabel("Get Fibonacci of:"));
        workerJPanel.add(numberJTextField);
        goJButton.addActionListener(new ActionListener(){
        
            @Override
            public void actionPerformed(ActionEvent e) {
                int n;

                try {
                    // recupera a entrada do usuário como int
                    n = Integer.parseInt(numberJTextField.getText());
                } catch (NumberFormatException ex) {
                    fibonacciJLabel.setText("Enter an integer.");
                    return;
                }

                // indica que o cálculo começou
                fibonacciJLabel.setText("Calculating...");

                // cria uma tarefa para realizar o cálculo em segundo plano
                new BackgroundCalculator(n, fibonacciJLabel).execute();
                // task.execute();
            }
        });

        workerJPanel.add(goJButton);
        workerJPanel.add(fibonacciJLabel);

        // adiciona componentes GUI ao painel da thread de despacho de eventos
        eventThreadJPanel.setBorder(new TitledBorder(new LineBorder(Color.BLACK), "Without SwingWorker"));
        eventThreadJPanel.add(nJLabel);
        eventThreadJPanel.add(nFibonacciJLabel);
        nextNumberJButton.addActionListener(new ActionListener(){
        
            @Override
            public void actionPerformed(ActionEvent e) {
                // cálcula o número de fibonacci após n2
                long temp = n1 + n2;
                n1 = n2;
                n2 = temp;
                ++count;

                // exibe o próximo número de Fibonacci
                nJLabel.setText("Fibonacci of " + count + ": ");
                nFibonacciJLabel.setText(String.valueOf(n2));
            }
        });

        eventThreadJPanel.add(nextNumberJButton);

        this.add(workerJPanel);
        this.add(eventThreadJPanel);
        setSize(275, 200);
        setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new FibonacciNumbers();
    }

}