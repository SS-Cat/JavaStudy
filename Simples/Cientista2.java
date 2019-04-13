import java.util.Random;

public class Cientista2{
	public static void main(String[] args) {
		Random rdn = new Random();
		int counter = 0;
		for(int v1 = 1000; v1 < 1999; v1++){  	//A primeira parte cria um programa que imprime os primeiros 
			if(v1 % 11 == 5){					//20 numeros de 1000 a 1999 que divididos por 11 dõ resto 5
				System.out.println(v1);
				counter ++;
			}
			if(counter==20){
				break;
			}
		}

		System.out.printf("\n\n");

		for(int v1 = 0; v1 < 20; v1++){				//A segunda parte, cria uma variavel dentro da iteração a cada iteração
				int n1 = rdn.nextInt(1000) + 1000;	//(lembrando que quando acaba, ela deixa de existir)
													//sendo que a variavel recebe um numero aleatorio , 
				if(n1 % 11 == 5)					//o gerador gera um numero aleatorio de 0 a 999
					System.out.println(n1);			//mais mil, para esse valor ficar entre 1000 e 1999
		}											//e no final imprime esse numero, caso ele cumpra a condição
	}
}