import java.util.Scanner;

public class Exe10 {

    /*
    Crie um algoritmo que leia um número do usuário 
    e exiba a sua tabuada de multiplicação.
    */

    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);

        int valor;
        int[] tabuada = new int [11];

        System.out.println("Olá! Bem vindo(a) ao gerador de tabuada!");
        
        System.out.println("-------------------------");
        System.out.print("Informe um numero inteiro: ");
        valor = input.nextInt();
    
        System.out.println("-------------------------------------------------");
        System.out.println("A tabuada de multiplicação do numero "+valor+" é:");

            for (int i = 0; i < tabuada.length; i++) {
                tabuada[i] = i;
        
                System.out.println(tabuada[i]+" x "+valor+" = "+(tabuada[i]*valor));
            }
    }

}


