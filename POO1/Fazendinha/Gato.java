public class Gato extends Animais {
	public Gato() {
		this.nome = "Bichano";
		this.numeroPatas = 4;

	}

	@Override
	public void som() {
		System.out.print("MEOW! :3");
	}

}