package random_exercises;
import java.util.Scanner;

public class reversed_string {
    public static void main (String[]args) {
        Scanner sc = new Scanner(System.in);
        String reversed_text = "";
        String blank_space = " ";

        System.out.println("¿Cuántas palabras desea introducir?: ");
        int user_words = sc.nextInt();

        for (int i = 0; i < user_words; i++) {
            System.out.println("Introduzca una palabra: ");
            String single_word = sc.next();

            reversed_text = single_word + blank_space + reversed_text;
        }

        System.out.println("El texto revertido es: " + reversed_text);
    }
}

