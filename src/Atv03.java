import java.util.Scanner;
public class Atv03 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        float numero;

        do {
            System.out.println("Digite um numero: ");
            numero = leitor.nextFloat();

        } while (numero != 0);

        System.out.println("Hahaha, descobriu meu número secreto!! ^^");
    }
}
