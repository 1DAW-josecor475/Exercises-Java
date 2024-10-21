/*
* Realiza un programa que vaya pidiendo números hasta que se introduzca un número negativo y nos diga cuántos números
* se han introducido, la media de los impares y el mayor de los pares. El número negativo sólo se utiliza para indicar
* el final de la introducción de datos pero no se incluye en el cómputo.
*/
package introduction;
import java.util.Scanner;

public class exercise_loop_II {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int counterAll = 0;
        int counterOdds = 0;
        int sumOdds = 0;
        int maxEvenNumber = 0;
        int meanOddNumbers;
        boolean isNegative = false;

        while (!isNegative) {
            System.out.println("Inserte un número: ");
            n = sc.nextInt();
            if (n >= 0) {
                counterAll++;
                if (n % 2 == 0) {
                    maxEvenNumber = Math.max(maxEvenNumber, n);
                } else {
                    counterOdds++;
                    sumOdds += n;
                }
            } else {
                meanOddNumbers = sumOdds / counterOdds;
                System.out.println("Se han introducido " + counterAll + " números. \n" +
                                   "La media de los impares es: " + meanOddNumbers + ".\n" +
                                   "El mayor de los pares es: " + maxEvenNumber);
                isNegative = true;
            }
        }
    }
}
