import java.util.Scanner;

public class array1 {

	public static void main(String[] args) {

		float[] notas = new float[4];
		String nome;
		Scanner input = new Scanner(System.in);

		System.out.print("Nome do Aluno: ");
		nome = input.nextLine();

		System.out.print("Primeira Nota: ");
		notas[0] = input.nextFloat();

		System.out.print("Segunda Nota: ");
		notas[1] = input.nextFloat();

		System.out.print("Terceira Nota: ");
		notas[2] = input.nextFloat();

		notas[3] = (notas[0] + notas[1] + notas[2]) / (notas.length - 1 );

		System.out.printf("O Aluno %s tirou as notas %.1f, %.1f e %.1f, obtendo média final de %.2f", nome, notas[0], notas[1], notas[2], notas[3]);

	}
}