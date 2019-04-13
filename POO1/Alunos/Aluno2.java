

public class Aluno2{
	public String nome;
	public double notaMath, notaFis, media;

	public Aluno2(){}
	public Aluno2(String Nome, double NotaMath, double NotaFis){
		nome = Nome;
		notaMath = NotaMath;
		notaFis = NotaFis;

		media = (notaMath + notaFis)/2;
	}
}