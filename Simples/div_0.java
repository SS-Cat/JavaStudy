import java.util.Scanner;

public class div_0{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		float v1, v2;

		System.out.println("Digite dois numeros para fazer a divisao");
		v1 = input.nextInt();
		v2 = input.nextInt();

		while(v2 == 0){
			System.out.println("Digite algo diferente de zero no segundo numero");
			v2 = input.nextInt();
		}

		System.out.println("O resultado da divisao eh "+ (v1/v2));

	}
}