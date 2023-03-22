import java.util.Scanner;
/*
Se dispone de un conjunto de N familias, cada una de las cuales tiene una M cantidad de
hijos. Escriba un programa que pida la cantidad de familias y para cada familia la
cantidad de hijos para averiguar la media de edad de los hijos de todas las familias.
*/
public class Ej_14Extras {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        System.out.println("Cantidad de familias : ");
        double TH = 0 , D = 0 , A = 0 , V = 0 , E , M , N = leer.nextInt();
        for (int i = 0; i < N; i++) {
            System.out.println("Cantidad de hijos de la familia n°"+ (i+1));
            M = leer.nextInt();
            TH = TH + M ;
            for (int j = 0; j < M; j++) {
                System.out.println("Edad del hijo n°"+ (j+1));
                E = leer.nextInt();
                if (E >= 0 && E <= 10){
                    D = D + 1 ;
                } else if (E >= 11 && E <= 18) {
                    A = A + 1 ;
                } else 
                    V = V + 1 ;
            }
        }
        System.out.println("El "+ (D*100/TH) +"% tienen entre 0 a 10 años.");
        System.out.println("El "+ (A*100/TH) +"% tienen entre 11 y 18 años.");
        System.out.println("El "+ (V*100/TH) +"% son mayores de 18 años.");
    }
}
