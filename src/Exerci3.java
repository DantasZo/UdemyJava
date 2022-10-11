import java.util.Scanner;

public class Exerci3 {

public static void main(String args[]) {
    Scanner sc = new Scanner(System.in); 
    /*    

    exercicio 3 
    int a,b;

    Scanner sc = new Scanner(System.in); 
    
    System.out.println("Insira os valores para a soma: ");
    a = sc.nextInt();
    b = sc.nextInt();
    
    System.out.println("Resultado da soma: "+(a+b));*/
   
    //area = pi*raio2 


    System.out.println("Insira o tamanho do raio do circulo: ");
    double raio,area;
    raio = sc.nextDouble(); 
    area = 3.14159*(raio*raio);
    
    System.out.printf("A area do circulo é de: %.4f",area);
}
}
