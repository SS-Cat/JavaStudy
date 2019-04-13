import java.util.Arrays;

public class arrayclass{

	public static void main(String[] args) {
		
		int[] av1 ={1, 4 , 6, 12, 13, -12, 0, -6, 200, 1};
		int posicao;

	//o metodo Arrays.toString() retorna os arrays em string
		System.out.println("Os elementos do array são: " + Arrays.toString(av1));;
		System.out.println("Ordenando...");

	//Arruma os valores do array em ordem
	//Para ordenar uma faixa de valores:
	//Arrays.sort(array, daqui, ate_aqui);
		Arrays.sort(av1);

		System.out.println("Arrays Ordenados: " + Arrays.toString(av1));

	//retorna a ultima posição do valor no array, *SÓ PODE SER USADO DPS DE USAR O METODO PARA ORDENAR* 
	//melhor, ele mostra a posição do array em ordem
	//Podemos também passar um intervalo de busca. Por exemplo, para procurar o elemento 'x', no Array 'vetor', 
	//a partir do elemento 'daqui' até o elemento 'ate_aqui', faça:
	//Arrays.binarySearch( vetor, daqui, ate_aqui, x);
		posicao = Arrays.binarySearch(av1, 200);
		System.out.println("A posicao do elemento '200' é "+ (posicao+1));

	}
}
/*
	
Arrays.copyOf:
Esse método copia um array e retorna outro. Esse que ele retorna é uma cópia do primeiro.
Se receber dois argumentos - um array e um valor, esse array que você passa é aquele que você deseja copiar e o valor é o número de elementos que você deseja copiar (ou o número de elementos que você quer que seu novo array tenha. Caso deseje ter um array maior, esse método preenche com 0 ou nulls):
novoArray[] = Arrays.copyOf( arrayOriginal, numero_de_elementos_a_serem_copiados);

Você também pode especificar uma faixa de valores:
novoArray[] = Arrays.copyOf( arrayOriginal, daqui, ate_aqui);


Arrays.equals:
Recebe dois arrays. Retorna true caso sejam iguais e false caso contrário.


Arrays.fill:
Vai preencher os valores de um array com determinado valor.
Caso deseje que todos os elementos de 'array' tenham o valor 'valor':
Arrays.fill(array, valor);

Para preencher só determinada faixa de valores:
Arrays.fill(array, daqui, ate_aqui, valor);
*/