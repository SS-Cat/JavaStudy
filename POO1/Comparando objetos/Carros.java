public class Carros implements Comparable {
	private int ano = 0;
	private String nome;

	public Carros(int ano, String nome) {
		this.ano = ano;
		this.nome = nome;
	}

	public int compareTo(Object o) {
		Carros car = (Carros) o;

		if (getAno() > car.getAno()) {
			return 1;
		} else {
			if (getAno() < car.getAno()) {
				return -1;
			} else {
				return 0;
			}
		}
	}

	public int getAno() {
		return ano;
	}

	public String getNome() {
		return nome;
	}
}