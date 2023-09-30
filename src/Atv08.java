import java.util.Scanner;

public class Atv08 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número de 1 a 7: ");
        final int numero = leitor.nextInt();
        String dia = "";
        switch (numero) {
            case 1:
                dia = "segunda-feira";
                break;
            case 2:
                dia = "terça-feira";
                break;
            case 3:
                dia = "quarta-feira";
                break;
            case 4:
                dia = "quinta-feira";
                break;
            case 5:
                dia = "sexta-feira";
                break;
            case 6:
                dia = "sábado";
                break;
            case 7:
                dia = "domingo";
                break;
            default:
                System.out.println("Dígito inválido. Digite um número de 1 a 7.");
                break;
        }
        System.out.println("O número " + numero + " corresponde a " + dia + ".");
    }
}
