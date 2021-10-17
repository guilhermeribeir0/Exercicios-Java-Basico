import java.lang.reflect.Array;
import java.util.Scanner;

public class Exe06 {

    /*
    Faça um algoritmo que leia 20 números e, ao final, 
    escreva quantos estão entre 0 e 100.
    */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        int numero, cont=0;

        for (int i = 0; i < 20; i++) {
            System.out.println("------------------");
            System.out.print("Digite um numero: ");
            numero = input.nextInt();

            if (numero >= 0 && numero <= 100) {
                cont++;
            }
        }
            System.out.println("----------------------------------------------");
            System.out.println("A quantidade de numeros entre 0 e 100 é: "+cont);
    }
}
