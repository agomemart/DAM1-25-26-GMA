package ud2.parejas;

import java.util.Scanner;

/**
 * @author Adrián Gómez
 */
public class EstadisticasEstaturas {
    static double mediaEstatura(int sumaEstaturas, int numAlumnos) {
        return (double) sumaEstaturas / numAlumnos;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int estatura = 0;
        int sumaEstaturas = 0;
        int numAlumnos = 0;
        int minAltura = 1000;
        int maxAltura = 0;

        do {
            System.out.print("Introduce la estatura: ");
            estatura = sc.nextInt();

            if (estatura > 0) {
                sumaEstaturas += estatura;
                numAlumnos++;

                if (estatura > maxAltura) {
                    maxAltura = estatura;
                }

                if (estatura < minAltura) {
                    minAltura = estatura;
                }
            }

        } while (estatura > 0);
        sc.close();

        System.out.println("Número de alumnos: " + numAlumnos);
        System.out.printf("Media de estatura: %.2f cm%n", mediaEstatura(sumaEstaturas, numAlumnos));
        System.out.println("Altura más alta: " + maxAltura + "cm");
        System.out.println("Altura más baja: " + minAltura + "cm");
    }
}
