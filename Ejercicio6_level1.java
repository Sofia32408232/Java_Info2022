import java.util.Scanner;

public class Ejercicio6_level1{
     
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
       
        int veces = 1;
        
        System.out.println("Ingrese el primer número para la base de la potencia: ");
        int a = in.nextInt();   
        
        System.out.println("Ingrese el segundo número para el exponente de la potencia: ");
        int b = in.nextInt();
        int i = 1;
        
        for(i = 1; i <= b; i++) {
          veces = veces * a;
      }
       
       System.out.println("El resultado de la potencia es : " + veces);
  
    }
}