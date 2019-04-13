import java.io.File;
import java.util.Scanner;
import java.lang.IllegalStateException;
import java.util.NoSuchElementException;
import java.io.FileNotFoundException;

public class LendoMetodos {
    private Scanner entrada;

    public void abrir(String arquivo_S) {
        try {
            entrada = new Scanner(new File( arquivo_S ) );
        } catch (FileNotFoundException arquivoNaoEncontrado) {
            System.err.println("Nao foi possível abrir o arquivo! Não encontrado!");
            System.exit(1); //saída de erro, O método System.exit fecha a execução do programa, onde 0 é saida normal
        }
    }

    public void ler() {
        try {
            while ( entrada.hasNext() )
                System.out.printf("%s - %d\n", entrada.next(), entrada.nextInt()); // o metodo .next lê a proxima coisa, uma palavra, numero, etc...
        } catch (NoSuchElementException entradaDiferente) {
            System.err.println("Entrada diferente da esperada");
            entrada.close();
            System.exit(1);
        } catch (IllegalStateException erroLeitura) {
            System.err.println("Erro de leitura. Scanner foi fechada antes da input");
            System.exit(1);
        }
    }

    public void fechar() {
        entrada.close();
    }
}