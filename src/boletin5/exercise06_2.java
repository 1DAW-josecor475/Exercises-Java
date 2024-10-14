package boletin5;

public class exercise06_2 {
    public static void main(String[] args) {
        int n = 0;
        int sumAboveFive = 0;
        double multAboveFive = 1;
        int counterAboveFive = 0;

        for (int i = 1; i <= 20; i++) {
            if (i <= 5) {
                sumAboveFive += i;
            } else {
                multAboveFive *= i;
                counterAboveFive++;
            }
            n = i;
        }
        n += 1; // When i = 21, it does not step into the loop, and n does not receive the value

        System.out.println("La suma de los números menores a : " + sumAboveFive + ".\n" +
                           "La multiplicación de los " + counterAboveFive + " números impares es: " + multAboveFive +
                           ".\n" + "El valor de i al finalizar es: " + n);
    }
}