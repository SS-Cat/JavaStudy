import java.util.Scanner;

public class Caixa{

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Menu menu = new Menu();
		String s1;
		float v1, saque;
		int v2;

		System.out.println("Digite seu Nome, Digite o valor inicial da conta");
		s1 = input.nextLine();
		v1 = input.nextFloat();

		Conta c1 = new Conta(s1, v1);

		do{
			menu.menuMsg();
			v2 = input.nextInt();

			switch (v2) {
				case 1:
				menu.extrato(c1.getNome(), c1.getID(), c1.getV0Saldo(), c1.getTransacao() );
				break;
				case 2:
				System.out.println("Digite o valor de saque");
				saque = input.nextFloat();
				c1.setSaque(saque);
				System.out.println("Seu saldo é "+ c1.getV0Saldo());
				break;
				case 3:
				System.out.println("Digite o valor do deposito");
				saque = input.nextFloat();
				c1.setSaldo(saque);
				break;
				case 0:
				System.out.println("Saindo");
				default:
				System.out.println("Voce nao digitou um valor valido");
				
			}
		}while(v2 != 0);



		

	}

}