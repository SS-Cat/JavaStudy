import java.util.Scanner;

public class Primo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int c;

		System.out.println("Digite um numero maximo, iremos avaliar quantos n�meros primos tem at� l�");
		c = input.nextInt();

		for ( int i = 1; i < c ; i++ ) {
			if(isPrimo(i)){
				System.out.println(i);
			}
		}
			

	}

	public static boolean isPrimo(int c) {
		for ( int i = 2 ; i < c ; i++ ) {
			int d = c % i;
			if (d == 0) {
				return false;
			}
		} return true;
	}

}

/*		for ( int i = 2 ; i < c ; i++ ) {
			int d = c % i;
			if (d == 0) {
				System.out.println("N�o � primo");
				break;
			}

		} System.out.println("� primo");
*/