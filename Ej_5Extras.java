import java.util.Scanner;
/*
 Una obra social tiene tres clases de socios:
--Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de 
descuento en todos los tipos de tratamientos.
--Los socios tipo ‘B’ abonan una cuota moderada y 
tienen un 35% de descuento para los mismos tratamientos que los socios del tipo A.
--Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos tratamientos.
--Solicite una letra (carácter) que representa la clase de un socio, y luego un valor real que represente 
el costo del tratamiento (previo al descuento) y determine el importe en efectivo a pagar por dicho socio.
*/
public class Ej_5Extras {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        System.out.println("Tipo de socio.");
        String Socio = leer.next();
        double Costo , Total ;
        switch (Socio.toUpperCase()){
            case "A" :
                System.out.println("Costo del tratamiento.");
                Costo = leer.nextInt();
                System.out.println("          Tipo A");
                System.out.println("Deberá abonar "+ Costo*0.5 +" con el descuento del 50%("+ Costo*0.5 +") de "+ Costo);
                break;
            case "B" :
                System.out.println("Costo del tratamiento.");
                Costo = leer.nextInt();
                System.out.println("          Tipo B");
                System.out.println("Deberá abonar "+ Costo*0.75 +" con el descuento del 35%("+ Costo*0.35 +") de "+ Costo);
                break;
            case "C" :
                System.out.println("Costo del tratamiento.");
                Costo = leer.nextInt();
                System.out.println("          Tipo C");
                System.out.println("Deberá abonar "+ Costo +" al no obtener descuento en su tipo.");
                break;
            default :
                System.out.println("Tipo no validado.");
                break;
        }
    }
}
