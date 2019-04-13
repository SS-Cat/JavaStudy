public class Variaveis1 {

	public static void main(String[] args) {

		int one;
		one = 1;
		System.out.print(one);
		int inteiro = 32;
		System.out.print("\n o int ocupa " + inteiro + "bits");
		System.out.println(" ou qualquer número entre -2.147.483.648 e 2.147.483.647");
		float quebrado = 5.5f;
		System.out.println("já float são número quebrados como:" + quebrado); //32 bits tbm.
		double quebradoGrande = 55555555555555.5555555555555;
		System.out.println("double é um quebrado gandao" + quebradoGrande);
		long grande = 10l;
		System.out.println(grande); // long e double ocupam 64bits.
		/* tambem existe o byte(8bits) e o short(16bits,
		 que são muito pequenos */

	}

}