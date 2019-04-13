import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * DivideByZeroWithExceptionHandling
 */
public class DivideByZeroWithExceptionHandling {

    public static int quotient( int numerator, int denominator) 
    throws ArithmeticException{
        return numerator / denominator;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueLoop = true;

        do{
            try {
                System.out.print("Please enter a integer numerator: ");
                int numerator = scanner.nextInt();
                System.out.print("Please enter a integer denominator: ");
                int denominator = scanner.nextInt();

                int result = quotient(numerator, denominator);
                System.out.printf( "\nResult: %d / %d = %d\n" , numerator, denominator, result );
                continueLoop = false;
            } catch (InputMismatchException e) {
                System.err.printf("\nException: %s\n", e);
                scanner.nextLine(); //descarta a entrada para o user poder tentar dnv
                System.out.println("You must enter intergers. Please try again.\n");
            }catch(ArithmeticException e){
                System.err.printf("\nException: %s\n", e);
                System.out.println("Zero is invalid denominator. Please try again.\n");
            }
            finally{
                scanner.close();
            }
        }while(continueLoop);
    }
}