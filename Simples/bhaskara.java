import java.util.Scanner;

public class bhaskara {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		float a , b, c,
		      delta,
		      sqrtdelta,
		      x1, x2;

		System.out.println("Vamos calcular uma equacao do segundo grau");

		System.out.println("Escreva A, B e C");
		a = input.nextFloat();
		b = input.nextFloat();
		c = input.nextFloat();
		System.out.println(a + "-" + b + "-" + c);

		if (a != 0) {

			delta = (b * b) - (4 * a * c);
			sqrtdelta = (float)Math.sqrt(delta);
			System.out.println(delta);

			if (delta > 0) {
				x1 = (-b + sqrtdelta) / (2 * a);
				x2 = (-b - sqrtdelta) / (2 * a);
				System.out.printf("\n deu os valores %.2f e %.2f", x1, x2);
			} else {
				delta = -delta;
				sqrtdelta = (float)Math.sqrt(delta);
				System.out.println(sqrtdelta);
				System.out.printf("\nO valor de x1 é %.2f +i* %.2f", (-b) / (2 * a), (sqrtdelta) / (2 * a));
				System.out.printf("\nO valor de x2 é %.2f -i* %.2f", (-b) / (2 * a), (sqrtdelta) / (2 * a));
			}
		}
	}
}