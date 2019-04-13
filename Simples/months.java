import java.util.Scanner;

public class months {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int day = 31;
        int month;

        System.out.println("Digite o numero do mes");
        month = input.nextInt();

        if(month>12 || month<1){
            System.out.println("mes invalido");
            //return;
        }

        switch(month)
        {
            case 2:
            day -=2;
            case 4: case 6: case 9: case 11:
            day--;
        }
        System.out.printf("O mes %d tem %d dias", month, day);

    }
}