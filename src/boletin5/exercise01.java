/*
* Escribe un algoritmo que pida un número entero positivo al usuario y muestre por pantalla todos los
* números desde el 0 hasta el número introducido por el usuario.
*/
package boletin5;
import java.util.Scanner;

public class exercise01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int limit;
        while (true) {
            System.out.println("Introduzca un número positivo: ");
            limit = sc.nextInt();
            if (limit <0) {
                System.out.println("El valor ha de ser positivo");
            } else {
                break;
            }
        }

        for (int i = 0; i <= limit; i++) {
            System.out.println("El número es " + i);
        }

    }
}
