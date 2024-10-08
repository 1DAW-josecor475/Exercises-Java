/*
* Idea un programa que solicite al usuario un número del 1 al 7. Se debe mostrar el nombre del día de la semana al que
* corresponde.
*/
package introduction;
import java.util.Scanner;

public class exercise2_11 {
    public static void main(String[] args) {
        String day;
        Scanner sc = new Scanner(System.in);

        System.out.println("Inserte un número: ");
        int n = sc.nextInt();

        day = switch (n) {
            case 1 -> "Lunes";
            case 2 -> "Martes";
            case 3 -> "Miércoles";
            case 4 -> "Jueves";
            case 5 -> "Viernes";
            case 6 -> "Sábado";
            case 7 -> "Domingo";
            default -> throw new Error("El número introducido no corresponde con ningún día de la semana");
        };
        System.out.println("El día de la semana es: " + day);
    }
}
