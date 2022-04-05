import java.util.Scanner;

public class Exe09 {

    /*
    Faça um programa que peça uma nota, entre zero e dez.
    Mostre uma mensagem caso o valor seja inválido e 
    continue pedindo até que o usuário informe um 
    valor válido.
    */

    public static void main(String [] args) {

        Scanner input = new Scanner (System.in);

        int nota;

        System.out.print("Informe a nota: ");
        nota = input.nextInt();

        while(nota < 0 || nota > 10) {
            System.out.print("Valor invalido!\nPor favor, informe uma valor entre 0 e 10: ");
            nota = input.nextInt();
        }
        
        System.out.println("Nota informada: "+nota);
    }
    
}
