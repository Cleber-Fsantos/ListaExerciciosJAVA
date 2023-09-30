public class Atv04 {
    public static void main(String[] args) {
        int salario = 1000;

        while (salario < 5000) {
            System.out.println("\nO salário ainda é R$" + salario);
            salario += 100;
        }
        System.out.println("\nO salário final é R$" + salario);
    }
}
