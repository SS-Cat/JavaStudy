public class Funcionario {

	private String nome;
	private boolean atraso;
	private double tempoTrabalhado, tempoAtraso;

	public Funcionario(String nome, Hora horaChegada, Hora horaSaida) {
		this.nome = nome;
		this.tempoAtraso = tempoAtraso(horaChegada);

		if(this.tempoAtraso>0)
			atraso = true;

		if(atraso){
			System.out.println("Funcionario '" + this.nome + "' atrasado.");
		}

		this.tempoTrabalhado = horasTrabalhadas(horaChegada, horaSaida);

	}

	public double tempoAtraso(Hora horaChegada){
		return ((horaChegada.getHoras()*60*60 + horaChegada.getMinutos()*60 + 
			horaChegada.getSegundos()) - 8*3600.0)/3600.0;
	}

	public double horasTrabalhadas(Hora horaChegada, Hora horaSaida){
		double horas = ( (horaSaida.getHoras()*60 + horaSaida.getMinutos()) -
		 (horaChegada.getHoras()*60 + horaChegada.getMinutos()) )/60.0;

		if(horas < 0)
			throw new IllegalArgumentException("Hora de saida anterior a hora de chegada");

		return horas;
	}

	public double getHorasTrabalhadas(){
		return this.tempoTrabalhado;
	}

}