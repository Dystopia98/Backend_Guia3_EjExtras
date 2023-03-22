import java.util.Scanner;
/*
Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal.
Caso contrario mostrar un mensaje.
     Nota: investigar la función equals() de la clase String.
*/
public class Ej_3Extras {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa una letra.");
        String Letra = leer.next();
        switch (Letra.toUpperCase()){
            case "A" :
                System.out.println("Es una vocal.");
                break;
            case "E" :
                System.out.println("Es una vocal.");
                break;
            case "I" :
                System.out.println("Es una vocal.");
                break;
            case "O" :
                System.out.println("Es una vocal.");
                break;
            case "U" :
                System.out.println("Es una vocal.");
                break;
            default :
                System.out.println("No es una vocal.");
                break;
                
        }
    }
}
