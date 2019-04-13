

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Rotulo extends JFrame{
	private JLabel texto;
		
	public Rotulo(String c){
		super(c);
		
		texto = new JLabel("Meu primeiro JLabel!");
		add(texto);
	}
}

