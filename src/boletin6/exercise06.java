/*
* Introducir un número de tres cifras y muestra la unidad, decena y la centena
*/
package boletin6;
import java.util.Scanner;

public class exercise06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int unit;
        int ten;
        int hundred;
        boolean isCalculated = false;

        while (!isCalculated) {
            System.out.println("Introduzca un número de tres cifras: ");
            int n = sc.nextInt();
            if (n < 100 || n > 999) {
                System.out.println("El número introducido no es de tres cifras.");
            } else {
                unit = n % 10;
                ten = (n / 10) % 10;
                hundred = n / 100;

                System.out.println("La unidad es: " + unit + ".\n" +
                        "La decena es: " + ten + ".\n" +
                        "La centena es: " + hundred + ".");
                isCalculated = true;
            }

        }

    }
}
