/*
* Escribe un algoritmo que muestre por pantala la multiplicación de los números desde el 1 hasta el 20.
*/
package boletin5;

public class exercise05 {
    public static void main(String[] args) {
        double result = 1;
        for (int i = 1; i <= 20; i++) {
            result *= i;
        }
        System.out.println("La multiplicación de los números del 1 al 20 es: " + result);
    }
}

