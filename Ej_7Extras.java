
import java.util.Scanner;

/*
Realice un programa que calcule y visualice el valor máximo, el valor mínimo 
y el promedio de n números (n>0).El valor de n se solicitará al principio del programa y 
los números serán introducidos por el usuario. Realice dos versiones del programa, 
una usando el bucle “while” y otra con el bucle “do - while”.
 */
public class Ej_7Extras {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese cantidad de números.");
        int Num, Min = 100000, Max = 0, N = leer.nextInt();
        System.out.println("Elija la versión del programa");
        System.out.println("1) Bucle While.");
        System.out.println("2) Bucle Do-While.");
        int V = leer.nextInt();
        if(V == 1 || V == 2){
        System.out.println("Ingrese " + N + " números.");
        }
        switch (V) {
            case 1:
                System.out.println("VERSIÓN        BUCLE WHILE");
                while (N > 0) {
                    Num = leer.nextInt();
                    if (Num < Min) {
                        Min = Num;
                    } else if (Num > Max) {
                        Max = Num;
                    }
                    N = N - 1;
                }
                System.out.println("El número menor introducido fué : " + Min);
                System.out.println("El número mayor introducido fué : " + Max);
                break;
            case 2:
                System.out.println("VERSIÓN        BUCLE DO-WHILE");
                do {
                    Num = leer.nextInt();
                    if (Num < Min) {
                        Min = Num;
                    } else if (Num > Max) {
                        Max = Num;
                    }
                    N = N - 1;
                } while (N > 0);
                System.out.println("El número menor introducido fué : " + Min);
                System.out.println("El número mayor introducido fué : " + Max);
                break;
            default:
                System.out.println("Versión invalida.");
                break;
        }
    }
}
