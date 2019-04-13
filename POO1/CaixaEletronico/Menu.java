public class Menu {

	public void extrato(String nome, int ID, float saldo, int transacoes) {	// Extrato: exibe o nome, número da conta,
		System.out.println("O nome da conta é " + nome);						// saldo e quantos saques já foram realizados
		System.out.println("O numero da conta é " + ID);
		System.out.println("O saldo da conta é " + saldo);
		System.out.println("Ainda podem ser realizadas " + transacoes + "transacoes");
	}

	//public void saque(float saque){	// Sacar: recebe o valor a ser sacado, informa se pode ser sacado (não pode ficar negativo) e mostra o saldo

	//}

	public void menuMsg() {

		System.out.println("\t\n\n\n Menu \n");
		System.out.println("\t\n 1-Extrato\n");
		System.out.println("\t\n 2-Sacar\n");
		System.out.println("\t\n 3-Depositar\n");
		System.out.println("\t\n 0-Sair\n");


	}

}