/*
* Elaborar un algoritmo donde se introduzca por teclado un número natural de hasta 2 cifras. Si
* tiene una cifra muestre lo mínimo que le falta para ser un número de 2 cifras; de lo contrario
* muestre lo mínimo que le falta para ser un número de 3 cifras. Considerar que el usuario introduce
* números de hasta dos cifras.
*/
package boletin6;
import java.util.Scanner;

public class exercise07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nToGoal;

        while (true) {
            System.out.println("Introduzca un número natural de máximo dos cifras: ");
            int n = sc.nextInt();

            if (n <= 0 || n > 99) {
                System.out.println("El número introduido no entra dentro de los valores permitidos.");
            } else {
                if (n < 10) {
                    nToGoal = 10 - n;
                    System.out.println("Al número " + n + " le falta " + nToGoal + " para ser un número de dos cifras");
                    break;
                } else {
                    nToGoal = 100 - n;
                    System.out.println("Al número " + n + " le falta " + nToGoal + " para ser un número de tres cifras");
                    break;
                }
            }
        }
    }
}
