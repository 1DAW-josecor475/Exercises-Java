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
        int seconds;
        boolean isOver = false;
        while (!isOver) {
            System.out.println("Introduzca un número total de segundos. Para detener el programa, introduzca un " +
                               "valor negativo:");
            int seconds_input = sc.nextInt();
            if (seconds_input < 0) {
                System.out.println("*ERROR: El valor introducido no es válido.");
            } else {
                hours = seconds_input / 3600;
                minutes = (seconds_input % 3600) / 60;
                seconds = seconds_input % 60;

                System.out.println("Hay " + hours + " horas, " + minutes + " minutos y " + seconds + " segundos.");
                isOver = true;
            }
        }



    }
}
