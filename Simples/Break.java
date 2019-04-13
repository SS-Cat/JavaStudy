public class Break {
	public static void main(String[] args) {
		long i = System.currentTimeMillis();
		boolean print = true;

		for (int counter = 1; counter <= 1000000 ; counter++) {
			if(counter % 2 == 0)
					continue;

			if ((counter % 17 == 0) && (counter % 19 == 0)) {

				System.out.println(counter);
				break;
				/*  teste, aqui  ele continua rodando o programa até contar a , e em cima não.
				if (print) {
					System.out.println("The number is " + counter);
					print = false;
				}*/
			}
		}System.out.println("O tempo de execução , ms, foi: " + (System.currentTimeMillis() -i));
	}	
}