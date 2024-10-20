/*
* Introducir un número de cualquier cifra y mostrar la suma de sus cifras.
*/
package boletin6;
import java.util.Scanner;

public class exercise10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un número: ");
		long userNumber = sc.nextLong();
		int allDigitsSum = 0;

		while (userNumber > 0) {
			allDigitsSum += userNumber % 10;    // Sum last digit of userNumber
			userNumber /= 10;    // Remove last digit of userNumber
		}
		System.out.println("La suma de los dígitos es: " + allDigitsSum);
    }
}
