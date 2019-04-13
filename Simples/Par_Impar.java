import java.util.Scanner;

public class Par_Impar {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		float v1, v2;

		System.out.print("Escreva um numero, para sabermos se é par ou impar: ");
		v1 = input.nextFloat();
		v2 = v1 % 2;
		if (v2 == 0) {
			System.out.println("O numero eh par");
		} else {
			System.out.println("O numero eh impar");
		}
	}
}