package introduction;
import java.util.Scanner;

public class exercise_loop_I {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n;

        while (true) {
            System.out.println("Inserte un número: ");
            n = reader.nextInt();

            if (n < 0) {
                System.out.println("No existen números primos negativos");
            } else {
                if (n % 2 != 0 || n == 2) {
                    System.out.println("El número " + n + " es primo");
                } else {
                    System.out.println("El número " + n + " no es primo");
                    System.out.println("Cerrando programa...");
                    break;
                }
            }
        }
    }
}
