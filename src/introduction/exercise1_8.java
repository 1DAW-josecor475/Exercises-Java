/*
* Realizar una aplicación que solicite al usuario su edad y nos indique si es o no mayor de edad
*
* Nota: (Sin utilizar estructuras selectivas)
*/
package introduction;
import java.util.Scanner;

public class exercise1_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Inserte su edad: ");
        int userAge = sc.nextInt();
        boolean isLegal = userAge >= 18;

        System.out.println("Es mayor de edad: " + isLegal);
    }
}
