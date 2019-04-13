import java.io.*;

public class bytis {

	public static void main(String[] args) throws IOException {
		
		FileInputStream in = new FileInputStream("text.txt");	//recebe uma string com o caminho do arquivo
		InputStreamReader inf = new InputStreamReader(in);		//recebe um objeto de cima, e lê o arquivo
		BufferedReader inb = new BufferedReader(inf);			//recebe um objeto de cima, e lê linha por linha
		
		String line = inb.readLine();//metodo para lê uma linha, aqui atribui a linha uma variavel, ele retorna string

		//while(line != null){
			System.out.println(line);
		//	line = inb.readLine();
		//}




		/*int c = inf.read();			//metodo para lê um caractere, ele retorna um int com o numero do caractere
		
		while(c != -1) {
			System.out.print((char)c);
			c = inf.read();
		}*/

		in.close();		//metodo para fechar o arquivo aberto.


		InputStream entrada = new FileInputStream("text.txt"); //	
	    int umByte = entrada.read();
	    
	    while(umByte != -1){
	    	System.out.print((char)umByte);
	    	umByte = entrada.read();
	    }
	}

}