/*
* Escribe un algoritmo que le pida al usuario dos números. Luego, muestre por pantalla el siguiente menú:
*   A. SUMAR LOS NÚMEROS.
*   B. RESTAR LOS NÚMEROS.
*   C. MULTIPLICAR LOS NÚMEROS.
*   D. DIVIDIR LOS NÚMEROS.
* El usuario debe seleccionar una de las opciones, realizando la operación que marca dicha opción. Posteriormente,
* mostrará el resultado por pantalla.
* Si el usuario elige una opción incorrecta, el programa se lo hace saber la usuario y no hace nada.
*/
package boletin4;
import java.util.Scanner;

public class exercise02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca dos números: ");
        int result, n1 = sc.nextInt(), n2 = sc.nextInt();

        System.out.println("Escoja una de las siguientes opciones: \n" +
                           "A. SUMAR LOS NÚMEROS\n" +
                           "B. RESTAR LOS NÚMEROS\n" +
                           "C. MULTIPLICAR LOS NÚMEROS\n" +
                           "D. DIVIDIR LOS NÚMEROS\n");

        String option = sc.next();

        switch (option) {
            case "A" -> {
                result = n1 + n2;
                System.out.println("El resultado de la suma es: " + result);
            }
            case "B" -> {
                result = n1 - n2;
                System.out.println("El resultado de la resta es: " + result);
            }
            case "C" -> {
                result = n1 * n2;
                System.out.println("El resultado de la multiplicación es: " + result);
            }
            case "D" -> {
                result = n1 / n2;
                System.out.println("El resultado de la división es: " + result);
            }
            default -> System.out.print("La opción introducida es errónea");
        }
    }
}
