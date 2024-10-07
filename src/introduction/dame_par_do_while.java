package introduction;
import java.util.Scanner;

public class dame_par_do_while {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        do {
            System.out.println("Introduzca un número par: ");
            n = sc.nextInt();
        } while (n % 2 != 0);
        System.out.println("El número " + n + " es par");
    }
}
