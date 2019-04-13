import java.util.Scanner;

public class FirstClass{

	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Aluno balinha = new Aluno();
		Aluno pirulito;
		pirulito = new Aluno();
		Aluno2 azedinha = new Aluno2();
		Aluno2 PeDeMoca = new Aluno2("maria",12,43);

		String nome;
		double n1;
		double n2;

		pirulito.Aluno3();

		nome = input.nextLine();
		n1 = input.nextDouble();
		n2 = input.nextDouble();

		Aluno cocada = new Aluno(nome, n1, n2);

		System.out.println(cocada.nome);
		System.out.println(cocada.notaMath);
		System.out.println(cocada.notaFis);
		System.out.println(cocada.media);



		System.out.println(balinha.nome);
		System.out.println(balinha.notaMath);
		System.out.println(balinha.notaFis);

		System.out.print("Digite o nome: ");
		balinha.nome = input.nextLine();
		System.out.print("Digite as notas de Math e Fis: ");
		balinha.notaMath = input.nextDouble();
		balinha.notaFis = input.nextDouble();

		System.out.println(balinha.nome);
		System.out.println(balinha.notaMath);
		System.out.println(balinha.notaFis);		

		System.out.printf("O aluno \"%s\" tirou %2.2f em Matematica, " 
			+ "%2.2f em Fisica e obteve media de %2.2f\n", balinha.nome, balinha.notaMath, balinha.notaFis, 
			(balinha.notaMath + balinha.notaFis)/2);
	}
}