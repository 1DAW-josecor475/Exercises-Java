/*
* Hacer un programa que permita almacenar los nombres y notas de 5 alumnos, las notas deben
* estar entre 0 y 10. Mostrar el alumno con la mayor nota media.
*/
package boletin6;
import java.util.Scanner;

public class exercise09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        String bestStudent = "";
        float bestAverage = 0;
        String studentName;
        float note, sumNotes = 0, studentAverage;
        
        System.out.println("¿Cuántas notas desea introducir?:");
        int notesNumber = sc.nextInt();
        sc.nextLine();
        // Iterates each student
        for (int i = 1; i <= 5; i ++) {
            System.out.println("Introduzca el nombre del alumno " + i);
            studentName = sc.nextLine();
            sumNotes = 0;
            // Iterates each note and sumNotes of a single student
            for (int j = 1; j <= notesNumber; j++) {
                do {
                    System.out.println("Introduzca la nota " + j + " de " + studentName);
                    note = sc.nextFloat();
                    
                    if (note < 0 || note > 10) {
                        System.out.println("*ERROR: El valor introducido no está comprendido en el rango (0-10)");
                    }
                } while (note < 0 || note > 10);
                sumNotes += note;
            }
            studentAverage = sumNotes / notesNumber;
            if (studentAverage > bestAverage) {
                bestAverage = studentAverage;
                bestStudent = studentName;
            }
            sc.nextLine();
        }
        System.out.println("El alumno con la mejor nota media es " + bestStudent + " con un promedio de " + bestAverage);
    }
}
