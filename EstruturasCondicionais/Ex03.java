import java.util.Scanner;

public class Ex03 {
    
    public static void main(String[] args) {
        
        /*
        Escreva um algoritmo que leia um número e informe se ele é divisível por 
        10, por 5 ou por 2 ou se não é divisível por nenhum deles.
        */

        Scanner input = new Scanner(System.in);

        int num;

        System.out.print("Digite um numero inteiro: ");
        num = input.nextInt();

        if (num % 10 == 0) {
            System.out.println("É DIVISIVEL POR 10!");
        } else if (num % 5 == 0) {
            System.out.println("É DIVISIVEL POR 5!");
        } else if (num % 2 == 0) {
            System.out.println("É DIVISIVEL POR 2!");
        } else {
            System.out.println("NÃO É DIVISIVEL POR 10, POR 5 E NEM POR 2!");
        }

    }

}
