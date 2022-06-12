import java.util.Scanner;

public class Ejercicio1_level1 {
   
    
    public static void main(String args[]) {

        Scanner entrada = new Scanner(System.in);
        String usuario = "";
        
        System.out.println("Ingrese su nombre de usuario: ");
        usuario = entrada.nextLine();   
        
        System.out.println("HOLA " + usuario + "!!!");
    }
}

