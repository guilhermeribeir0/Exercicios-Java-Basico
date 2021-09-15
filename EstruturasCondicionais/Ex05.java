import java.util.Scanner;

public class Ex05 {

    /*
    Criar um algoritmo que leia um número inteiro entre 1 e 7 e escreva o dia da semana correspondente. Caso o usuário digite um número fora desse intervalo, deverá aparecer uma mensagem informando que não existe dia da semana com esse número.
    */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //Ler entrada - numero
        System.out.print("Informe um numero inteiro entre 1 e 7: ");
        int valor = input.nextInt();

        switch (valor) {
            case 1:
                System.out.println("------------------- \n1 - Domingo");
                break;
            case 2:
                System.out.println("------------------- \n2 - Segunda-Feira");
                break;
            case 3:
                System.out.println("------------------- \n3 - Terça-Feira");
                break;
            case 4:
                System.out.println("------------------- \n4 - Quarta-Feira");
                break;
            case 5:
                System.out.println("------------------- \n5 - Quinta-Feira");
                break;
            case 6:
                System.out.println("------------------- \n6 - Sexta-Feira");
                break;
            case 7:
                System.out.println("------------------- \n7 - Sábado");
                break;
            default:
                System.out.println("Valor incorreto! \nNão existe dia da semana correspondente ao numero informado!");
                break;
        }
    }
}