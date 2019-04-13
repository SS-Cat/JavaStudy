import java.util.Scanner;

public class Invert{
	
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);

		int c, d, e, f;

		System.out.println("Digite um numero");
		c = input.nextInt();

		d = c % 10;
		System.out.println(d);

		e = (c/10)%10;
		System.out.println(e);

		f = ((c/10)/10)%10;
		System.out.println(f);

		System.out.println(d+""+e+""+f);

	}
}