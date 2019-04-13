import java.util.Scanner;

public class Matriz1{

	public static void exibeMatriz(int[][] Mat){

		System.out.println("\n A Matriz ficou: \n");
		for (int linha = 0 ; linha < Mat.length ; linha++ ) {
			for ( int coluna = 0 ; coluna < Mat[0].length ; coluna++ ) {
				System.out.printf("\t %d \t",Mat[linha][coluna]);
			}System.out.println();
		}
	}

	public static int[][] recebeMatriz(){
		Scanner input = new Scanner(System.in);
		int[][] matriz = new int[3][2];

		System.out.println("Matriz M[3][2]\n");

		for (int linha = 0;linha < matriz.length ;linha++ ) {
			for (int coluna = 0; coluna < matriz[0].length ;coluna++ ) {
				System.out.printf("Insira o elemento M[%d][%d]: ", linha+1,coluna+1);
				matriz[linha][coluna] = input.nextInt();
			}
		}//recebeMatriz()
		return matriz;
	}

	public static void main(String[] args) {
		//exibeMatriz();
		exibeMatriz(recebeMatriz());
	}

}