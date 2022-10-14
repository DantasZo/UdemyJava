import java.util.Scanner;

public class Exerci5 {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
     /* Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        if( x>0 )
        System.out.println("Numero positivo!");
        else 
        System.out.println("Numero negativo!");
        int x = sc.nextInt();
        if (x % 2 == 0)
        System.out.println("Numero par! ");
        else
        System.out.println("numero impar!");
        int x = sc.nextInt();
        int y = sc.nextInt();
        if( x % y == 0 || y % x == 0 )
        System.out.println("São multiplos! ");
        else
        System.out.println("Não são multiplos!");        
        if ( x - y < 0 || y - x < 0){
        int i = y - x * 1;
        }
        */
        int x = sc.nextInt();
        int y = sc.nextInt();
        
		
		int duracao;
		if (x < y) {
			duracao = x - y;
		}
		else {
			duracao = 24 - x + y;
		}
        if (duracao < 0) {

        duracao = duracao * -1;
        System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
        }
		else
		System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
    }
}
