import java.util.Scanner;
import java.util.Calendar;

public class IdadePorAnoDeNasc {

	public static void main (String[] args) {

		Scanner ent = new Scanner(System.in);
		Calendar calend = Calendar.getInstance();

		int idade;
		int anoNasc;
		int mesNasc;
		int diaNasc;
		char as;

		int ano_atual = calend.get(Calendar.YEAR);
		int mes = calend.get(Calendar.MONTH);
		int dia = calend.get(Calendar.DAY_OF_MONTH);

		System.out.println("Qual ano que você nasceu?");
		anoNasc = ent.nextInt();
		idade = ano_atual - anoNasc ;
		System.out.printf("Sua idade eh " + idade + "?\n Vamos ter Certeza\n");
		as = ent.next().charAt(0);
		if ((as == 's') || (as == 'S')){

		System.out.printf("Qual mês você nasceu?");
		mesNasc = ent.nextInt();

		System.out.printf("Qual dia você nasceu?");
		diaNasc = ent.nextInt();


		if ((mesNasc < mes) && (diaNasc < dia))
			System.out.printf("Sua idade eh " + idade + " mesmo!!!");
		else
			System.out.printf("Errei, sua idade eh " + (idade - 1) + "\n");


		}else{
			System.out.println("nouca");
		}
	}
}