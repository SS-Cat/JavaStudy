import javax.swing.JFrame;
import javax.swing.JPanel;

public class framesPanels{

	public static void main(String[] args) {
		JFrame janela = new JFrame("Janela 1");
		Painel meuPainel = new Painel();

		janela.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
		janela.add(meuPainel);
		janela.setSize(600,400);		
		janela.setVisible(true);

	}	
}