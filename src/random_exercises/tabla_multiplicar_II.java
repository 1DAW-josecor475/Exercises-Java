/*
 * Realiza un algoritmo para que el programa pida un número inicial y un número final y pinte las tablas de
 * multiplicar desde el número inicial al número Final

 */
package random_exercises;
import java.util.Scanner;

public class tabla_multiplicar_II {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca un número inicial: ");
        int initialNumber = sc.nextInt();
        System.out.println("Introduzca un número final: ");
        int lastNumber = sc.nextInt();

        for (int i = initialNumber; i <= lastNumber; i++) {
            System.out.println("** TABLA DEL " + i + " **");
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + i*j);
            }
            System.out.println("**************************");
        }
    }
}
