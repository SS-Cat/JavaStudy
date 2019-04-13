import java.io.IOException;
import java.lang.IllegalStateException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * ReadTextFile
 */
public class ReadTextFile {

    private static Scanner input;

    public static void main(String[] args) {
        openFile();
        readRecords();
        closeFile();
    }

    // abre o arquivo clients.txt
    public static void openFile() {
        try {
            input = new Scanner(Paths.get("clients.txt"));
        } catch (IOException e) {
            System.err.println("Error opening file. Terminating. ");
        }
    }

    public static void readRecords() {
        System.out.printf( "%-10s%-12s%-12s%10s%n" , 
            "Account", "First Name", "Last Name", "Balance" );
        
        try {
            while (input.hasNext()) {
                System.out.printf( "%-10d%-12s%-12s%10.2f%n" , 
                    input.nextInt(), input.next(), input.next(), input.nextDouble() );
            }
        } catch (NoSuchElementException e) {
            System.err.println("File improperly formed. Terminatting");
        } catch (IllegalStateException e){
            System.err.println("Error reading from file. Terminatting");
        }
    }

    public static void closeFile() {
        if (input != null) {
            input.close();
        }
    }
}