import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

/**
 * DesempenhoListas
 */
public class DesempenhoListas {

    public static void main(String[] args) {
        System.out.println("Iniciando");
        Collection<Integer> teste = new LinkedList<>();
        
        int max = 100_000_0;
        long inicio = System.currentTimeMillis();

        for (int i = 0; i < max; i++) {
            teste.add(i);
        }

        long meio = System.currentTimeMillis();
        
        // for (int i = 0; i < max; i++) {
        //     teste.contains(i);
        // }
        
        long fim = System.currentTimeMillis();
        long buscar = meio - inicio;
        long pesquisar = fim - meio;
        System.out.printf("%-10d%-10d%-10d", buscar, pesquisar, fim - inicio);

    }
}
/*
ArrayList
21        14141     14162
LinkedList
27        45197     45224
HashSet
57        64        121  
*/