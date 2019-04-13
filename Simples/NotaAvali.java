import java.util.Scanner;

public class NotaAvali {

	public static void main(String[]args) {

		Scanner inp = new Scanner(System.in);

		float nota;

		System.out.printf("\nEscreva sua nota\n");
		nota = inp.nextFloat();

		if ((nota <= 10) && (nota >= 0)) {
			System.out.println("Nota valida");// exercicio com if aninhanhado (nested) 

			if (nota>=7){
				System.out.println("Passou");//se for menor que 10 e maior que 0, e se for maior ou igual a 7, passa
			}
			else{
				if (nota >=5){
					System.out.println("Recuperacao");//se não for maior que sete, é menor, e se for maior ou igual a cinco, recuperação
				}
				else{
					System.out.println("reprovado");}//se não for maior que cinco, é menor, logo reprovado
				}
		}else{
			System.out.println("Nota invalida");//lembre-se de sempre colocar os parantenses, para o java entender os comandos aninhados.
		}


	}
}