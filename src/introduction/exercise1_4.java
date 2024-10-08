/*
* Escribir una aplicación que pida el año actual y el de nacimiento del usuario. Debe calcular la edad (suponiendo que en el año en curso ya ha cumplido los años)
*/
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
