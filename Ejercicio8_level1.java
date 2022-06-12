import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio8_level1 {
    public static void main(String[] args) {
        Map<String, String> datos = new HashMap<>();
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese su Nombre y Apellido:");
        String nombre = scan.nextLine();
        datos.put("Nombre y Apellido", nombre);
        System.out.println(datos.size());
        
        System.out.println("Ingrese su edad:");
        String edad = Integer.toString(scan.nextInt());
        datos.put("edad", edad);
        System.out.println(datos.size());
        
        System.out.println("Ingrese su direccion:");
        String direccion = scan.nextLine();          //Línea provisoria
        String direc = scan.nextLine();              //Línea que cuenta
        datos.put("direccion", direc);
        System.out.println(datos.size());

        System.out.println("Ingrese su ciudad:");
        String ciudad = scan.nextLine();
        datos.put("ciudad", ciudad);
        System.out.println(datos.size());
        scan.close();
        
        System.out.println(datos.get("ciudad") + " - " + 
        datos.get("direccion") + " - " +
        datos.get("edad") + " - " + 
        datos.get("Nombre y Apellido"));
    }
}