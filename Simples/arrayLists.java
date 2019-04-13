import java.util.ArrayList;
import java.util.Arrays;

public class arrayLists {

	public static void main(String[] args) {
		ArrayList<String> bandas = new ArrayList<String>();

		bandas.add("Rush");
		System.out.print("Adicionando a banda Rush: ");
		System.out.println(Arrays.toString(bandas.toArray()));

		bandas.add("Artic Monkeys");
		System.out.print("Adicionando a banda " + bandas.toArray()[1] + ": ");
		System.out.println(Arrays.toString(bandas.toArray()));

		bandas.add("Lagum");
		System.out.print("Adicionando a banda " + bandas.toArray()[2] + ": ");
		System.out.println(Arrays.toString(bandas.toArray()));

		bandas.add("Imagine Dragons");
		System.out.print("Adicionando a banda " + bandas.toArray()[3] + ": ");
		System.out.println(Arrays.toString(bandas.toArray()));

		System.out.print("Quem est� no indice 0? ");
		System.out.println(bandas.get(0));
		System.out.println(bandas.toArray()[0]);  //pensei nessa parte aqui sozinho hahahahahahahaha!!!!!!!!!!

		System.out.print("Adicionando Chainsmorkers no lugar de Rush: ");
		bandas.add(bandas.indexOf("Lagum"), "Chainsmorkers");
		//bandas.add(0, "Chainsmorkers"); assim tbm pode ser... indexOf � um metodo q retorna o indice de onde esta tal coisa

		System.out.println(Arrays.toString(bandas.toArray()));

		System.out.print("N�meros de elementos na lista:");
		System.out.println(bandas.size());

		System.out.print("Removendo Rush: ");
		bandas.remove("Rush");
		System.out.println(Arrays.toString(bandas.toArray()));

		System.out.print("Removendo tudo: ");
		bandas.clear();
		System.out.println(Arrays.toString(bandas.toArray()));
	}

}


/**
Para saber mais m�todos e mais op��es de par�metros/argumentos, consulte a documenta��o sobre ArrayList em Java, no site da Oracle:
http://docs.oracle.com/javase/7/docs/api/java/util/ArrayList.html

Se em vez de de Strings, quiser trabalhar com n�meros, use as classes Wrappers:
ArrayList<Integer>, ArrayList<Float>, ArrayList<Double>, ArrayList<Long> etc. 
*/