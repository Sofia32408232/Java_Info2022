import java.util.Scanner;

public class Ejercicio2_level1{
     
    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        int num_uno = 0, num_dos = 0, resultado_suma = 0, resultado_resta = 0, resultado_multiplicacion = 0, resultado_division = 0, resultado_modulo = 0;
        
        System.out.println("Ingrese el primer número: ");
        num_uno = in.nextInt();   
        
        System.out.println("Ingrese el segundo número: ");
        num_dos = in.nextInt();

       resultado_suma = num_uno + num_dos;
       resultado_resta = num_uno - num_dos;
       resultado_multiplicacion = num_uno * num_dos;
       resultado_division = num_uno / num_dos;
       resultado_modulo = num_uno % num_dos;
       
       System.out.println(num_uno + " + " + num_dos + " = " + resultado_suma);
       System.out.println(num_uno + " - " +  num_dos + " = " + resultado_resta);
       System.out.println(num_uno + " * " + num_dos + " = " + resultado_multiplicacion);
       System.out.println(num_uno + " / " + num_dos + " = " + resultado_division);
       System.out.println(num_uno + " % " + num_dos + " = " + resultado_modulo);
    }
}