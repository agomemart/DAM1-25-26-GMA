package ud2.parejas;

import java.util.Scanner;
/**
 * @author Adrián Gómez
 */
public class FormacionSoldados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa el número de soldados: ");
        int numSoldados = sc.nextInt();
        sc.close();

        while (numSoldados >= 4) {
            int lado = (int)Math.sqrt(numSoldados);
            int usados = lado * lado;

            System.out.println("Formación cuadrada: " + usados + " soldados");

            for (int i = 0; i < lado; i++) {
                for (int j = 0; j < lado; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }

            numSoldados -= usados;
        }

        if (numSoldados > 0) {
            System.out.println("Formación en línea: " + numSoldados + " soldados");

            for (int i = 0; i < numSoldados; i++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
