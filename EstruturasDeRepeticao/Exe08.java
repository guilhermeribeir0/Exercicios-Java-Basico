import java.util.InputMismatchException;
import java.util.Scanner;

public class Exe08 {

    /*
    Escreva um algoritmo que leia uma sequência de números do usuário e realize a 
    soma desses números. Encerre a execução quando um número negativo for digitado.
    */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        int valor, soma = 0;

        do {
        System.out.print("Digite um numero: ");
        valor = input.nextInt();

        soma += valor;

        } while (valor >= 0);

        System.out.println("------------------------------\nNumero NEGATIVO digitado. Programa Encerrado! \nResultado da soma informado abaixo.");
        System.out.println("------------------------------\nA soma dos numeros informados é: "+soma);
    }
    
}
