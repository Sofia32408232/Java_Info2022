import java.util.Scanner;

public class Ejercicio5_level1{
     
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
       
        int veces = 0;
        
        System.out.println("Ingrese el primer número: ");
        int a = in.nextInt();   
        
        System.out.println("Ingrese el segundo número: ");
        int b = in.nextInt();
        int i = 1;
        
        for(i = 1; i <= b; i++) {
          veces = veces + a;
      }
       
       System.out.println("El resultado de la multiplicacón es : " + veces);
  
    }
}