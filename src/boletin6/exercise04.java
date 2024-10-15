/*
* Se requiere saber la edad de una persona cualquiera a partir de su fecha de nacimiento con todos
* sus datos; día, mes y año de nacimiento. Lo anterior, a partir de la fecha actual; día, mes y año
* actual. Todos los datos de ambas fechas, debe proporcionarlos el usuario introduciendo los datos por
* teclado.
*/
package boletin6;
import java.util.Scanner;

public class exercise04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int years;

        System.out.println("Introduzca su año de nacimiento: ");
        int birthYear = sc.nextInt();
        System.out.println("Introduzca su mes de nacimiento: ");
        int birthMonth = sc.nextInt();
        System.out.println("Introduzca su día de nacimiento: ");
        int birthDay = sc.nextInt();

        System.out.println("Introduzca el año actual: ");
        int actualYear = sc.nextInt();
        System.out.println("Introduzca el mes actual: ");
        int actualMonth = sc.nextInt();
        System.out.println("Introduzca el día actual: ");
        int actualDay = sc.nextInt();

        if (birthMonth >= actualMonth && birthDay > actualDay) {
            years = actualYear - birthYear - 1;
        } else {
            years = actualYear - birthYear;
        }

        System.out.println("La edad del usuario es: " + years);
    }

}
