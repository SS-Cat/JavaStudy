import java.util.Scanner;

public class Media2 {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);

		int v1, v2;
		float v3, v4, b1;
		v1 = 0;
		v4 = 0;

		System.out.println("Quantos alunos tem em sua turma?");
		v2 = input.nextInt();

		while (v1 != v2) {
			v1++;
			System.out.println("Digite um numero");
			v3 = input.nextFloat();
			v4 += v3;
		}

		b1 = v4 / v2;
		System.out.printf("A media eh %.2f \n ou %.2f/%d \n", b1, v4, v2);

	}
}