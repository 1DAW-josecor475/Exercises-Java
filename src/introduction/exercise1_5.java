/*
* El tipo short permite almacenar valores comprendidos entre -32768 y 32767. Escribir un programa que compruebe que el
* comportamiento del tipo “short” es cíclico (es decir que el valor siguiente al máximo es el valor mínimo)
*/
package introduction;

public class exercise1_5 {
    public static void main(String[] args) {
        short n = 32767;
        System.out.println("This is the maximum value of short: " + n);
        n++;

        System.out.println("This is the value of short after sum 1: " + n);
    }
}
