import java.util.Scanner;

public class Ex04 {

    public static void main(String[] args) {
        
    /*
    Construa um algoritmo de PORTUGOL para determinar se o indivíduo esta com um peso 
    favorável. Essa situação é determinada através do IMC (Índice de Massa Corpórea), que é 
    definida como sendo a relação entre o peso (PESO) e o quadrado da Altura (ALTURA) do 
    indivíduo. Ou seja, IMC = PESO/ALTURA^2.

    TABELA:

             CONDIÇÃO              |     SITUAÇÃO
    IMC abaixo de 20               = Abaixo do Peso
    IMC igual a 20 ou menor que 25 = Peso Normal
    IMC igual a 25 ou menor que 30 = Sobre Peso
    IMC igual a 30 ou menor que 40 = Obeso
    IMC igual ou maior que 40      = Obesidade Mórbida   
    */

        Scanner input = new Scanner (System.in);

        int peso;
        float altura;
        
        System.out.print("Informe seu peso atual: ");
        peso = input.nextInt();
        System.out.print("Informe sua altura atual (Ex: 1,74 - Utilize a vírgula!): ");
        altura = input.nextFloat();
        
        float imc = peso/(altura*altura);

        if (imc <= 20) {
            System.out.println("IMC: "+imc+" - ABAIXO DO PESO!");
        } else if (imc >= 20 && imc < 25) {
            System.out.println("IMC: "+imc+" - PESO NORMAL!");
        } else if (imc >= 25 && imc < 30) {
            System.out.println("IMC: "+imc+" - SOBRE PESO!");
        } else if (imc >= 30 && imc < 40) {
            System.out.println("IMC: "+imc+" - OBESO!");
        } else {
            System.out.println("IMC: "+imc+" - OBESIDADE MÓRBIDA!");
        }
    }
}
