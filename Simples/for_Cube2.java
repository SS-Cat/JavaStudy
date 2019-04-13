import java.util.Scanner;

public class for_Cube2{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n1, v2, v3;

		System.out.println("Enter a number");
		n1 = input.nextInt();

		for( int v1 = 0 ; v1 < n1 ; v1++ ){
			if((v1 == 0) || (v1 == n1-1)){
				for( v2 = 0;v2 < n1;v2++){
					System.out.print("*");
				}
			}else{
				System.out.print("*");
				for( v3 = 0;v3 < (n1 - 2);v3++){
					System.out.print(" ");
				}
				System.out.print("*");
			}
			System.out.println("");
			v2 = 0;
			v3 = 0;
		}

	}
}