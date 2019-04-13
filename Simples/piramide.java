import java.util.Scanner;

public class cristal {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		int v1, v2, v3, v4;

		System.out.println("Enter a number");
		v1 = input.nextInt();
		v2 = v1 - 1;
		v3 = 1;

		for (int n1 = 1; n1 <= v1 ; n1++) {
			for (int n2 = 1 ; n2 <= v2  ; n2++) {
				System.out.print("1");
				System.out.println(n2);
			}
			for (int n3 = 0 ; n3 < v3 ; n3++) {
				System.out.print("*");
				System.out.println(n3);
			}
			System.out.println(v2);
			System.out.println(v3);
			System.out.println("");
			v2--;
			v3+=2;
		}

	}
}
/*
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *

*/