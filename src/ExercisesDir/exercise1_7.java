package ExercisesDir;
import java.util.Scanner;
public class exercise1_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of r: ");
        double r = sc.nextFloat();

        double length = 2 * Math.PI * r;
        double area = Math.PI * Math.pow(r, 2);

        System.out.println("The value of the length is: " + length + " and the value of the area is: " + area);
    }
}
