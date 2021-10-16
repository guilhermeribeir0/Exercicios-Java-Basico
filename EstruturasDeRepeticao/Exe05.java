import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Exe05 {

    //Leia a idade de 10 pessoas e exiba a soma das idades. 

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int idade, soma = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("-------------------");
            System.out.print("\nInforme uma idade: ");
            idade = input.nextInt();

            soma = soma + idade;
        }

        System.out.println("--------------------------");
        System.out.println("A soma das idades é: "+soma);
        System.out.println("--------------------------");
        
    }

}