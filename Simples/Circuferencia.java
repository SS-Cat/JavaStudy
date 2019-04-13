import java.util.Scanner;
import java.lang.Math.*;

public class Circuferencia {
	public static void main(String[]args) {

		Scanner input = new Scanner(System.in);
		float r;

		System.out.println("Digite a valor do raio");
		r = input.next();

		System.out.println("O diametro da circuferencia eh " + (r * 2));
		System.out.printf("A area da circuferencia eh %.2f \n", Math.PI * 2 * r);
		System.out.printf("O perimetro da circuferencia eh %.2f\n", Math.PI * r * r);

	}
}