import java.util.Scanner;

public class Ponto {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int v1, v2, v3;
		System.out.println("Digite a hora,minuto e segundos de entrada");
		v1 = input.nextInt();
		v2 = input.nextInt();
		v3 = input.nextInt();
		Hora horaChegada = new Hora(v1, v2, v3);
		
		System.out.println("Digite a hora,minuto e segundos de entrada");
		v1 = input.nextInt();
		v2 = input.nextInt();
		v3 = input.nextInt();
		Hora horaSaida = new Hora(v1, v2, v3);

		Funcionario Renato = new Funcionario("Renato", horaChegada, horaSaida);

		System.out.println("Hora de Chegada: " +horaChegada);
		System.out.println("Hora de Saida: " +horaSaida);
		System.out.printf("Horas trabalhadas: %.1f\n", Renato.getHorasTrabalhadas());

	}
}