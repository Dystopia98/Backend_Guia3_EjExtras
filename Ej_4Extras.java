import java.util.Scanner;
/*
Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10
y se muestre su equivalente en romano.
*/
public class Ej_4Extras {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresar un número del 1 al 10");
        int N = leer.nextInt();
        switch (N){
            case 1 :
                System.out.println(+N+" = I");
                break;
            case 2 :
                System.out.println(+N+" = II");
                break;
            case 3 :
                System.out.println(+N+" = III");
                break;
            case 4 :
                System.out.println(+N+" = IV");
                break;
            case 5 :
                System.out.println(+N+" = V");
                break;
            case 6 :
                System.out.println(+N+" = VI");
                break;
            case 7 :
                System.out.println(+N+" = VII");
                break;
            case 8 :
                System.out.println(+N+" = VIII");
                break;
            case 9 :
                System.out.println(+N+" = IX");
                break;
            case 10 :
                System.out.println(+N+" = X");
                break;
            default :
                if (N <= 0){
                    System.out.println("El número es menor a 1.");
                } else
                    System.out.println("El número es mayor a 10");
                break;
        }
    }
}
