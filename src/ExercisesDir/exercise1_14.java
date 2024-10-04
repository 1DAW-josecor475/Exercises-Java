package ExercisesDir;
import java.util.Scanner;

public class exercise1_14 {
    public static void main(String[] args) {
        Scanner myNum = new Scanner(System.in);

        System.out.println("Inserta un número: ");
        float realNumber = myNum.nextFloat();
        int roundedNumber = Math.round(realNumber);
        System.out.println(realNumber + " redondeado es: " + roundedNumber);
    }
}
