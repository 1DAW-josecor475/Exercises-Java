/*
 * Realice un programa que pinte por pantalla lo siguiente:
 * *
 * **
 * ***
 * ....
 * *********
*/
package random_exercises;

public class nested_loops_III {
    public static void main(String[] args) {
        int n = 10;

        for (int i = 0; i < n; i++) {
            for (int j = i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
