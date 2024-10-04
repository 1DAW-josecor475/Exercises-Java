package ExercisesDir;
import java.util.Scanner;

public class exercise1_12 {
    public static void main(String[] args) {
        Scanner myNum = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = myNum.nextInt();

        int absoluteValue = n < 0 ? Math.abs(n): n;

        System.out.println("The absolute value of " + n + " is: " + absoluteValue);
    }
}
