import javax.swing.JOptionPane;

public class SomaMsg {

	public static void main(String[] args) {

		String valor, resultado;
		int n1, n2;


		valor = JOptionPane.showInputDialog("Digite um valor"); //recebe uma string(mesmo q numero)
		n1 = Integer.parseInt(valor.trim()); // o metodo transforma a string em int(e o metodo na string, retira os espaçõs antes e depois)

		valor = JOptionPane.showInputDialog("Digite um valor");
		n2 = Integer.parseInt(valor.trim());

		resultado = String.format("Resultado da Soma: %d", n1 + n2);// da valor a string, com um formato
		JOptionPane.showMessageDialog(null, resultado); //caixa de diálogo mostrando resultado

		// Se fosse float, o metodo para transformar string em float é :
		// Float.parseFloat();
		// Double.parseDouble();  para double


	}


}