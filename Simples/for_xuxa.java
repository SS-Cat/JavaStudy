import java.util.Scanner;

public class for_xuxa{
	public static void main(String[]args){
		
		Scanner input = new Scanner(System.in);
		int v1, v2, n1;

		System.out.println("Quantos patinhosss!!!???");
		v1 = input.nextInt();

		for(v2 = 1 ; v2 < v1 ; v2 ++){


		//while(v1 > v2){
			System.out.println(v2+ "patinhos foram passear \nAl�m das montanhas \nPara brincar\nA mam�e gritou: Qu�, qu�, qu�, qu� \nMas s� "+ (v2 - 1) +" patinhos voltaram de l�.");
		}

	}
}