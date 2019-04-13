/**
 * PrintF
 */
public class PrintF {

    public static void main(String[] args) {
        
        String v1 = "wasd", v2 = "qwerty", v3 = "Bomber_b";
        int b1 = 0, b2 = 21, b3 = 69;
        float n1 = 1.12345f, n2 = 23.432f, n3 = 3.1f;

        System.out.printf("%s, %d, %f", v1, b1, n1); // saida normal print formater, chave/valor
        System.out.printf("\n"); //para pular linha
        System.out.printf("%10s", v2); //saida com 10 casas(termo fica no fim)
        System.out.printf("\n%10s", v3); //para visualizar ambos termos terminando na casa 10
        System.out.printf("\n%-10s", v1); //com o negativo, faço começar na esquerda, e ir até 10 casas
        System.out.printf("%s", v3); //para visualizar que ficou na casa 10
        System.out.printf("\n%010d", 3); //com numeros podemos colocar um flag para preencher os espaços
        System.out.printf("\n%-10d", b3); //não pode colocar o flag e o negativo
        System.out.printf("\n%.1f", n2); //para gerar casa de precisão em n de . flutuante
        System.out.printf("\n%010f", n1);
        System.out.printf("\n%010.3f", n1);
        System.out.printf("\n%-10.1f", n2);

    }
}