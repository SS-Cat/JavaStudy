import javax.swing.JOptionPane;

public class Msg3{

	public static void main(String[] args) {
		
		String nome;
		nome = JOptionPane.showInputDialog("Digite um nome");	//Caida de dialogo que recebe string do usuario, e retorna string
		nome = String.format("Esse nome? " +nome);				//metodo do tipo string, que edita a string
		JOptionPane.showMessageDialog(null,nome);

		System.out.println(String.format("OOIII ?  " +nome));	//apenas um teste de logica sobre metodos.
	}
}