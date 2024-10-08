/*
* Escribe un algoritmo que imprima por pantalla los números pares desde 0 hasta 20
*/
package boletin5;

public class exercise02 {
    public static void main(String[] args) {
        for (int i = 0; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println("Tenemos el número par " + i);
            }
        }
    }
}
