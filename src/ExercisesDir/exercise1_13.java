package ExercisesDir;
import java.util.Scanner;

public class exercise1_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Inserta la nota del primer trimestre: ");
        int firstQuarter = sc.nextInt();

        System.out.println("Inserta la nota del segundo trimestre: ");
        int secondQuarter = sc.nextInt();

        System.out.println("Inserta la nota del tercer trimestre: ");
        int thirdQuarter = sc.nextInt();

        float reportCard = (firstQuarter + secondQuarter + thirdQuarter) / 3f;

        System.out.println("La nota del boletín de calificaciones es: " + (int) reportCard);
        System.out.println("La nota del expediente académico es: " + reportCard);
    }
}
