package ud2.parejas;

import java.util.Random;
/**
 * @author Adrián Gómez
 */
public class Dado {
    public static void main(String[] args) {
        final int NUM_LANZAMIENTOS = 1000;
        int num1 = 0, num2 = 0, num3 = 0, num4 = 0, num5 = 0, num6 = 0;

        Random rnd = new Random();

        for (int i = 0; i < NUM_LANZAMIENTOS; i++) {
            int lanzamientoDado = rnd.nextInt(6) + 1;
            switch (lanzamientoDado) {
                case 1 -> num1++;
                case 2 -> num2++;
                case 3 -> num3++;
                case 4 -> num4++;
                case 5 -> num5++;
                case 6 -> num6++;
                default -> System.out.println("Error");
            }
        }
        double porcentaje1 = (double) num1 / NUM_LANZAMIENTOS * 100;
        double porcentaje2 = (double) num2 / NUM_LANZAMIENTOS * 100;
        double porcentaje3 = (double) num3 / NUM_LANZAMIENTOS * 100;
        double porcentaje4 = (double) num4 / NUM_LANZAMIENTOS * 100;
        double porcentaje5 = (double) num5 / NUM_LANZAMIENTOS * 100;
        double porcentaje6 = (double) num6 / NUM_LANZAMIENTOS * 100;

        System.out.println("LANZANDO UN DADO " + NUM_LANZAMIENTOS + " VECES");
        System.out.println();
        System.out.printf("Ha salido 1: %d veces ( %.2f %% )%n", num1, porcentaje1);
        System.out.printf("Ha salido 2: %d veces ( %.2f %% )%n", num2, porcentaje2);
        System.out.printf("Ha salido 3: %d veces ( %.2f %% )%n", num3, porcentaje3);
        System.out.printf("Ha salido 4: %d veces ( %.2f %% )%n", num4, porcentaje4);
        System.out.printf("Ha salido 5: %d veces ( %.2f %% )%n", num5, porcentaje5);
        System.out.printf("Ha salido 6: %d veces ( %.2f %% )%n", num6, porcentaje6);
    }
}
