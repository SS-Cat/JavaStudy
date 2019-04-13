import java.util.concurrent.ExecutionException;

import javax.swing.JLabel;
import javax.swing.SwingWorker;

/**
 * BackgroundCalculator
 */
public class BackgroundCalculator extends SwingWorker<Long, Object> {

    private final int n;    // Número de Fibonacci a calcular
    private final JLabel resultLabel;   // JLabel para exibir o resultado

    public BackgroundCalculator(int n, JLabel resultLabel) {
        this.n = n;
        this.resultLabel = resultLabel;
    }
    
    // código de longa duração para ser executado em uma thread trabalhadora
    @Override
    protected Long doInBackground() throws Exception {
        return fibonacci(n);
    }

    // código a ser executado na thread de despacho de eventos quando doInBackground retorna
    @Override
    protected void done() {
        try {
            resultLabel.setText(get().toString());
        } catch (InterruptedException e) {
            resultLabel.setText("Interrupted while waiting for results.");
        } catch (ExecutionException e) {
            resultLabel.setText("Error encountered while perfoming calculation.");
        }
    }

    // método fibonacci recursivo; calcula o enésimo número de Fibonacci
    public long fibonacci (long number) {
        if (number == 0 || number == 1)
            return number;
        else 
            return fibonacci(number - 1) + fibonacci(number - 2);
    }
}