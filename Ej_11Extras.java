import java.util.Scanner;
/*
Escribir un programa que lea un número entero y devuelva el número de dígitos que componen ese número.
     Por ejemplo, si introducimos el número 12345, el programa deberá devolver 5.
Calcular la cantidad de dígitos matemáticamente utilizando el operador de división. 
          Nota: recordar que las variables de tipo entero truncan los números o resultados.
*/
public class Ej_11Extras {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        int N , C = 0;
        System.out.println("Ingresar un número.");
        N = leer.nextInt();
        do {
            N = N/10 ;
            C = C + 1 ;
        } while(N != 0);
        System.out.println("Es un número de "+ C +" cifra/s.");
    }
}
