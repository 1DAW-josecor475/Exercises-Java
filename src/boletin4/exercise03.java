package boletin4;
import java.util.Scanner;

public class exercise03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sumRolls, firstRollInteger = 0, secondRollInteger = 0;

        System.out.println("Introduzca el valor de sus tiradas: ");
        String firstRoll= sc.next(), secondRoll = sc.next();

        switch (firstRoll.toLowerCase()) {
            case "uno"  -> firstRollInteger = 1;
            case "dos" -> firstRollInteger = 2;
            case "tres" -> firstRollInteger = 3;
            case "cuatro" -> firstRollInteger = 4;
            case "cinco" -> firstRollInteger = 5;
            case "seis" -> firstRollInteger = 6;
        }

        switch (secondRoll.toLowerCase()) {
            case "uno" -> secondRollInteger = 1;
            case "dos" -> secondRollInteger = 2;
            case "tres" -> secondRollInteger = 3;
            case "cuatro" -> secondRollInteger = 4;
            case "cinco" -> secondRollInteger = 5;
            case "seis" -> secondRollInteger = 6;
        }

        sumRolls = firstRollInteger + secondRollInteger;
        System.out.println("La suma de la tirada " + firstRollInteger + " y la tirada " + secondRollInteger +
                           " es igual a: " + sumRolls);
    }
}
