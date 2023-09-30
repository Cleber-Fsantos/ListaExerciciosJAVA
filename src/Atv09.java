import java.util.Scanner;

public class Atv09 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o nome de usuário: ");
        String usuario = leitor.next();
        System.out.println("Digite a senha: ");
        String senha = leitor.next();

                if (usuario.equals("admin")  && senha.equals("123")) {
                    System.out.println("Login bem-sucedido!");
                } else {
                    System.out.println("Nome de usuário ou senha incorretos.");
                }
    }
}
