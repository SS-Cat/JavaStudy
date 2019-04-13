import java.util.Scanner;

public class animate {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		int entrada, v2, cEspacos, cAsterisco, cParteDeCima, cParteDeBaixo;


		System.out.println("Enter a number");
			entrada = input.nextInt();

		for(entrada = 1; entrada < 51; entrada+=2){
			v2 = entrada - 2;
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
			cAsterisco = (entrada -2);
			

			for (int n1 = cParteDeBaixo ; n1 >= 1  ; n1--) {
				for (int n2 = 1; n2 <= cEspacos ; n2++ ) {
					System.out.print(" ");
				}
				for (int n2 = 1; n2 <= cAsterisco ; n2++ ) {
					System.out.print("*");
				}
				System.out.println("");
				cEspacos++;
				cAsterisco-=2;

			}
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