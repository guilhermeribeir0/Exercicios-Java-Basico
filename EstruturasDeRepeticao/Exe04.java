import java.util.Scanner;

public class Exe04 {

    /*
    Escreva um algoritmo que leia 10 números do usuário e calcule 
    a soma desses números. 
    */
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int valor;
        int soma = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Informe um numero: ");
        valor = input.nextInt();

        soma = soma + valor;
        }

        System.out.println("---------------------- \nSoma total dos numeros informados é: "+soma);
        
    }
}