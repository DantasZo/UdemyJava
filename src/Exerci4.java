import java.util.Scanner;

public class Exerci4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a senha: ");
        int senha = sc.nextInt();

        while (senha != 3033) {

            System.out.println("SENHA INVALIDA!! TENTE NOVAMENTE!");
            senha = sc.nextInt();

        }
    
        System.out.println("Acesso permitido! ");
    }
}
