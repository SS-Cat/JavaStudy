import java.util.EnumSet;

/**
 * EnumTest
 */
public class EnumTest {

    public static void main(String[] args) {
        System.out.println("All books:\n");

        //imprime todos os livros em enum Book
        for(Book book : Book.values())
            System.out.printf("%-10s%-45s%s\n",
            book, book.getTitle(), book.getCopyrightYear());

        System.out.println("\nDisplay a range of enum constants:\n");

        //imprime os primeiro quatro livros
        for(Book book : EnumSet.range(Book.JHTP, Book.CPPHTP))
            System.out.printf("%-10s%-45s%s\n",
            book, book.getTitle(), book.getCopyrightYear());

    }
}