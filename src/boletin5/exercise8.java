/*
* Escribe un algoritmo que vaya pidiendo al usuario números enteros positivos que debe ir contando.
* Cuando el usuario no quiera insertar más números, introducirá un número negativo y el algoritmo, antes
* de acabar, mostrará cuantos números positivos ha introducido anteriormente el usuario.
*/
package boletin5;
import java.util.Scanner;
public class exercise8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int counter = 0;
        while (true) {
            System.out.println("Introduzca un número entero positivo. Si quiere parar, introduzca un número entero negativo: ");
            n = sc.nextInt();
            if(n > 0) {
                counter++;
            } else {
                break;
            }
        }
        System.out.println("El total de números positivos introducidos es: " + counter);
    }
}
