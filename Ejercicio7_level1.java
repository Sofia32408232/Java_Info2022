import java.util.Scanner;

public class Ejercicio7_level1{

    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese una palabra. ");
        String palabra = entrada.nextLine();
        String palabraUpper = "";
        for (int i = 0; i < palabra.length(); i++) {
            char letra = myUpper(palabra.charAt(i));
            palabraUpper += letra;
            
        }
        System.out.println(palabraUpper);
        entrada.close();
    }
    public static char myUpper(char palabra){
        if (palabra >= 'a' || palabra <= 'z') {
            palabra = (char) (palabra - ('a'- 'A'));
        }
            return palabra;
    }
}