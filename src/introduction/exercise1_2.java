/*
* Realiza un programa que pida un número por teclado y luego lo muestre por pantalla
*/
package introduction;
import java.util.Scanner;

public class exercise1_2 {
    public static void main(String[] args) {
        Scanner myNum = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = myNum.nextInt();
        System.out.println("Your number is: " + n);
    }
}
