/*
 * Diseñar e implementar un programa que solicite al usuario un valor no negativo n y visualice la salida:
 * 1    2   3   ...     n-1     n
 * 1    2   3   ...     n-1
 * ...
 * 1
*/
package random_exercises;
import java.util.Scanner;

public class nested_loops_I_v2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int userNumber;

        do {
            System.out.println("Introduzca un número positivo: ");
            userNumber = sc.nextInt();
        } while (userNumber < 0);

        for (int i = 1; i <= userNumber; i++) {   // Prints each line
            for (int j = 1; j <= userNumber - i + 1; j++) {      // Prints the numbers inside each line
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
