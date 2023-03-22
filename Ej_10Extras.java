import java.util.Scanner;
/*
Realice un programa para que el usuario adivine el resultado de una multiplicación entre
dos números generados aleatoriamente entre 0 y 10.
El programa debe indicar al usuario si su respuesta es o no correcta. 
En caso que la respuesta sea incorrecta se debe permitir al usuario ingresar su respuesta nuevamente. 
     Para realizar este ejercicio investigue como utilizar la función Math.random() de Java.
*/
public class Ej_10Extras {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        double N1 = Math.random()*10 , N2 = (Math.random()*10) ;
        int Num1 = (int)(N1*10/10) , Num2 = (int)(N2*10/10) , R ;
        System.out.println("Adivine el resultado de la multiplicación de 2 números aleatorios del 0 al 10");
        R = leer.nextInt();
        while (R != Num1 * Num2){
            System.out.println(Num1 +"Respuesta incorrecta,intente de nuevo."+ Num2);
            if (R < Num1 * Num2){
                System.out.println("          Mas.");
                R = leer.nextInt();
            }
            if (R > Num1 * Num2){
                System.out.println("          Menos.");
                R = leer.nextInt();                
            }
            if (R == Num1 * Num2){
                System.out.println("¡CorrectO!");
                break;
            }
        }
    }
}
