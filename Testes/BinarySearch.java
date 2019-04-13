import java.util.Scanner;

/**
 * BinarySearch
 */
public class BinarySearch {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Entre um numero: ");
        int arr[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, esq, dir, meio;
        int entrada = sc.nextInt();
        sc.close();
        
        esq = 0;
        dir = arr.length;
        meio = 0;
        while(esq<=dir){//Busca binaria
            meio = (esq+dir)/2;
            if(entrada < arr[meio])
                dir = meio-1;
            else if ( entrada == arr[meio])
                break;
            else
                esq = meio+1;
        }

        System.out.printf("%d\t%d\n", arr[meio], meio+1);
    }
}



