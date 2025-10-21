package ud2.ejercicios;

import java.util.Scanner;

public class E0313 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int NUM_ALUMNOS = 6;
        int numAprobados = 0;
        int numSuspensos = 0;
        int numCondicionados = 0;

        for (int i = 1; i <= NUM_ALUMNOS; i++) {
            System.out.print("Inserta la nota " + i + ": ");
            double nota = sc.nextDouble();

            if (nota >= 5) {
                numAprobados++;
            } else if (nota < 5 && nota >= 4) {
                numCondicionados++;
            } else {
                numSuspensos++;
            }
        }
        sc.close();

        System.out.println("Número de aprobados: " + numAprobados);
        System.out.println("Número de condicionados: " + numCondicionados);
        System.out.println("Número de suspensos: " + numSuspensos);
    }
}
