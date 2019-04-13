import java.util.Scanner;

public class Cube2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int counter1, counter2, counter3, v1, v2, v3;
		counter1 = 1;
		counter2 = 1;
		counter3 = 1;

		System.out.println("Enter a Number");
		v1 = input.nextInt();
		v2 = v1;
		v3 = v1 - 2;

		while(counter2 <= v2){
			if((counter2 == 1) || (counter2 == v2)){
				while(counter1 <= v1){
					System.out.print("*");
					counter1++;
				}
			}
			if((counter2 != 1) && (counter2 != v2)){
				System.out.print("*");
				while(counter3 <= v3){
					System.out.print(" ");
					counter3++;
				}
				System.out.print("*");
			}

			System.out.println("");
			counter2++;
			counter3 = 1;
			counter1 = 1;
		}
	}
}