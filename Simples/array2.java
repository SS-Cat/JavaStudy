import java.util.Scanner;

public class array2 {

	public static void main(String[] args) {
		int[] nota = new int[3];
		Scanner input = new Scanner(System.in);

		//recebendo os numeros do array
		for ( int indice = 0; indice < nota.length ; indice++ ) {
			System.out.print("\nEntre com o número " + (indice + 1) + ": ");
			nota[indice] = input.nextInt();
		}

		//exibindo os numeros do array
		for( int indice=0; indice < nota.length ; indice++){
			System.out.printf("Número %d -> Valor armazenado: %d\n", indice+1 , nota[indice]);
		}

	}
}