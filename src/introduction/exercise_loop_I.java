/*
* Escribe un programa que diga si un número introducido por teclado es o no primo. Un número primo es aquel que sólo es
* divisible entre él mismo y la unidad.
*/
package introduction;
import java.util.Scanner;

public class exercise_loop_I {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n;
        boolean isPrime = false;
        while (!isPrime) {
            System.out.println("Inserte un número: ");
            n = reader.nextInt();

            if (n < 0) {
                System.out.println("No existen números primos negativos");
            } else {
                if (n % 2 != 0 || n == 2) {
                    System.out.println("El número " + n + " es primo");
                    System.out.println("Cerrando programa...");
                    isPrime = true;
                } else {
                    System.out.println("El número " + n + " no es primo");
                }
            }
        }
    }
}
