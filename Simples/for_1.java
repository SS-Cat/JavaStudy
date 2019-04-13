import java.util.Scanner;

public class for_1{
	public static void main(String[] args) {	// maior e menor numero digitado pelo usuario
		Scanner input = new Scanner(System.in);
		int n1;
		float v2 , maior =0, menor=1000;

		System.out.println("Quantos numeros quer inserir?");
		n1 = input.nextInt();

		for( int v1 = 0; v1 < n1; v1++){
			v2 = input.nextFloat();
			if(v2>maior){
				maior = v2;
			}
			if(v2 < menor){
				menor = v2;
			}
		}

		if (n1>maior) {
			maior = n1;
		}
		if (n1<menor) {
			menor = n1;
		}
		System.out.println(maior);
		System.out.println(menor);

	}
}