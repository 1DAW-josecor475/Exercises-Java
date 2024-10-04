package ExercisesDir;
import java.time.chrono.MinguoChronology;
import java.util.Scanner;

public class exercises {
    public static void main(String[] args) {
        // EXERCISE 1.2
        /*
        Scanner myNum = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = myNum.nextInt();
        System.out.println("Your number is: " + n);
        */

        // EXERCISE 1.4
/*
        Scanner myNum = new Scanner(System.in);

        System.out.println("Enter your birth year: ");
        int birthYear = myNum.nextInt();

        System.out.println("Enter the actual year: ");
        int actualYear = myNum.nextInt();

        int userAge = actualYear - birthYear;

        System.out.println("Your age is: " + userAge);
*/
        // EXERCISE 1.5
        /*
        short n = 32767;
        System.out.println("This is the maximum value of short: " + n);
        n++;

        System.out.println("This is the value of short after sum 1: " + n);
*/
        // EXERCISE 1.6
/*      Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first note: ");
        float firstNote = sc.nextFloat();

        System.out.println("Enter the second note: ");
        float secondNote = sc.nextFloat();

        float mean = (firstNote + secondNote) / 2;

        System.out.println("The mean of " + firstNote + " and " + secondNote + " is: " + mean);
*/
        // EXERCISE 1.7
/*
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of r: ");
        double r = sc.nextFloat();

        double length = 2 * Math.PI * r;
        double area = Math.PI * Math.pow(r, 2);

        System.out.println("The value of the length is: " + length + " and the value of the area is: " + area);
*/
        // EXERCISE 1.8
/*
        Scanner sc = new Scanner(System.in);

        System.out.println("Inserte su edad: ");
        int userAge = sc.nextInt();
        boolean isLegal = userAge >= 18;

        System.out.println("Es mayor de edad: " + isLegal);
*/
        // EXERCISE 1.9
/*
        Scanner myNum = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = myNum.nextInt();
        boolean isEven = n % 2 == 0;

        System.out.println("The number is even: " + isEven);
*/
        // EXERCISE 1.10
/*
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
        */
        // EXERCISE 1.11
/*
        double profitApples = 2.35;
        double profitPears = 1.95;
        double totalProfit;
        Scanner sc = new Scanner(System.in);

        System.out.println("Inserta los kilos de manzanas en el primer semestre: ");
        int weightApples = sc.nextInt();

        System.out.println("Inserta los kilos de manzanas en el segundo semestre: ");
        weightApples += sc.nextInt();

        System.out.println("Inserta los kilos de peras en el primer semestre: ");
        int weigthPears = sc.nextInt();

        System.out.println("Inserta los kilos de peras en el segundo semestre: ");
        weigthPears += sc.nextInt();

        profitApples *= weightApples;
        profitPears *= weigthPears;
        totalProfit = profitApples + profitPears;

        System.out.println("El beneficio anual es: " + totalProfit);
        */

        // EXERCISE 1.12
/*
        Scanner myNum = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = myNum.nextInt();

        int absoluteValue = n < 0 ? Math.abs(n): n;

        System.out.println("The absolute value of " + n + " is: " + absoluteValue);
 */
        // EXERCISE 1.13
/*
        Scanner sc = new Scanner(System.in);

        System.out.println("Inserta la nota del primer trimestre: ");
        int firstQuarter = sc.nextInt();

        System.out.println("Inserta la nota del segundo trimestre: ");
        int secondQuarter = sc.nextInt();

        System.out.println("Inserta la nota del tercer trimestre: ");
        int thirdQuarter = sc.nextInt();

        float reportCard = (firstQuarter + secondQuarter + thirdQuarter) / 3f;

        System.out.println("La nota del boletín de calificaciones es: " + (int) reportCard);
        System.out.println("La nota del expediente académico es: " + reportCard);
*/
        // EXERCISE 1.14
/*
        Scanner myNum = new Scanner(System.in);

        System.out.println("Inserta un número: ");
        float realNumber = myNum.nextFloat();
        int roundedNumber = Math.round(realNumber);
        System.out.println(realNumber + " redondeado es: " + roundedNumber);
*/
        // EXERCISE CONDITIONAL (2.7)
/*
        Scanner sc = new Scanner(System.in);

        System.out.println("Inserta un número: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        int maxNumber = n3;
        if (n1 > maxNumber || n2 > maxNumber) {
            if (n1 > n2) {
                maxNumber = n1;
            } else {
                maxNumber = n2;
            }
        }

        int minNumber = n3;
        if (n1 < minNumber || n2 < minNumber) {
            if (n1 < n2) {
                minNumber = n1;
            } else {
                minNumber = n2;
            }
        }

        int midNumber = n1 + n2 + n3 - maxNumber - minNumber;
        System.out.println("Ordenados de mayor a menor: " + maxNumber + ", " + midNumber + ", " + minNumber);
        */

        // EXERCISE CONDITIONAL (2.11)
/*
        String day;
        Scanner sc = new Scanner(System.in);

        System.out.println("Inserte un número: ");
        int n = sc.nextInt();

        day = switch (n) {
            case 1 -> "Lunes";
            case 2 -> "Martes";
            case 3 -> "Miércoles";
            case 4 -> "Jueves";
            case 5 -> "Viernes";
            case 6 -> "Sábado";
            case 7 -> "Domingo";
            default -> "El número introducido no corresponde con ningún día de la semana";
        };
        System.out.println("El día de la semana es: " + day);
   */

    }
}



