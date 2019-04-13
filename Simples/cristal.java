import java.util.Scanner;

public class cristal {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		int entrada, cEspacos, cAsterisco, cParteDeCima, cParteDeBaixo;


		System.out.print("Digite um numero impar: ");
		entrada = input.nextInt(); 
		while(entrada%2==0){
			System.out.print("Este numero nao e impar, digite outro:");
			entrada = input.nextInt();
		}


		
		cEspacos = (entrada - 1) / 2;
		cAsterisco = 1;
		cParteDeCima = (entrada / 2) + 1;
		cParteDeBaixo = (entrada / 2);


		for (int n1 = 1; n1 <= cParteDeCima ; n1++) {	//parte de cima do cristal
			for (int n2 = 1 ; n2 <= cEspacos  ; n2++) {	// de acordo a logica, os espaços são sempre o numero digitado -1,
				System.out.print(" ");					//como foi a parte de cima, dividi por 2
			}											//para pular os espaços, dividi por 2 para ser a metade de cima,
			for (int n2 = 0 ; n2 < cAsterisco ; n2++) {			//e +1 para imprimir a casa do meio
				System.out.print("*");					//os astericos são sempre +2
			}

			System.out.println("");
			cEspacos--;
			cAsterisco += 2;
		}
		cEspacos = 1;
		cAsterisco = (entrada - 2);


		for (int n1 = cParteDeBaixo ; n1 >= 1  ; n1--) {
			for (int n2 = 1; n2 <= cEspacos ; n2++ ) {
				System.out.print(" ");
			}
			for (int n2 = 1; n2 <= cAsterisco ; n2++ ) {
				System.out.print("*");
			}
			System.out.println("");
			cEspacos++;
			cAsterisco -= 2;

		}
	}
}
/*
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *

*/