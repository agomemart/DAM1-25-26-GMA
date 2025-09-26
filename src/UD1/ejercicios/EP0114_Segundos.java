package ud1.ejercicios;

import java.util.Scanner;

public class EP0114_Segundos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Inserta las horas: ");
        int horas = sc.nextInt();
        System.out.print("Inserta los minutos: ");
        int minutos = sc.nextInt();
        System.out.print("Inserta los segundos: ");
        int segundos = sc.nextInt();
        sc.close();

        int horasSegundo = horas * 3600;
        int minutosSegundo = minutos * 60;
        int totalSegundos = horasSegundo + minutosSegundo + segundos;

        System.out.println("En segundos son: " + totalSegundos);
    }
}
