/*
 * Realice un programa que pinte por pantalla lo siguiente:
 * X - - - -
 * - X - - -
 * - - X - -
 * - - - X -
 * - - - - X
*/
package random_exercises;

public class nested_loops_II {
    public static void main (String[] args) {
        int n = 5;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == i) {
                    System.out.print("X ");
                } else {
                    System.out.print("- ");
                }
            }
            System.out.println();
        }
    }
}
