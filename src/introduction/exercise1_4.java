package introduction;
import java.util.Scanner;

public class exercise1_4 {
    public static void main(String[] args) {
        Scanner myNum = new Scanner(System.in);

        System.out.println("Enter your birth year: ");
        int birthYear = myNum.nextInt();

        System.out.println("Enter the actual year: ");
        int actualYear = myNum.nextInt();

        int userAge = actualYear - birthYear;

        System.out.println("Your age is: " + userAge);
    }
}
