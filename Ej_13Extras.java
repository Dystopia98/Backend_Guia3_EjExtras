/*
Crear un programa que dibuje una escalera de números, donde cada línea de
 números comience en uno y termine en el número de la línea.
Solicitar la altura de la escalera al usuario al comenzar.
     Ejemplo: si se ingresa el número 3:
     1
     12
     123
*/
public class Ej_13Extras {
    public static void main(String[] args){
        double N = Math.random()*10;
        int num = (int) (N*10/10);
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(j+1);
            }
            System.out.println("");
        }
    }
}
