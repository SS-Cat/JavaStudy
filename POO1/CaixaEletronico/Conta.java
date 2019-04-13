import java.util.Random;

public class Conta {

	private String nome;
	private float v0Saldo;
	private int ID;
	private int transacao = 5 , contador = 0;

	public Conta(String nome, float v0Saldo) {
		Random rd = new Random();
		int v3 = 0;
		v3 += rd.nextInt(9999) + 1;
		this.ID = v3;

		setNome(nome);
		this.v0Saldo = v0Saldo;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setSaque(float v0Saldo) {
		if (contador < transacao) {
			if (v0Saldo < this.v0Saldo) {
				this.v0Saldo -= v0Saldo;
				transacao--;
				System.out.println("Voce ainda pode ter " + this.transacao + "restantes");
			}else{
				System.out.println("Valor acima do seu Saldo atual");
			}
		} else {
			System.out.println("Limite de transacao atigindo");
		}
	}

	public void setSaldo(float deposito) {
		this.v0Saldo += deposito;
		System.out.println("Seu saldo é " + this.v0Saldo);
	}


	public String getNome() {
		return this.nome;
	}

	public float getV0Saldo() {
		return this.v0Saldo;
	}

	public int getID() {
		return this.ID;
	}

	public int getTransacao() {
		return this.transacao;
	}

}