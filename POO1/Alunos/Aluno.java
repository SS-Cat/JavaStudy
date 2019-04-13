

public class Aluno{
	public String nome;
	public double notaMath, notaFis, media;

	public Aluno(){		//normalmente não está declarado, mas existe, é o metodo construtor, como n é declarado, é default.
		System.out.println("Objeto Criado");		//aqui alterei, deixando de ser o construtor default.
	}
	
	public Aluno(String Nome, double NotaMath, double NotaFis){ // se colocarmos os parametros, este construtor aqui é chamado
		nome = Nome;
		notaMath = NotaMath;
		notaFis = NotaFis;

		media = (notaMath + notaFis)/2;	
	}

		public static void Aluno3(){		
		System.out.println("Metodo chamado");	
	}

}