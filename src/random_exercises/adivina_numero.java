/*
 * El ordenador pensará un número del 1 al 50 y te pedirá que intentes adivinarlo. El ordenador te dirá en cada intento
 * si es muy bajo o muy alto, y ganarás si adivinas el número en 6 intentos o menos.
*/
package random_exercises;
import java.util.Scanner;

public class adivina_numero {
    public static void main(String[] args) {
        int numberToGuess = (int) (Math.random() * (50 - 1));
        int userTries = 0;
        boolean endGame = false;
        Scanner sc = new Scanner(System.in);

        System.out.println("****************************\n" +
                           "* ADIVINA EL NÚMERO OCULTO *\n" +
                           "****************************");
        while (!endGame) {
            userTries++;
            if (userTries > 6) {
                System.out.println("Sin intentos restantes. Finalizando juego.");
                endGame = true;
            } else {
                System.out.println("Introduzca un número entero entre 1-50: ");
                int userGuess = sc.nextInt();
                if (userGuess > numberToGuess) {
                    System.out.println("El número oculto por adivinar es menor");
                } else if (userGuess < numberToGuess) {
                    System.out.println("El número oculto por adivinar es mayor");
                } else {
                    System.out.println("¡Felicidades! Ha adivinado el número oculto en " + userTries + " intentos.");
                    endGame = true;
                }
            }
        }
    }
}
