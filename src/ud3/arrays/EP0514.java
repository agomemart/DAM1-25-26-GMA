package ud3.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class EP0514 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sueldo = 0;
        double sumaSueldos = 0;
        int sueldosMayorMedia = 0;
        int sueldosMenorMedia = 0;
        double[] sueldos = new double[0];

        System.out.print("Introduce un sueldo: ");
        sueldo = sc.nextDouble();

        while (sueldo != -1) {
            sueldos = Arrays.copyOf(sueldos, sueldos.length + 1);
            sueldos[sueldos.length - 1] = sueldo;

            System.out.print("Introduce un sueldo: ");
            sueldo = sc.nextDouble();
        }
        sc.close();

        if (sueldos.length > 0) {
            Arrays.sort(sueldos);

            for (int i = sueldos.length - 1; i >= 0; i--) {
                System.out.print(sueldos[i] + " ");
                sumaSueldos += sueldos[i];
            }

            double mediaSueldos = sumaSueldos / sueldos.length;

            for (int i = 0; i < sueldos.length; i++) {
                if (sueldos[i] > mediaSueldos) {
                    sueldosMayorMedia++;
                } else if (sueldos[i] < mediaSueldos) {
                    sueldosMenorMedia++;
                }
            }

            System.out.println();
            System.out.println("Sueldo máximo: " + sueldos[sueldos.length - 1]);
            System.out.println("Sueldo mínimo: " + sueldos[0]);
            System.out.printf("Media de los sueldos: %.2f", mediaSueldos);
            System.out.println("Sueldos mayores a la media: " + sueldosMayorMedia);
            System.out.println("Sueldos menores a la media: " + sueldosMenorMedia);
        }

    }
}
