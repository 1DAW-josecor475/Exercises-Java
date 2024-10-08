/*
* Escribe un algoritmo que vaya pidiendo números al usuario y vaya mostrando por pantalla si el número
* introducido es par o impar (indistintamente que sea positivo o negativo). El algoritmo terminará cuando el
* usuario introduzca el número cero.
*/
package boletin5;
import java.util.Scanner;

public class exercise10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        while (true) {
            System.out.println("Introduzca un número: ");
            n = sc.nextInt();

            if (n == 0) {
                System.out.println("Cerrando proceso...");
                break;
            }else if (n % 2 == 0) {
                System.out.println("El número " + n + " es par");
            } else {
                System.out.println("El número " + n + " es impar");
            }
        }
    }
}
