import java.util.Formatter;
import java.util.NoSuchElementException;
import java.util.FormatterClosedException;
import java.lang.SecurityException;
import java.io.FileNotFoundException;

public class EscreverMetodos {

	private Formatter arquivo;

	public void abrir(String arquivo_S) {
		try {
			arquivo = new Formatter(arquivo_S);
		} catch (SecurityException semPermissao) {
			System.err.println(" Sem permissão para escrever no arquivo ");
			System.exit(1); //exit(0) é sucesso, outro número significa que terminou com problemas
		} catch (FileNotFoundException arquivoInexistente ) {
			System.err.println(" Arquivo inexistente ou arquivo não pode ser criado ");
			System.exit(1);
		}
	}

	public void escrever(String escrita_S) {
		try {
			arquivo.format(escrita_S);
		} catch (FormatterClosedException formatoDesconhecido) {
			System.err.println(" Erro ao escrever ");
			return ;
		} catch (NoSuchElementException excecaoElemento) {
			System.err.println("Entrada invalida. Por exemplo, era pra ser uma string, mas foi um inteiro");
		}
	}

	public void fechar() {
		arquivo.close();
	}

}