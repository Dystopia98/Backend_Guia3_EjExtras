import java.util.Scanner;
/*
Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe detener la lectura y 
mostrar la cantidad de números leídos, la cantidad de números pares y la cantidad de números impares.
Al igual que en el ejercicio anterior los números negativos no deben sumarse. 
     Nota: recordar el uso de la sentencia break.
*/
public class Ej_8Extras {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        int par = 0 , impar = 0 , numeros = 0 , aux ; 
        double R = Math.random()*10;
        int N = ((int) (R*10)/10)+2; 
        aux = N ;
        System.out.println("Dar valor a "+ N + " números enteros.");
        do {
            numeros = leer.nextInt();
            if ( numeros > 0 ) {
            if ( numeros%5 == 0 ){
                break;
            } else if (numeros%2 == 0){
                par = par + 1 ;
                N = N - 1 ;
            } else {
                impar = impar + 1 ;
                N = N - 1 ;
            }
            } else if ( N < 0 ){
                N = N + 1 ;
            }
        } while( N > 0);
        System.out.println("Total de números leidos : "+ (aux-N) + "/"+aux);
        System.out.println("Total de números pares : "+ par);
        System.out.println("Total de números impares : "+ impar);
    }
}
