import java.util.Scanner;

public class aritimetica{

	public static void main(String[] args){

		Scanner ent = new Scanner(System.in);


		//faz a soma e subtração de dois numeros inteiros
		System.out.println("Digite dois numeros e deh enter");

		int one = ent.nextInt();
		int two = ent.nextInt();

		System.out.println("A soma eh " + (one + two));
		System.out.println("Jah a subtracao eh " + (one - two));

		//imprimindo valores com prinf
		 System.out.printf("\n A soma de %d + %d = %d\n", one, two, one + two);
		 System.out.printf("\n A Multiplicao de %d * %d = %d\n", one, two, one * two);
		 System.out.printf("\n A Divisao de %d por %d = %d\n", one, two, one / two);

		 //cortando numeros float em poucas casas
		 float um;
		 float dois;

		 System.out.println("Escreva mais dois números");
		 um = ent.nextFloat();
		 dois = ent.nextFloat();

		 System.out.printf("\n A divisao de %.2f por %.2f = %f \n melhor assim %.2f neh? \n", um, dois, um / dois, um / dois);
		 System.out.printf("\n E o modulo eh %.2f \n", um % dois);

 


		/* Operações Matemáticas em Computação
Primeiro, esqueça o 'x' como sinal de multiplicação, de agora em diante é '*'.
Segundo, divisão se representa com o '/'. Por exemplo, 4/2 = 2
Terceiro, tudo em computação é matemática.

Aliás, computação vem de computar, ou seja, contar.
Até quando você escreve em Java, a JVM(Java Virtual Machine) troca informações com sua máquina na forma de matemática (em bits).
Até as imagens, são divididas em pequenos blocos, são numerados e cada bloquinho é pintado com uma cor devidamente identificada.

Adivinhe como é essa identificação? Claro, por meio de números.
Ou achou que a máquina ia dividir em 'rosa emo', 'azul bebê' ou 'azul piscina'?*/

	}
}