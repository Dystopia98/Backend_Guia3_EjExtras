import java.util.Scanner;
/*
Leer la altura de N personas y determinar el promedio de estaturas que
se encuentran por debajo de 1.60 mts. y el promedio de estaturas en general.
*/
public class Ej_6Extras {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        double Altura , N = (Math.random()*10);
        int total = 0 , bajas = 0 , M = (int) (N)*100/100;
        int Cantidad[] = new int[M];
        System.out.println("Ingresar la altura de "+ M +" personas(en centimetros)");
        for (int i = 0; i < M; i++) {
            System.out.println("Altura de la persona "+ (i+1) +" :");
            Altura = leer.nextFloat();
            total = total + 1 ;
            if (Altura/100 < 1.60){
                bajas = bajas + 1;
            }
        }
        System.out.println("El promedio en total son "+ bajas +"("+ (bajas*100)/M + "%) personas de");
        System.out.println("baja estatura de un total de "+ M +" personas");
    }
}
