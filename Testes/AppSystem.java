import java.io.FileNotFoundException;
  
public class AppSystem {
  
       public static void main(String... args)
         throws FileNotFoundException {
  
             //Lista todas as propriedades disponíveis no sistema
             System.getProperties().list(System.out);
       }
  
}