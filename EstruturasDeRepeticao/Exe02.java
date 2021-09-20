import java.util.Scanner;

public class Exe02 {

    /*
    Leia o nome do usuário e escreva o nome dele na tela 10 vezes
    */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Informe seu nome: ");
        String nome = input.nextLine();

        for (int i = 1; i <=10; i++) {
            System.out.println(i+". "+nome);
        }
        
    }
    
}
