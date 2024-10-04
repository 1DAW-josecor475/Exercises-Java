package ExercisesDir;
import java.util.Scanner;

public class exercise1_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first note: ");
        float firstNote = sc.nextFloat();

        System.out.println("Enter the second note: ");
        float secondNote = sc.nextFloat();

        float mean = (firstNote + secondNote) / 2;

        System.out.println("The mean of " + firstNote + " and " + secondNote + " is: " + mean);
    }
}
