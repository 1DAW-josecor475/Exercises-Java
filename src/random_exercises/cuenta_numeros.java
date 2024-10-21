/*
 * Realiza un algoritmo que pinte por pantalla los números pares entre 1 y 30, exceptuando los números comprendidos
 * entre 10 y 20 (ambos excluidos también). Deberá devolver también la cantidad total de números que ha pintado y la
 * suma de todos ellos.
*/
package random_exercises;

public class cuenta_numeros {
    public static void main(String[] args) {
        int sumNumbersPrinted = 0;
        int counter = 0;
        for (int i = 1; i <= 30; i++) {
            if ((i < 10 || i > 20) && i % 2 == 0) {
                System.out.println("Número: " + i);
                sumNumbersPrinted += i;
                counter++;
            }
        }
        System.out.println("La suma de los " + counter + " números impresos por pantalla es: " + sumNumbersPrinted);
    }
}
