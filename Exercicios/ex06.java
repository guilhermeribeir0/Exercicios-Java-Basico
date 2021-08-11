import java.util.Scanner;

public class ex06 {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int valor;

        System.out.print("Digite um valor: ");
        valor = input.nextInt();

        int antes = valor-1;
        int suce = valor+1;

        System.out.println("Antecessor: "+antes);
        System.out.println("Sucessor: "+suce);

    
}

}
