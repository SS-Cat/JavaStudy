public class passagemPorValor {
    
    public static int dobra(int num){
        return num*2;
    }
   
    public static void main(String[] args){
            int numero=2112;
           
            System.out.println("O valor de numero é: " + numero);
            System.out.println("Dobrando seu valor.");
            dobra(numero);
            System.out.println("Agora o valor de número é: " + numero);
            System.out.println("Dobrando sem metodo");
            numero= numero*2;
            System.out.println("Agora o valor ficou: " + numero);
           
        }

}