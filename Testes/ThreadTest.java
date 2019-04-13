
/**
 * ThreadTest
 */
public class ThreadTest {

    public static void main(String[] args) {

        Thread thread1 = new Thread(new InnerThreadTest(1));
        thread1.start();

        Thread thread2 = new Thread(new InnerThreadTest(2));
        thread2.start();
    }
}

/**
 * InnerThreadTest
 */
class InnerThreadTest implements Runnable {

    private int id;

    public InnerThreadTest(int id) {
        this.id = id;
    }

    @Override
    public void run() {

        for (int i = 0; i < 500; i++) {
            System.out.println("Program " + id + " valor: " + i);
        }
    }
}