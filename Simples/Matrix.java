 import java.util.Scanner;

 public class Matrix{
 	public static void main(String[] args) {
 		Scanner input = new Scanner(System.in);
 		boolean pass = true;
 		char v1;

 		while(pass){
 			System.out.println("Voce esta preso hahaha");
 			System.out.println("Digite a letra correta para conseguir a chave");
 			v1 = input.next().charAt(0);

 			if(v1 == 'i'){
 				pass = false;
 				System.out.println("voce conseguiu a chave");
 			}else{
 				System.out.println("a chave nao esta ai");
 			}
 			System.out.println("");
 		}
 	}
 }