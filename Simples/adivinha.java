import java.util.Scanner;
import java.util.Random;

public class adivinha {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		Random r_gen = new Random();

		int v1, v2, count;
		v1 = r_gen.nextInt(10) + 1;
		count = 1;

		System.out.print("Adivinhe qual número entre 1 e 10 o pc escolheu: ");
		v2 = input.nextInt();

		while (v2 != v1) {
			if (v2 > v1) {
				System.out.println("Digite um valor menor");
				v2 = input.nextInt();
			} else {
				System.out.println("Digite um valor maior");
				v2 = input.nextInt();
			}
			count++;
		}
		System.out.printf("Parabens, voce acertou, a valor realmente eh %d , seu numero de tentativas foi %d .\n", v1, count);
	}
}
