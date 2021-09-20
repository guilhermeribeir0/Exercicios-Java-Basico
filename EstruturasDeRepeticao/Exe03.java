import java.util.Scanner;

public class Exe03 {

    /*
    Leia o nome um número do usuário um número N e escreva o nome dele 
    na tela N vezes.
    */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Informe seu nome: ");
        String nome = input.nextLine();

        System.out.print("Informe o numero de vezes que seu nome irá aparecer: ");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println(i+". "+nome);
        }


    }
}
