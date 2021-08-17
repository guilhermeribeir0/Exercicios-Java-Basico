import java.util.Scanner;

public class Ex02 {

    /*
    Problema proposto: Ler a idade do usuário e informar, de acordo com legislação brasileira, 
    se o voto do usuário é OBRIGATÓRIO, FACULTATIVO ou se ele NÃO VOTA.
    */
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Informe sua idade: ");
        int idade = input.nextInt();

        if (idade < 16) {
            System.out.println("SITUAÇÃO: NÃO VOTA!");
        } else if ((idade >= 16 && idade < 18) || (idade > 70)){
            System.out.println("SITUAÇÃO: VOTO FACULTATIVO!");
        } else {
            System.out.println("SITUAÇÃO: VOTO OBRIGATÓRIO!");
        }
        
    }

}
