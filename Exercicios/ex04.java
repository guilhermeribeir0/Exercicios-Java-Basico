import java.util.Scanner;

public class ex04 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int ipi;
        int codp1;
        int valorp1;
        int quantp1;
        int codp2;
        int valorp2;
        int quantp2;
        
        System.out.print("Digite o valor do IPI: ");
        ipi = input.nextInt();
        System.out.print("Digite o código da peça 1: ");
        codp1 = input.nextInt();
        System.out.print("Digite o valor da peça 1: ");
        valorp1 = input.nextInt();
        System.out.print("Digite a quantidade de peças 1: ");
        quantp1 = input.nextInt();
        System.out.print("Digite o código da peça 2: ");
        codp2 = input.nextInt();
        System.out.print("Digite o valor da peça 2: ");
        valorp2 = input.nextInt();
        System.out.print("Digite a quantidade de peças 2: ");
        quantp2 = input.nextInt();

        int valorfinal = (valorp1*quantp1+valorp2*quantp2)*(ipi/100+1);

        System.out.print("O valor final: "+valorfinal);

    }
    
}
