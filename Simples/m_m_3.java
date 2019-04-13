import java.util.Scanner;

public class m_m_3 {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		float v1, v2, v3;

		System.out.println("Escreva 3 valores, para colocarmos em ordem");
		v1 = input.nextFloat();
		v2 = input.nextFloat();
		v3 = input.nextFloat();

		if ((v1 > v2) && (v1 > v3)) {
			if (v2 > v3) {
				System.out.printf("Os valores em ordem decrescente sao: %.2f - %.2f - %.2f .\n", v1, v2, v3);
			} else {
				System.out.printf("Os valores em ordem decrescente sao: %.2f - %.2f - %.2f .\n", v1, v3, v2);
			}
		} else {
			if (v2 > v3) {
				if (v3 > v1) {
					System.out.printf("Os valores em ordem decrescente sao: %.2f - %.2f - %.2f .\n", v2, v3, v1);
				} else {
					System.out.printf("Os valores em ordem decrescente sao: %.2f - %.2f - %.2f .\n", v2, v1, v3);
				}
			} else {
				if (v2 > v1) {
					System.out.printf("Os valores em ordem decrescente sao: %.2f - %.2f - %.2f .\n", v3, v2, v1);
				} else {
					System.out.printf("Os valores em ordem decrescente sao: %.2f - %.2f - %.2f .\n", v3, v1, v2);
				}
			}
		}
	}
}