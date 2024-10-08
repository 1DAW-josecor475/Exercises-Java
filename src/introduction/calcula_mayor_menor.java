package introduction;
import java.util.Scanner;

public class calcula_mayor_menor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int sumNumbers = 0;
        int evenNumbers = 0;
        int negativeNumbers = 0;
        int maxNumber = 0;
        int minNumber = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.println("Introduzca un número: ");
            n = sc.nextInt();
            sumNumbers += n;
            if (n > maxNumber) {
                maxNumber = n;
            } else if (n < minNumber) {
                minNumber = n;
            }
            if (n % 2 == 0) {
                evenNumbers++;
            }
            if (n < 0) {
                negativeNumbers++;
            }
        }
        System.out.println("La suma de todos los números es: " + sumNumbers);
        System.out.println("La cantidad de números pares es: " + evenNumbers);
        System.out.println("La cantidad de números negativos es: " + negativeNumbers);
        System.out.println("El máximo es: " + maxNumber);
        System.out.println("El mínimo es: " + minNumber);
    }
}
