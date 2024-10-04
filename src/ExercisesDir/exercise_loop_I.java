package ExercisesDir;
import java.util.Scanner;

public class exercise_loop_I {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n;

        while (true) {
            System.out.println("Inserte un número: ");
            n = reader.nextInt();
            if (n % 2 != 0) {
                System.out.println("El número " + n + " es impar");
            } else {
                System.out.println("El número " + n + " no es impar");
                System.out.println("Cerrando programa...");
                break;
            }
        }
    }
}
