/*
* Escribe un algoritmo que imprima por pantalla los 20 primeros números pares positivos
*/
package boletin5;

public class exercise3 {
    public static void main(String[] args) {
        int counter = 1;
        int i = 0;
        while (counter <= 20) {
                i++;
                if (i % 2 == 0) {
                    System.out.println(counter + ". El número par " + i);
                    counter++;
            }
        }
    }
}
