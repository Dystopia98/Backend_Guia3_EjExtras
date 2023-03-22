import java.util.Scanner;
/*
Dado un tiempo en minutos, calcular su equivalente en días y horas.
Por ejemplo, si el usuario ingresa 1600 minutos,el sistema debe calcular su equivalente: 1 día, 2 horas.
*/
public class Ej_1Extras {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Tiempo :");
        int Minutos = leer.nextInt();
        int hora = 0 , dias = 0,aux;
        aux = Minutos;
        do {
            if (Minutos >= 60){
                Minutos = Minutos - 60;
                hora = hora + 1;
                if (hora == 24) {
                    hora = 0;
                            dias = dias +1;
                }
            }
        } while (Minutos >= 60);
        System.out.println(+ aux +" es igual a "+ dias +" Dias ,"+ hora +" Horas ,"+ Minutos +" Minutos.");
    }
}