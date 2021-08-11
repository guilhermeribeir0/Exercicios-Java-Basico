import java.util.Scanner;

/**
 * teste
 */
public class ex01 {

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        
        int anos;
        int meses;
        int dias;

        System.out.println("Digite sua idade em anos: ");
        anos = input.nextInt();
        System.out.println("Digite agora os meses: ");
        meses = input.nextInt();
        System.out.println("Digite agora os dias: ");
        dias = input.nextInt();

        int idade = (anos*365)+(meses*30)+dias;

        System.out.println("Sua idade em dias é igual a: "+idade);


   }
}