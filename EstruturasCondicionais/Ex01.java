import java.util.Scanner;

public class Ex01 {

    /*
    Acesso a um jogo para maiores de 18 anos.
    Ler a idade do usuárioe retornar se ele pode acessar ou não o jogo.
    */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Para poder entrar no jogo, por favor, nos informe a sua idade.");
        System.out.print(">> Idade: ");
        int userIdade = input.nextInt();

        if (userIdade >= 18) {
            System.out.println("========================\nAcesso autorizado! \nDivirta-se!");
        } else {
            System.out.println("Acesso negado! \nDesculpe! Você não possui a idade minima.");
        }
    }
}

