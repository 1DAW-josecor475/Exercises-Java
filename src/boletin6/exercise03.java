/*
* Diseñe un algoritmo que lea un número de tres cifras y determine si es o no capicúa
*/
package boletin6;
import java.util.Scanner;

public class exercise03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int original;
        int digit;
        int reversed = 0;
        boolean isPalindromic = false;
        while (!isPalindromic) {
            System.out.println("Introduzca un número de tres cifras: ");
            n = sc.nextInt();
            original = n;

            // Check if it is a three digits number
            if (n < 100 || n > 999) {
                System.out.println("El número introducido no tiene tres cifras.");
            } else {
                while (n != 0) {
                    digit = n % 10;
                    reversed = reversed * 10 + digit;
                    n /= 10;
                }

                if (original == reversed) {
                    System.out.println("El número " + original + " es capicúa");
                    isPalindromic = true;
                } else {
                    System.out.println("El número " + original + " no es capicúa");

                }
                reversed = 0;
            }
        }
    }
}
