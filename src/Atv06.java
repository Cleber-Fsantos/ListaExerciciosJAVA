import java.util.Scanner;
public class Atv06 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a Primeira nota: ");
        float primeiraNota = leitor.nextFloat();
        System.out.println("Digite a Segunda nota: ");
        float segundaNota = leitor.nextFloat();

        float media = (primeiraNota + segundaNota) / 2;

        if (media >= 6) {
            System.out.println("Meus parabéns! \nSua média foi: " + media);
        } else {
            System.out.println("Você não passou. \nSua média foi: " + media + "\nEstude um pouco mais! :(");
        }

    }
}