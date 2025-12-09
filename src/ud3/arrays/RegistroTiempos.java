package ud3.arrays;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.Scanner;

public class RegistroTiempos {
    public static void main(String[] args) {
        int[] tiempos = new int[0];
        Scanner sc = new Scanner(System.in);
        LocalTime horaInicial = LocalTime.now();
        System.out.println("Hora de inicio: " + horaInicial);

        String entrada;
        do {
            entrada = sc.nextLine();
            LocalTime horaActual = LocalTime.now();
            System.out.println("Hora actual: " + horaActual);
            int segundosTranscurridos = (int) ChronoUnit.SECONDS.between(horaInicial, horaActual);
            System.out.println("Segundos trancurridos: " + segundosTranscurridos);

            tiempos = Arrays.copyOf(tiempos, tiempos.length + 1);
            tiempos[tiempos.length - 1] = segundosTranscurridos;

        } while (!entrada.equalsIgnoreCase("F"));
        sc.close();

        System.out.println("Tiempos: " + Arrays.toString(tiempos));
        double suma = 0;
        for (int i = 0; i < tiempos.length; i++) {
            suma += tiempos[i];
        }
        double media = suma / tiempos.length;
        System.out.printf("Media de tiempos: %.2f segundos\n", media);

        int cont = 0;
        for (int i = 0; i < tiempos.length; i++) {
            if (tiempos[i] > media) {
                cont++;
            }
        }
        System.out.println("Número de tiempos por encima de la media: " + cont);
    }
}
