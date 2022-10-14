import java.util.Scanner;

public class Exerci4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /*
         * System.out.println("Digite a senha: ");
         * int senha = sc.nextInt();
         * 
         * while (senha != 3033) {
         * 
         * System.out.println("SENHA INVALIDA!! TENTE NOVAMENTE!");
         * senha = sc.nextInt();
         * 
         * }
         * 
         * System.out.println("Acesso permitido! ");
         */

        System.out.println("Insira as cordenadas X e Y:");
        int x = sc.nextInt();
        int y = sc.nextInt();
        while (x != 0 && y != 0) {

            if (x > 0 && y > 0) {
                System.out.println("Primeiro quadrante !");
            }
            if (x < 0 && y < 0) {
                System.out.println("Terceiro quadrante !");
            }
            if (x > 0 && y < 0) {
                System.out.println("Quarto quadrante !");
            }
            if (x < 0 && y > 0) {
                System.out.println("Segundo quadrante !");
            }

            System.out.println("Insira as novas cordenadas de X e Y:");
            x = sc.nextInt();
            y = sc.nextInt();
        }
    }
}
