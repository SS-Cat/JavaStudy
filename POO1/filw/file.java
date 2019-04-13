import java.util.Scanner;
import java.io.File;

public class file {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Entre com um endereço válido de um arquivo: ");
		String caminho = input.nextLine();

		metodos(caminho);
	}

	public static void metodos(String caminho) {
		File arquivo = new File(caminho);

		if (arquivo.exists()) {
			System.out.println("O caminho especificado existe !\nVamos aos testes:\n");

			if (arquivo.isAbsolute())
				System.out.println("É um caminho absoluto");
			else
				System.out.println("Não é um caminho absoluto");

			if (arquivo.isFile()) {
				System.out.printf("É um arquivo de tamanho %s bytes\n"
				                  + "Útima vez modificado %s\n"
				                  + "Cujo caminho é %s\n"
				                  + "De caminho absoluto %s\n"
				                  + "E está no diretório pai %s\n",
				                  arquivo.length(), arquivo.lastModified(), arquivo.getPath(), arquivo.getAbsolutePath(), arquivo.getParent() );
			} else {
				System.out.println("É um diretório cujo conteúdo tem os seguintes arquivos: ");
				String[] arquivos = arquivo.list();

				for ( String file : arquivos)
					System.out.println( file );
			}
		} else {
			System.out.println("Endereço errado");
		}
	}

}