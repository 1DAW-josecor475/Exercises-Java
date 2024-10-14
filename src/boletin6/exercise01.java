/*
* Hacer un programa que introduzca por teclado un número total de segundos y que luego pueda
* mostrar la cantidad de horas, minutos y segundos que existen en el valor introducido
*/
package boletin6;
import java.util.Scanner;

public class exercise01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hours;
        int minutes;

        while (true) {
            System.out.println("Introduzca un número total de segundos. Para detener el programa, introduzca 0:");
            int seconds = sc.nextInt();
            if (seconds == 0) {
                break;
            } else {
                hours = seconds / 3600;
                minutes = seconds / 60;

                System.out.println("Hay " + hours + " horas, " + minutes + " minutos y " + seconds + " segundos.");
            }
        }



    }
}
