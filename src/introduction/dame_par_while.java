package introduction;
import java.util.Scanner;

public class dame_par_while {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        boolean isOdd = false;

        while (!isOdd) {
            System.out.println("Introduzca un número par: ");
            n = sc.nextInt();
            if (n % 2 != 0) {
                System.out.println("El número " + n + " no es par");
                isOdd = true;
            } else {
                System.out.println("El número " + n + " es par");
            }
        }
    }
}
