import java.util.Scanner;
import java.util.Calendar;

public class AnoDeNasc_PelaIdade {

	public static void main (String[] args) {
		Scanner ent = new Scanner(System.in);

		int ano_nasc;
		int ano_atual;
		int cal_idade;
		int idade;

		//pergunta idade, atribui a variavel 'idade' o proximo valor digitado pelo usuario.
		System.out.println("Qual sua Idade?");
		idade = ent.nextInt();

		//Cria um objeto calendar, atribui a variavel 'ano_atual' o valor do ano retirado da maquina pelo metado do objeto criado
		//faz calculo do ano de nascimento, subtraindo o ano atual pela idade dita pelo  usuario.
		Calendar calend = Calendar.getInstance();
		ano_atual = calend.get(Calendar.YEAR);
		ano_nasc = ano_atual - idade;

		System.out.printf("O ano que voce nasceu é " + ano_nasc + "\n");

		//fazendo tudo direto sem variaveis, perde legebilidade, e ganha "desempenho"
		System.out.printf("O ano que você nasceu eh " + (calend.get(Calendar.YEAR) - ent.nextInt()) + "\n");

	/*	Testes de aprendizagem
		Scanner ent = new Scanner(System.in);

		System.out.println(ent.nextInt());

		int numm;

		numm = ent.nextInt();
		System.out.println(numm);

		System.out.println("World?");*/
	}
}