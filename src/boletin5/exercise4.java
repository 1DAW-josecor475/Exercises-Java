/*
* Escribe un algoritmo que muestre por pantalla la suma de los números desde el 1 hasta el 20
*/
package boletin5;

public class exercise4 {
    public static void main(String[] args) {
        int result = 0;
        for (int i = 1; i <= 20; i++) {
            result += i;
        }
        System.out.println("La suma de los números del 1 al 20 es: " + result);
    }
}
