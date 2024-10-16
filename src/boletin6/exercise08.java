/*
* Introducir un número entero de dos cifras y mostrar su valor en letras.
 */
package boletin6;
import java.util.Scanner;

public class exercise08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder numberToWords = new StringBuilder();
        int tenValue, unitValue;

        while (true) {
            System.out.println("Introduzca un número entero de dos cifras: ");
            int user_number = sc.nextInt();

            if (user_number < 10 || user_number > 99) {
                System.out.println("El número indicado no cumple los requisitos.");
                continue;
            }
            numberToWords.setLength(0);     // Reinicio del StringBuilder
            tenValue = user_number / 10;
            unitValue = user_number % 10;

            // Comprobacion numero en el intervalo 10...19
            if (tenValue == 1) {
                switch (unitValue) {
                    case 0 -> numberToWords.append("Diez");
                    case 1 -> numberToWords.append("Once");
                    case 2 -> numberToWords.append("Doce");
                    case 3 -> numberToWords.append("Trece");
                    case 4 -> numberToWords.append("Catorce");
                    case 5 -> numberToWords.append("Quince");
                    case 6 -> numberToWords.append("Dieciseis");
                    case 7 -> numberToWords.append("Diecisiete");
                    case 8 -> numberToWords.append("Dieciocho");
                    case 9 -> numberToWords.append("Diecinueve");
                }
            } else {

                // Comprobacion de las decenas
                switch (tenValue) {
                    case 2 -> numberToWords.append(unitValue == 0 ? "Veinte" : "Veinti");
                    case 3 -> numberToWords.append("Treinta");
                    case 4 -> numberToWords.append("Cuarenta");
                    case 5 -> numberToWords.append("Cincuenta");
                    case 6 -> numberToWords.append("Sesenta");
                    case 7 -> numberToWords.append("Setenta");
                    case 8 -> numberToWords.append("Ochenta");
                    case 9 -> numberToWords.append("Noventa");
                }
                if (tenValue == 2) {
                    numberToWords.append((getUnitWord(unitValue)));
                } else if (unitValue != 0) {
                    numberToWords.append(" y ").append((getUnitWord(unitValue)));
                }
            }
            System.out.println(numberToWords);
            break;
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


