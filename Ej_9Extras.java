
import java.util.Scanner;

/*
Simular la división usando solamente restas. Dados dos números enteros mayores que 
uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo restas. 
Método: Restar el dividendo del divisor hasta obtener un resultado menor que el 
divisor, este resultado es el residuo, y el número de restas realizadas es el cociente.
          Por ejemplo: 50 / 13:
                              50 – 13 = 37     una resta realizada
                              37 – 13 = 24     dos restas realizadas
                              24 – 13 = 11     tres restas realizadas
     dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.
     ¿Aún no lo entendiste? Recomendamos googlear división con restas sucesivas.
 */
public class Ej_9Extras {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int N1 , AuxN1 , N2 , AuxN2 , N3, C = 0;
        System.out.println("Ingresar 2 números(uno mayor que otro)");
        N1 = leer.nextInt();
        N2 = leer.nextInt();
        AuxN1 = N1 ;
        AuxN2 = N2 ;
        if (N1 > N2) {
            do {
                N3 = N1 - N2;
                System.out.println(N1 +" - "+ N2 + " = "+ N3);
                N1 = N3;
                C = C + 1;
                System.out.println(C +" resta/s realizada/s.");
                System.out.println("--------------------");
            } while (N1 > N2);
            System.out.println("          Resultado de "+ AuxN1 +"/"+ AuxN2 +" = "+ C);
            System.out.println("          Residuo = "+ N1);
        } else {
            do {
                N3 = N2 - N1;
                System.out.println(N2 +" - "+ N1 + " = "+ N3);
                N2 = N3;
                C = C + 1;
                System.out.println(C +" resta/s realizada/s.");
                System.out.println("--------------------");
            } while (N2 > N1);
            System.out.println("          Resultado de "+ AuxN2 +"/"+ AuxN1 +" = "+ C);
            System.out.println("          Residuo = "+ N2);
        }
    }
}
