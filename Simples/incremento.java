import java.util.Scanner;

public class incremento {
	public static void main(String[]args) {

		Scanner input = new Scanner(System.in);
		int a = 1, b = 1;
		System.out.println("Valor de a" + a);
		System.out.println("Valor de b" + b);
		a++;
		b--;
		System.out.printf("\nNovo valor de a: %d", a);
		System.out.printf("\nNovo valor de b: %d", b);
		a++;
		b--;
		System.out.printf("\n%d", a);
		System.out.printf("\n%d", b);
		++a;
		--b;
		System.out.printf("\n%d", a);
		System.out.printf("\n%d\n", b);

		System.out.println("Valor de a:" + a + "\ne o valor de b:" + b);
		System.out.println("O valor de a+=b: " + (a += b));
		System.out.println("O valor de a-=b: " + (a -= b));
		System.out.println("O valor de a*=b: " + (a *= b));
		System.out.println("O valor de a/=b: " + (a /= b));
		System.out.println("O valor de a%=b: " + (a %= b));

		a = 1;
		b = 1;
		System.out.println("agora colando valores com 1, mostrando oq ocorre com o incremento e o decremento antes e depois\n valores: " + a + " " + b );
		a = b++;
		System.out.println("A é igual aaa? \n isso: " + a + " e b:" + b);
		a = ++b;
		System.out.println("E agora?Qual valor?\n Esse: " + a + " e b:" + b);
	}
}