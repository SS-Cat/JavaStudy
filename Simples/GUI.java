import javax.swing.JFrame;
import javax.swing.JLabel;

public class GUI {
	public static void main(String[] args) {
		//Rotulo label1 = new Rotulo("Haaa");
		JFrame label1 = new JFrame("Haa");
		JLabel texto = new JLabel("Meu primeiro JLabel!");

		label1.add(texto);

		label1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		label1.setSize(300,100);
		label1.setVisible(true);


	}
}

