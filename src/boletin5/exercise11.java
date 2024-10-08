/*
* Escribe un algoritmo que pida al usuario 10 números enteros (pueden ser positivos, negativos o cero).
* Cuando acabe de insertar los números, el algoritmo debe mostrar la suma de los números positivos, la
* media de los números negativos y el número de ceros que ha introducido el usuario.
*/
package boletin5;
import java.util.Scanner;

public class exercise11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int positiveSum = 0;
        int meanNegative = 0;
        int countNegatives = 0;
        int countZero = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Introduzca un número entero: ");
            n = sc.nextInt();

            if (n > 0) {
                positiveSum += n;
            } else if (n < 0) {
                meanNegative += n;
                countNegatives++;
            } else {
                countZero++;
            }
        }
        meanNegative = meanNegative / countNegatives;

        System.out.println("La suma de los números positivos es: " + positiveSum + ".\n" +
                           "La media de los números negativos es: " + meanNegative+ ".\n" +
                           "El total de ceros introducidos es: " + countZero + ".");
    }
}
