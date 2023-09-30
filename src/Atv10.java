import java.util.Date;
import java.util.Scanner;

public class Atv10 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o ano de nascimento:");
        int anoNascimento = leitor.nextInt();

        int anoAtual  = java.time.Year.now().getValue();

        int idade = anoAtual - anoNascimento;

                if (idade >= 18) {
                    System.out.println("Você é maior de idade.");
                } else {
                    System.out.println("Você é menor de idade.");
                }
    }
}
