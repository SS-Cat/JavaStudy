public class writeInText {

	public static void main(String[] args) {

		EscreverMetodos teste = new EscreverMetodos();
		teste.abrir("arquivo.txt");
		teste.escrever("linha 1\nlinha 2\nlinha 3");
		teste.fechar();

		LendoMetodos teste2 = new LendoMetodos();
		teste2.abrir("arquivo.txt");
		teste2.ler();
		teste2.fechar();

	}

}