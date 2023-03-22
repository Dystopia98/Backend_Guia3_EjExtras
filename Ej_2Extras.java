import java.util.Scanner;
/*
Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada una.
A continuación,realizar las instrucciones necesarias para que: 
B tome el valor de C, 
C tome el valor de A, 
A tome el valor de D y D tome el valor de B. 
Mostrar los valores iniciales y los valores finales de cada variable. 
Utilizar sólo una variable auxiliar.
*/
public class Ej_2Extras {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresar 4 variables.");
        int A,B,C,D,Aux;
        A = leer.nextInt();
        B = leer.nextInt();
        C = leer.nextInt();
        D = leer.nextInt();
        System.out.println("A = "+ A);
        System.out.println("B = "+ B);
        System.out.println("C = "+ C);
        System.out.println("D = "+ D);
        Aux = A;
        A = D;
        D = B;
        B = C;
        C = Aux;
        System.out.println("Cambiado valores...");
        System.out.println("A = "+ A);
        System.out.println("B = "+ B);
        System.out.println("C = "+ C);
        System.out.println("D = "+ D);
        
    }
}
