public class ex02 {

    /*
    Fazer um programa que imprima a média aritmética dos números 8,9 e 7. A média dos 
    números 4, 5 e 6. A soma das duas médias. A média das médias.
    */
    
    public static void main(String[] args) {
        
    int soma1 = 7+8+9;
    int soma2 = 4+5+6;
    float media1 = soma1/3;
    float media2 = soma2/3;
    float soma3 = media1+media2;
    float media3 = soma3/2;

    System.out.println("Primeira média: "+media1);
    System.out.println("Segunda média: "+media2);
    System.out.println("Soma das médias: "+soma3);
    System.out.println("Médias das médias: "+media3);

    }
}
