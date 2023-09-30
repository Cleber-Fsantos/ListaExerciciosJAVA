import java.util.Scanner;

public class Atv02 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String senha;

        do{
            System.out.println("Digite a senha: ");
            senha = leitor.next();
            if (! senha.equals("123")) {
                System.out.println("\nSenha Incorreta!\n");
            }
        }while (! senha.equals("123"));

        System.out.println("Senha correta!");
    }
}
