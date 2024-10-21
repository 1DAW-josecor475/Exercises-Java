/*
* Escribe un algoritmo que vaya pidiendo al usuario números enteros positivos. Cuando el usuario no quiera
* insertar más números, introducirá un número negativo y el algoritmo, antes de acabar, mostrará la media
* de los números positivos que ha introducido anteriormente el usuario.
 */
package boletin5;
import java.util.Scanner;

public class exercise09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int positiveSum = 0;
        int counter = 0;
        int mean;
        boolean isNegative = false;

        while (!isNegative) {
            System.out.println("Introduzca un número entero positivo. Si quiere parar, introduzca un número entero negativo: ");
            n = sc.nextInt();
            if(n > 0) {
                positiveSum += n;
                counter++;
            } else {
                isNegative = true;
            }
        }
        mean = positiveSum / counter;
        System.out.println("La media de los números positivos introducidos es: " + mean);
    }
}

