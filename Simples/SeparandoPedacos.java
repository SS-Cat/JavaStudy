import java.util.Scanner;

public class SeparandoPedacos {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);


		String stg = scanner.nextLine();

		String[] pedacos = stg.split(" ");
		System.out.println(pedacos.length);

		for ( String palavra : pedacos ) {
			System.out.println(palavra);
		}

		String stg1 = new String("Ata");

		System.out.println(stg1);

		stg1 = "Btb";
		System.out.println(stg1);
	}
}