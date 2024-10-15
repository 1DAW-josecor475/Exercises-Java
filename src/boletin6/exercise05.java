/*
* Realizar un algoritmo que muestre la siguiente gráfica (usando bucles):
* 999999999
* 88888888
* 7777777
* 666666
* 55555
* 4444
* 333
* 22
* 1
*/
package boletin6;

public class exercise05 {
    public static void main(String[] args) {
        for (int i = 9; i > 0; i--) {
            for (int j = i ; j > 0; j-- ) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
