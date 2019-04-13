import java.io.FileNotFoundException;
import java.lang.SecurityException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * CreateTextFile
 */
public class CreateTextFile {

    private static Formatter output; //envia uma saída de texto para um arquivo

    public static void main(String[] args) {
        openFile();
        addRecords();
        closeFile();
    }

    //abre o arquivo clients.txt
    public static void openFile(){
        try {
            output = new Formatter("clients.txt");
        } catch (SecurityException e) {
            System.err.println("Write permission denied. Terminating. ");
            System.exit(1);
        } catch (FileNotFoundException e){
            System.err.println("Error opening File. Terminating. ");
            System.exit(1);
        }
    }

    public static void addRecords(){
        Scanner input = new Scanner(System.in);
        System.out.printf("%s%n%s%n? ",
            "Enter account number, first name, last name and balance.",
            "Enter end-of-file indicator to end input.");
        
        while (input.hasNext()) { //faz um loop até o indicador de fim de arquivo
            try {
                output.format("%d %s %s %.2f%n", input.nextInt(),
                input.next(), input.next(), input.nextDouble());
            } catch (FormatterClosedException e) {
                System.err.println("Error writing to file. Terminating.");
                break;
            } catch (NoSuchElementException e) {
                System.err.println("Invalid input. Please try again.");
                input.nextLine(); //descarta a entrada do usuário para tentar denovo
            }
            System.out.print("? ");
        }

        input.close();
    }


    //fecha o arquivo
    public static void closeFile(){
        if(output != null)
            output.close();
    }
}