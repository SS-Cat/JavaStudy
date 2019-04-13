import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * Servidor
 */
public class Servidor {

    public static void main(String[] args) throws IOException {
        
        ServerSocket servidor = new ServerSocket(12345);
        System.out.println("Porta aberta");
        
        Socket cliente;
        do{
        cliente = servidor.accept();
        
        Tratamento trat = new Tratamento(cliente);
        Thread th = new Thread(trat);
        th.start();
        
        
        }while(true);
        // servidor.close();
    }
}

class Tratamento implements Runnable{
    
    private Socket cliente;
    private static int count = 0;
    private final int id;

    public Tratamento(Socket cliente){
        this.cliente = cliente;
        id = ++count;
        System.out.printf("%s: %s\n%s: %d\n", "Nova conexão com o cliente", 
                cliente.getInetAddress().getHostAddress(),
                "Com o número", id);
    }

    @Override
    public void run() {
        try (Scanner in = new Scanner(cliente.getInputStream());) {
            
            while(in.hasNextLine()){
                System.out.println("num " + id + ":" + in.nextLine());
            }

        } catch (Exception e) {
            //TODO: handle exception
        }
    }
}