/*
* Pedir tres números al usuario y mostrar en orden de mayor a menor.
*/
package introduction;
import java.util.Scanner;

public class exercise2_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Inserta un número: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        int maxNumber = n3;
        if (n1 > maxNumber || n2 > maxNumber) {
            maxNumber = Math.max(n1, n2);
        }

        int minNumber = n3;
        if (n1 < minNumber || n2 < minNumber) {
            minNumber = Math.min(n1, n2);
        }

        int midNumber = n1 + n2 + n3 - maxNumber - minNumber;
        System.out.println("Ordenados de mayor a menor: " + maxNumber + ", " + midNumber + ", " + minNumber);
    }
}
