import java.util.Scanner;

public class calcularIMC{

	public static void main (String[] args){

		Scanner ent = new Scanner(System.in);

		float peso;
		float altura;
		float imc;

		System.out.println("Digite seu peso e sua altura para calcular seu IMC");

		peso = ent.nextFloat();
		altura = ent.nextFloat();
		imc = peso / (altura * altura);

		System.out.printf("\n Seu IMC eh %.2f", imc);
	}
}