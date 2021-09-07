import java.util.Scanner;

public class Ex05 {

    /*
    Criar um algoritmo que leia um número inteiro entre 1 e 7 e escreva o dia da semana correspondente. 
    Caso o usuário digite um número fora desse intervalo, deverá aparecer uma mensagem informando que 
    não existe dia da semana com esse número.
    */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Informe um numero inteiro entre 1 e 7: ");
        int valor = input.nextInt();

            switch (valor) {
                case 1:
                    System.out.println("1 - Domingo");
                    break;
                case 2:
                    System.out.println("2 - Segunda-Feira");
                    break;
                case 3:
                    System.out.println("3 - Terça-Feira");
                    break;
                case 4:
                    System.out.println("4 - Quarta-Feira");
                    break;
                case 5:
                    System.out.println("5 - Quinta-Feira");
                    break;
                case 6:
                    System.out.println("6 - Sexta-Feira");
                    break;
                case 7:
                    System.out.println("7 - Sábado");
                    break;
                default:
                    System.out.println("Valor incorreto!");
                    System.out.println("Não existe dia da semana correspondente ao numero informado!");
                    break;
        }
    }
}