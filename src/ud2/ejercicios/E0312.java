package ud2.ejercicios;

import java.util.Scanner;

public class E0312 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int NUM_ALUMNOS = 5;
        int numSuspensos = 0;

        for (int i = 1; i <= NUM_ALUMNOS; i++) {
            System.out.print("Inserta la nota " + i + ": ");
            double nota = sc.nextDouble();

            if (nota < 5) {
                numSuspensos++;
            }
        }
        sc.close();

        if (numSuspensos > 0) {
            System.out.println("Hay " + numSuspensos + " suspensos");
        } else {
            System.out.println("No hay ningún suspenso");
        }
    }
}
