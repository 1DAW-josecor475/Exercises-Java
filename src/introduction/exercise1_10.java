package introduction;
import java.util.Scanner;

public class exercise1_10 {
    public static void main(String[] args) {
        boolean goOutside;
        Scanner sc = new Scanner(System.in);

        System.out.println("Is it raining?: ");
        boolean isRaining = sc.nextBoolean();

        System.out.println("Is the homework to do?:");
        boolean haveHomework = sc.nextBoolean();

        System.out.println("Need to go to the library?:");
        boolean goLibrary = sc.nextBoolean();

        goOutside = goLibrary || (!isRaining && !haveHomework);
        System.out.println(goOutside);
    }
}
