public class Hora {

	private int horas, minutos, segundos;

	public Hora(int horas, int minutos, int segundos) {
		if (horas > 0 && horas < 24)
			this.horas = horas;
		else
			throw new IllegalArgumentException("Hora inválida");

		if (minutos > 0 && minutos < 60)
			this.minutos = minutos;
		else
			throw new IllegalArgumentException("Minutos inválidos");

		if(segundos > 0 && segundos < 60)
			this.segundos = segundos;
		else
			throw new IllegalArgumentException("Segundos inválidos");

	}

	@Override
	public String toString(){
		return String.format("%d:%d:%d", getHoras(), getMinutos(), getSegundos());
	}

	public int getHoras() {
		return this.horas;
	}

	public int getMinutos() {
		return this.minutos;
	}

	public int getSegundos() {
		return this.segundos;
	}


}