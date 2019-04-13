import java.util.Scanner;

public class foreach1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int[] numero = new int[5];
		int soma = 0;

		for ( int cont = 0; cont < numero.length ; cont++) {
			System.out.print("Entre com o número " + (cont + 1) + ": ");
			numero[cont] = input.nextInt();
		}

		//exibindo e somando
		for(int cont : numero){
			System.out.println(cont);
			soma += cont;
		}

		System.out.println("A soma dos números que você digitou foi: " + soma);
	}
}