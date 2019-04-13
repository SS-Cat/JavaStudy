import java.util.Scanner;

public class fatorial {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // n*(n-1)*(n-2)...*3*2*1

		int n1 = 1, n2 = 1, n3 = 1;
		int v1 = 1, v2 = 1, v3 = 1;

		System.out.println("Enter a Number");
		n1 = input.nextInt();
		n2 = n1;
		v1 = n1;

		do {
			System.out.print("(" + n2 + ")*");
			n3 *= n2;
			n2 = n2 - 1;
			v1--;
		} while (v1 >= 1);
		System.out.println("\n" + n3);

	}
}