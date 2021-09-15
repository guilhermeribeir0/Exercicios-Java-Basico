import java.util.Scanner;

public class Ex06 {

    /*
    Criar um algoritmo que informe a quantidade total de calorias de uma refeição 
    a partir do usuário que deverá informar o prato, a sobremesa e a bebida.
    
    (veja a tabela a seguir)
    
       PRATO:   | CALORIAS|    SOBREMESA:   | CALORIAS|       BEBIDA:     | CALORIAS
    Vegetariano = 180 cal | Abacaxi         = 75 cal  | Chá               = 20 cal
    Peixe       = 230 cal | Sorvete Diet    = 110 cal | Suco de Laranja   = 70 cal
    Carne       = 250 cal | Mouse Diet      = 170 cal | Suco de Melão     = 100 cal
    Frango      = 350 cal | Mouse Chocolate = 200 cal | Refrigerante Diet = 65 cal
    */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Olá, Seja Bem-vindo(a)!");
        //Ler entrada - prato
        System.out.println("------------------------------------------ \nMenu - PRATO");
        System.out.println("1 - VEGETARIANO \n2 - PEIXE \n3 - CARNE \n4 - FRANGO");
        System.out.print(">> Informe um numero referente a um dos PRATOS acima: ");
        int prato = input.nextInt();

        switch (prato) {
            case 1:
                prato = 180;
                break;
            case 2:
                prato = 230;
                break;
            case 3:
                prato = 250;
                break;
            case 4:
                prato = 350;
                break;
            default:
                prato = 0;
                System.out.println("Numero nao corresponde a nenhum PRATO da lista!");
                break;
        }
        //Ler entrada - sobremesa
        System.out.println("------------------------------------------ \nMenu - SOBREMESA");
        System.out.println("1 - ABACAXI \n2 - SORVETE DIET \n3 - MOUSE DIET \n4 - MOUSE CHOCOLATE");
        System.out.print(">> Informe um numero referente a uma das SOBREMESAS acima: ");
        int sobremesa = input.nextInt();

        switch (sobremesa) {
            case 1:
                sobremesa = 75;
                break;
            case 2:
                sobremesa = 110;
                break;
            case 3:
                sobremesa = 170;
                break;
            case 4:
                sobremesa = 200;
                break;
            default:
                sobremesa = 0;
                System.out.println("Numero nao corresponde a nenhuma SOBREMESA da lista!");
                break;
        }
        //Ler entrada - bebida
        System.out.println("------------------------------------------ \nMenu - SOBREMESA");
        System.out.println("1 - CHÁ \n2 - SUCO DE LARANJA \n3 - SUCO DE MELÃO \n4 - REFRIGERANTE DIET");
        System.out.print(">> Informe um numero referente a uma das BEBIDAS acima: ");
        int bebida = input.nextInt();

        switch (bebida) {
            case 1:
                bebida = 20;
                break;
            case 2:
                bebida = 70;
                break;
            case 3:
                bebida = 100;
                break;
            case 4:
                bebida = 65;
                break;
            default:
                bebida = 0;
                System.out.println("Numero nao corresponde a nenhuma BEBIDA da lista!");
                break;
        }

        int totalCal = prato+sobremesa+bebida;
        System.out.println("------------------------------------------ \nO total de calorias do seu pedido é de: "+totalCal+" Cal.");
    }
    
}
