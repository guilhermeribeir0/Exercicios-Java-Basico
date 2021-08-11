import java.util.Scanner;

public class ex05 {
    
    public static void main(String[] args) {
        
        double salmin = 1034;
        double saluser;

        Scanner input = new Scanner (System.in);

        System.out.println("Digite o valor do seu salario: ");
        saluser = input.nextDouble();

        double quantsalmin = saluser/salmin;

        System.out.println("Você ganha aproximadamente "+quantsalmin+" salários minimos.");


    }
}
