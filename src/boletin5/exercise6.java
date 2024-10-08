/*
* Escribe un algoritmo que muestre por pantalla la suma de los números pares desde el 1 hasta el 20 y
* también la multiplicación de los números impares desde el 1 hasta el 20.
*/
package boletin5;

public class exercise6 {
    public static void main(String[] args) {
        int evenSum = 0;
        int oddMultiply = 1;

        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                evenSum += i;
            } else {
                oddMultiply *= i;
            }
        }
        System.out.println("La suma de los números pares es: " + evenSum + ".\n" +
                           "La multiplicación de los números impares es: " + oddMultiply);
    }
}
