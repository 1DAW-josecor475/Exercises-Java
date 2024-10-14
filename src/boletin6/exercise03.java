/*
* Diseñe un algoritmo que lea un número de tres cifras y determine si es o no capicúa
*/
package boletin6;
import java.util.Scanner;

public class exercise03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int firstDigit;
        int thirdDigit;

        while (true) {
            System.out.println("Introduzca un número de tres cifras: ");
            n = sc.nextInt();

            if (n < 100 || n > 999) {
                System.out.println("El número introducido no tiene tres cifras.");
            } else {
                firstDigit = n / 100;
                thirdDigit = n / 10;

                if (firstDigit == thirdDigit) {
                    System.out.println("El número " + n + " es capicúa");
                } else {
                    System.out.println("El número " + n + " no es capicúa");
                }
            }
        }
    }
}
