import java.util.Scanner;

public class Menu{

	public static void msg0(){
		System.out.println("Entrada");
	}

	public static void main(String[] args) {
		msg n1 = new msg();
		Scanner input = new Scanner(System.in);
		int v1;

		do{
			n1.menu1();
			v1 = input.nextInt();

			switch(v1){
				case 1:
				n1.msg1();
				break;
				case 0:
				msg0();
				break;
				case 2:
				n1.msg2();
				break;
				case 3:
				n1.msg3();
				break;
				case 4:
				n1.msg4();
				break;
				case 5:
				n1.msg5();
				break;
				default:
				n1.msgD();
				break;
			}
			n1.PulaLinha();

		}while(v1 != 5);
	}

}