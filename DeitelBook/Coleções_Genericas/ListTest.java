import java.util.List;
import java.util.LinkedList;
import java.util.ListIterator;


/**
 * ListTest
 */
public class ListTest {

    public static void main(String[] args) {
        
        // adiciona elementos colors à list1
        String[] colors = 
           {"black", "yellow", "grenn", "blue", "violet", "silver"};
        List<String> list1 = new LinkedList<>();
        for (String color : colors) list1.add(color);

        // adiciona elementos colors2 à list2
        String[] colors2 =
            {"gold", "white", "brown", "blue", "gray", "silver"};
        List<String> list2 = new LinkedList<>();
        for (String color : colors2) list2.add(color);

        list1.addAll(list2);    // concatena as listas
        list2 = null;           // libera recursos
        printList(list1);

        convertToUppercaseStrings(list1);   // Convete em strings de letras maiúsculas
        printList(list1);

        System.out.printf("\nDeleting elements 4 to 6...");
        removeItens(list1, 4, 7);
        printList(list1);
        printReversedList(list1);
    }

    // gera saída do conteúdo da lista
    private static void printList(List<String> list) {
        System.out.println("\nList:");

        for (String color : list) System.out.printf("%s ", color);

        System.out.println();
    }

    // localiza objetos String e converte em letras maiúsculas
    private static void convertToUppercaseStrings(List<String> list) {
        ListIterator<String> iterator = list.listIterator();

        while (iterator.hasNext()) {
            String color = iterator.next();
            iterator.set(color.toUpperCase());
        }
    }

    // obtém subLista e utiliza método clear para excluir elementos da subLista
    private static void removeItens(List<String> list, int start, int end) {
        list.subList(start, end).clear();
    }

    private static void printReversedList(List<String> list) {
        ListIterator<String> iterator = list.listIterator(list.size());

        System.out.println("\nReversed List");

        // imprime a lista na ordem inversa
        while (iterator.hasPrevious())
            System.out.printf("%s ", iterator.previous());

    }
}