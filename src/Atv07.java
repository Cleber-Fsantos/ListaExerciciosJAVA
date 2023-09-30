import java.util.Scanner;
public class Atv07 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um número para verificar se é positivo ou negativo: ");
        Integer numero = leitor.nextInt();

        if (numero > 0) {
            System.out.println("positivo");
        } else if (numero < 0) {
            System.out.println("negativo");
        } else {
            System.out.println("neutro");
        }
    }
}
