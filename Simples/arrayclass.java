import java.util.Arrays;

public class arrayclass{

	public static void main(String[] args) {
		
		int[] av1 ={1, 4 , 6, 12, 13, -12, 0, -6, 200, 1};
		int posicao;

	//o metodo Arrays.toString() retorna os arrays em string
		System.out.println("Os elementos do array s�o: " + Arrays.toString(av1));;
		System.out.println("Ordenando...");

	//Arruma os valores do array em ordem
	//Para ordenar uma faixa de valores:
	//Arrays.sort(array, daqui, ate_aqui);
		Arrays.sort(av1);

		System.out.println("Arrays Ordenados: " + Arrays.toString(av1));

	//retorna a ultima posi��o do valor no array, *S� PODE SER USADO DPS DE USAR O METODO PARA ORDENAR* 
	//melhor, ele mostra a posi��o do array em ordem
	//Podemos tamb�m passar um intervalo de busca. Por exemplo, para procurar o elemento 'x', no Array 'vetor', 
	//a partir do elemento 'daqui' at� o elemento 'ate_aqui', fa�a:
	//Arrays.binarySearch( vetor, daqui, ate_aqui, x);
		posicao = Arrays.binarySearch(av1, 200);
		System.out.println("A posicao do elemento '200' � "+ (posicao+1));

	}
}
/*
	
Arrays.copyOf:
Esse m�todo copia um array e retorna outro. Esse que ele retorna � uma c�pia do primeiro.
Se receber dois argumentos - um array e um valor, esse array que voc� passa � aquele que voc� deseja copiar e o valor � o n�mero de elementos que voc� deseja copiar (ou o n�mero de elementos que voc� quer que seu novo array tenha. Caso deseje ter um array maior, esse m�todo preenche com 0 ou nulls):
novoArray[] = Arrays.copyOf( arrayOriginal, numero_de_elementos_a_serem_copiados);

Voc� tamb�m pode especificar uma faixa de valores:
novoArray[] = Arrays.copyOf( arrayOriginal, daqui, ate_aqui);


Arrays.equals:
Recebe dois arrays. Retorna true caso sejam iguais e false caso contr�rio.


Arrays.fill:
Vai preencher os valores de um array com determinado valor.
Caso deseje que todos os elementos de 'array' tenham o valor 'valor':
Arrays.fill(array, valor);

Para preencher s� determinada faixa de valores:
Arrays.fill(array, daqui, ate_aqui, valor);
*/