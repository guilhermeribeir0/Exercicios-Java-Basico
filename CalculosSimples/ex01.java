import java.util.Scanner;

/*
Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e 
mostre-a expressa em dias. Leve em consideração o ano com 365 dias e o mês com 30. 
(Ex: 3 anos, 2 meses e 15 dias = 1170 dias.)
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