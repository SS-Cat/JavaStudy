import java.util.Scanner;

public class for_2{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int v1, v3 = 1, v4 = 1;

		System.out.println("Enter a Number");
		v1 = input.nextInt();

		for( int v2 = 1; v2 <= v1; v2++){
			if(v2 % 2 == 0)
				v3 *= v2;
			else
				v4 *= v2;
		}
		System.out.println(v3);
		System.out.println(v4);
	}
}