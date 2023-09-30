public class Atv01 {
    public static void main(String[] args) {
        String[] listaProfessores = {"Alana", "Aléxia", "Jéssica", "Odirlei", "Possarle", "Samanta", "Thiago"};
        for(int contador = 0; contador < listaProfessores.length; contador++){
            System.out.print("O índice atual é: " + contador + "\n");

            if(contador == 0){
                System.out.print("O número de indice do(a) professor(a) " + listaProfessores[contador] + " é Zero\n");
            }else if(contador % 2 == 0){
                System.out.print("O número de indice do(a) professor(a) " + listaProfessores[contador] + " é Par\n");
            }else{
                System.out.print("O número de indice do(a) professor(a) " + listaProfessores[contador] + " é Impar\n");
            }
        }
    }
}