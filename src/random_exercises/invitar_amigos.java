/*
 * Realiza un algoritmo que calcule a cuantos amigos he invitado. El programa debera pedir:
 *      - La cantidad de dinero inicial
 *      - Precio de un refresco
 * Debera preguntar si deseo invitar a un amigo cuantas veces sea necesario:
 *      - Si la respuesta es afirmativa: se descontara dinero del saldo inicial
 * El programa finaliza cuando no se quiera invitar a mas amigos o no tenga mas saldo inicial
 * Devolvera:
 *      - Numero total de amigos invitados
 *      - Cantidad total gastada
 *      - Dinero que me queda para mañana
*/
package random_exercises;
import java.util.Scanner;

public class invitar_amigos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int counterFriends = 0;
        float totalSpent = 0;
        boolean noMoreFriends = false;
        System.out.println("Indique su dinero inicial: ");
        float userMoney = sc.nextFloat();
        
        float initialMoney = userMoney;

        System.out.println("Indique el precio de un refresco: ");
        float drinkPrice = sc.nextFloat();

        while (!noMoreFriends) {
            if (totalSpent + drinkPrice > initialMoney) {
                noMoreFriends = true;
            } else {
                System.out.println("Inserte el número de la acción a realizar:\n" +
                        "(1) Invitar a un amigo.\n" +
                        "(2) Abandonar el programa.");
                int user_action = sc.nextInt();

                switch (user_action) {
                    case 1 -> {
                        counterFriends++;
                        totalSpent += drinkPrice;
                        if (totalSpent > initialMoney) {
                            noMoreFriends = true;
                        }
                        userMoney -= drinkPrice;

                        if (userMoney <= 0) {
                            noMoreFriends = true;
                            userMoney = 0;
                        }
                    }
                    case 2 -> noMoreFriends = true;
                    default -> System.out.println("El número de acción no es correcto.");
                }
            }
        }
        System.out.println("* El número total de amigos invitados es: " + counterFriends + ". \n" +
                           "* La cantidad total gastada es: " + totalSpent + ".\n" +
                           "* El dinero restante para mañana es: " + userMoney);
    }
}
