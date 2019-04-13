import java.util.Scanner;

public class Maior {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);

		float count, v1, v2, v3, v4;
		count = 0;
		v2 = 0;
		v3 = 0;
		v4 = 0;

		while (count < 10) {
			System.out.println("Enter a number");
			v1 = input.nextFloat();
			if (v1 > v2){
				v3 = v2;
				v2 = v1;
			}
			if(v3>v4)
				v4 = v3;

			count++;
		}

		System.out.println("the largest number is "+v2+" and the second largest is "+v4);
	}
}