import java.util.Scanner;

/**
 * TEst1
 */
public class abs {

    public static void main(String[] args) {
        
        int v1 ;
        int v2 ;
        boolean c1 = true;
        Scanner in = new Scanner(System.in);
        // int subtracao = v1 - v2;
        // int abs = +subtracao;
        // System.out.println(abs);
        while(c1){
            v1 = in.nextInt();
            v2 = in.nextInt();
            int sub = v1 - v2;
            int abs = sub;
            
            if(abs<0){
                abs = -abs;
            }

            System.out.println(abs);

            System.out.println("Continue?");
            int v3 = in.nextInt();
            if(v3 == 0){
                c1 = false;
            }
        }
    }
}