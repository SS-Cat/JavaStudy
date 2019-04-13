import javax.swing.JOptionPane;
import java.util.Scanner;

public class Msg2{

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String s1;
		System.out.println("Digite algo para sair na caixa de mensagem de dialogo");
		s1 = input.nextLine();
		JOptionPane.showMessageDialog(null,s1);
	}
}