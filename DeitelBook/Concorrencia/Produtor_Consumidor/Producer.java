import java.security.SecureRandom;

/**
 * Producer
 */
public class Producer implements Runnable{

    private static final SecureRandom generator = new SecureRandom();
    private final Buffer sharedLocation;    // referência a objeto compartilhado

    public Producer(Buffer sharedLocation) {
        this.sharedLocation = sharedLocation;
    }

    // armazena os valores de 1 a 10 em shared Location
    @Override
    public void run() {
        int sum = 0;
        
        for (int i = 1; i < 11; i++) {
            try {
                Thread.sleep(generator.nextInt(3000));
                sharedLocation.blockingPut(i);
                sum += i;
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        System.out.println("Producer done producing\nTerminating Producer");
    }
}