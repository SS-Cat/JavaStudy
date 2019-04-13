public class Fazendinhaa {
	public static void main(String[] args) {
		Vaca mimosa	= new Vaca();
		Gato mew = new Gato();
		Carneiro carneirim = new Carneiro();

		Animais[] bichos = {mimosa, mew, carneirim};

		for (Animais animais : bichos) {
			System.out.print(animais.nome + " é da classe " + animais.getClass().getName() + ", tem " + animais.numeroPatas + " patas e faz ");

			//System.out.print(animal.nome + " é da classe " + animal.getClass().getName() + ", tem " + animal.numeroPatas + " patas e faz ");

			animais.som();
			System.out.println();
		}


	}
}