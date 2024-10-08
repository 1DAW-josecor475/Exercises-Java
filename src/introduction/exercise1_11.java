/*
* Un frutero necesita calcular los beneficios anuales de venta de manzanas y peras.
* La aplicación deberá solicitar las ventas (en kilos) de cada semestre por fruta.
* Mostrará el importe total sabiendo que el precio de kilos de:
*    - Manzanas -> 2,35€
*    - Peras -> 1,95€
*/
package introduction;
import java.util.Scanner;
public class exercise1_11 {
    public static void main(String[] args) {
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
    }
}
