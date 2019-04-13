import java.util.Scanner;

public class menu1{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean continuee = true;
		int ve;

		do{
			System.out.println("\t\tMenu de Opções do rpg");
			System.out.println("\t1.Itens");
			System.out.println("\t2.Armas");
			System.out.println("\t3.Armaduras");
			System.out.println("\t4.Escudos");
			System.out.println("\t5.Arcos");
			System.out.println("\t0.Quit");

			System.out.println("Insira sua Opção: ");
			ve = input.nextInt();

			if ( ve == 0 ){
				continuee = false;
				System.out.println("Menu fechado");
			}else{
				System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
			}
		}while(continuee);
	}
}