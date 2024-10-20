/*
* Escribe un algoritmo que vaya pidiendo al usuario números enteros positivos que debe ir sumando.
* Cuando el usuario no quiera insertar más números, introducirá un número negativo y el algoritmo, antes
* de acabar, mostrará la suma de los números positivos introducidos anteriormente por el usuario.
*/
package boletin5;
import java.util.Scanner;

public class exercise07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int positiveSum = 0;
        boolean isNegative = false;
        while (!isNegative) {
            System.out.println("Introduzca un número entero positivo. Si quiere parar, introduzca un número entero negativo: ");
            n = sc.nextInt();
            if(n > 0) {
                positiveSum += n;
            } else {
                isNegative = true;
            }
        }
        System.out.println("La suma de los números positivos introducidos es: " + positiveSum);
    }
}
