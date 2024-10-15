/*
* Introducir la fecha actual y mostrar el número total de días transcurridos desde el inicio de este
* año, considerando que todos los meses tienen 30 días.
*/
package boletin6;
import java.util.Scanner;

public class exercise02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int daysGone;

        System.out.println("Introduzca el día actual: ");
        int day = sc.nextInt();
        System.out.println("Introduzca el mes actual: ");
        int month = sc.nextInt();

        if (day == 30) {
            daysGone = month * 30;
        } else {
            daysGone = ((month - 1) * 30) + day;
        }

        System.out.println("Han transcurrido un total de " + daysGone + " días.");
    }
}
