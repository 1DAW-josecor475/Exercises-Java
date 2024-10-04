package ExercisesDir;
import java.util.Scanner;

public class exercise1_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Inserte su edad: ");
        int userAge = sc.nextInt();
        boolean isLegal = userAge >= 18;

        System.out.println("Es mayor de edad: " + isLegal);
    }
}
