import java.util.Scanner;

public class Cube {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		int v1, v2, count1, count2;
		count1 = 1;
		count2 = 1;

		System.out.println("Enter a number");
		v1 = input.nextInt();
		v2 = v1;

		while (count2 <= v2) {
			while (count1 <= v1) {
				if (count1 <= v1) {
					System.out.print("*");
				}
				count1++;
			}

			System.out.println("");
			count2++;
			count1 = 1;
		}
	}
}