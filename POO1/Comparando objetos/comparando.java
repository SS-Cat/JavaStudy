import java.util.Arrays;

public class comparando {
	public static void main(String[] args) {

		Carros[] carro = {
			new Carros(1974, "Fusca"),
			new Carros(2014, "Hilux"),
			new Carros(2000, "Uno"),
			new Carros(1998, "Gol")
		};

		Arrays.sort(carro);
		for (Carros car : carro ) {
			System.out.println(car.getNome() + "\t" + car.getAno());
		}
	}
}