import java.util.Scanner;

public class LeChar{
	public static void main(String[] args){
		Scanner ent = new Scanner(System.in);
		
		char af;					//variavel char(string de 1 valor?uma letra?um numero?).
		boolean bola;				//variavel booleana, valor verdadeiro ou falso.

		System.out.println("Escreva Sim ou Nao");
		af = ent.nextLine().charAt(0);			//Lê apenas a primeira letra digitada pelo usuario e armazena a variavel af.
		System.out.println(af);

		if((af == 's') ||(af == 'S')){			//Se a Variavel tiver o mesmo valor de 83 ou 115, que são o 's' e 'S'.
			System.out.println("Voce aceitou");
			bola = true;
		}
		else{
			System.out.println("Voce Negou");
			bola = false;
		}
		System.out.println(bola);

	}
}