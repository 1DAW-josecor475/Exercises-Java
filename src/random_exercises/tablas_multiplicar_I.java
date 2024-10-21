/*
 *  Realiza un programa que pinte por pantalla las tablas de multiplicar de los números del 1 al 10.
*/
package random_exercises;

public class tablas_multiplicar_I {
    public static void main(String[] args) {
        int n = 10;

        for (int i = 1; i <= n; i++) {
            System.out.println("** TABLA DEL " + i + " **");
            for (int j = 1; j <= n; j++) {
                System.out.println(i + " x " + j + " = " + i*j);
            }
            System.out.println("**************************");
        }

    }
}

