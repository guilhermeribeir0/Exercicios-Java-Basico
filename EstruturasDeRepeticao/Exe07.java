import java.util.Scanner;

public class Exe07 {

    /*
    Escreva um algoritmo que leia 20 números do usuário 
    e exiba quantos números são maiores do que 8.
    */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numero, cont=0;

        for (int i = 0; i < 20; i++) {
            System.out.println("------------------");
            System.out.print("Digite um numero: ");
            numero = input.nextInt();

            if (numero > 8) {
                cont++;
            }
        }
            System.out.println("----------------------------------------------");
            System.out.println("A quantidade de numeros maior que 8 é: "+cont);
        
    }
    
}
