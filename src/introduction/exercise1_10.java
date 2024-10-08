/*
* Diseña un algoritmo que nos indique si podemos salir a la calle. Los aspectos que influyen en esta decisión son:
*    -Si no está lloviendo y si hemos terminado nuestras tareas.
*    -Si tenemos que ir a la biblioteca (indistintamente de lo anterior).
* Solicitar al usuario mediante un booleano si llueve, si ha finalizado las tareas y si necesita ir a la biblioteca.
* El algoritmo deberá devolver mediante un booleano si es posible salir a la calle.
*/
package introduction;
import java.util.Scanner;

public class exercise1_10 {
    public static void main(String[] args) {
        boolean goOutside;
        Scanner sc = new Scanner(System.in);

        System.out.println("Is it raining?: ");
        boolean isRaining = sc.nextBoolean();

        System.out.println("Is the homework to do?:");
        boolean haveHomework = sc.nextBoolean();

        System.out.println("Need to go to the library?:");
        boolean goLibrary = sc.nextBoolean();

        goOutside = goLibrary || (!isRaining && !haveHomework);
        System.out.println(goOutside);
    }
}
