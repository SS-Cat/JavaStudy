import java.util.Scanner;

public class whileee2 {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);

		int v1, count1, count2;
		count1 = 0;
		count2 = 1;

		System.out.println("Digite um numero");
		v1 = input.nextInt();

		while ((count1 <= v1) || (count2 <= v1)){
			System.out.println(count1+" "+count2);
			count1+=2;
			count2+=2;

		}

	}
}