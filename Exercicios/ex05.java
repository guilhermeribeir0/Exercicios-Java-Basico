import java.util.Scanner;

public class ex05 {
    
    public static void main(String[] args) {

        /*
        Crie um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário,
        calcule a quantidade de salários mínimos esse usuário ganha e imprima o resultado.
        (1SM=R$788,00)
        */
        
        double salmin = 788;
        double saluser;

        Scanner input = new Scanner (System.in);

        System.out.println("Digite o valor do seu salario: ");
        saluser = input.nextDouble();

        double quantsalmin = saluser/salmin;

        System.out.println("Você ganha aproximadamente "+quantsalmin+" salários minimos.");


    }
}
