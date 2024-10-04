package ExercisesDir;
import java.util.Scanner;

public class exercise1_9 {
    public static void main(String[] args) {
        Scanner myNum = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = myNum.nextInt();
        boolean isEven = n % 2 == 0;

        System.out.println("The number is even: " + isEven);
    }
}
