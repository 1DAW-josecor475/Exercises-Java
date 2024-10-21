/*
* Introducir un número entero de dos cifras y mostrar su valor en letras.
 */
package boletin6;
import java.util.Scanner;

public class exercise08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String numberToWords;
        int tenValue, unitValue;
        boolean isConverted = false;

        System.out.println("Introduzca un número entero de dos cifras: ");

        while (!isConverted) {
            while (!sc.hasNextInt()) {
                System.out.println("* ERROR: El valor introducido no es un número entero. Inténtelo de nuevo:");
                sc.next();
            }
            int user_number = sc.nextInt();

            if (user_number < 10 || user_number > 99) {
                System.out.println("* ERROR: Número de cifras incorrecto. Inténtelo de nuevo:");
            } else {
                numberToWords = "";     // Reinicio del StringBuilder
                tenValue = user_number / 10;
                unitValue = user_number % 10;

                // Comprobacion numero en el intervalo 10...19
                if (tenValue == 1) {
                    switch (unitValue) {
                        case 0 -> numberToWords += "Diez";
                        case 1 -> numberToWords += "Once";
                        case 2 -> numberToWords += "Doce";
                        case 3 -> numberToWords += "Trece";
                        case 4 -> numberToWords += "Catorce";
                        case 5 -> numberToWords += "Quince";
                        case 6 -> numberToWords += "Dieciseis";
                        case 7 -> numberToWords += "Diecisiete";
                        case 8 -> numberToWords += "Dieciocho";
                        case 9 -> numberToWords += "Diecinueve";
                    }
                } else {

                    // Comprobacion de las decenas
                    switch (tenValue) {
                        case 2 -> numberToWords += unitValue == 0 ? "Veinte" : "Veinti";
                        case 3 -> numberToWords += "Treinta";
                        case 4 -> numberToWords += "Cuarenta";
                        case 5 -> numberToWords += "Cincuenta";
                        case 6 -> numberToWords += "Sesenta";
                        case 7 -> numberToWords += "Setenta";
                        case 8 -> numberToWords += "Ochenta";
                        case 9 -> numberToWords += "Noventa";
                    }
                    if (tenValue == 2) {
                        numberToWords += getUnitWord(unitValue);
                    } else if (unitValue != 0) {
                        numberToWords += " y " + getUnitWord(unitValue);
                    }
                }
                System.out.println(numberToWords);
                isConverted = true;
            }
        }
    }

    // Metodo para conseguir la string de las unidades
    private static String getUnitWord(int unitValue) {
        return switch (unitValue) {
            case 1 -> "uno";
            case 2 -> "dos";
            case 3 -> "tres";
            case 4 -> "cuatro";
            case 5 -> "cinco";
            case 6 -> "seis";
            case 7 -> "siete";
            case 8 -> "ocho";
            case 9 -> "nueve";
            default -> "";
        };
    }
}


