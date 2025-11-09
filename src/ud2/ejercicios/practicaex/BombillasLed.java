package ud2.ejercicios.practicaex;

import java.util.Scanner;

public class BombillasLed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int casos = sc.nextInt();

        for (int i = 0; i < casos; i++) {
            long horasMax = sc.nextLong();
            long encendidosMax = sc.nextLong();
            long horasPorUso = sc.nextLong();

            long usosPorHoras = horasMax / horasPorUso;

            long usosPorEncendidos = encendidosMax;

            if (usosPorHoras < usosPorEncendidos) {
                System.out.println("HORAS");
            } else if (usosPorEncendidos < usosPorHoras) {
                System.out.println("ENCENDIDOS");
            } else {
                System.out.println("AMBAS");
            }
        }
        sc.close();
    }
}
