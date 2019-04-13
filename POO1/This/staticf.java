public class staticf{

	int v1 = 45;
	static String v2 = "String estatica";

	public staticf() {
		System.out.println("print");
	}

	public static void ad(){
		System.out.println("metodo statico sendo imprimido sem ser necessario instancia");
	}

	public void ac(){
		System.out.println("metodo n estatico, necessario declaracao");
	}
}