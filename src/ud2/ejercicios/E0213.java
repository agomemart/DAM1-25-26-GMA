package ud2.ejercicios;

import java.util.Scanner;

public class E0213 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Inserta la hora: ");
        int hora = sc.nextInt();
        System.out.print("Inserta los minutos: ");
        int minutos = sc.nextInt();
        System.out.print("Inserta los segundos: ");
        int segundos = sc.nextInt();
        sc.close();

        System.out.println("Hora actual: " + hora + ":" + minutos + ":" + segundos);

        segundos++;

        if (segundos >= 59) {
            minutos++;
            segundos = 0;
            if (minutos > 59) {
                hora++;
                minutos = 0;
                if (hora > 23){
                    hora = 0;
                    minutos = 0;
                    segundos = 0;
                }
            }
        }

        System.out.println("Hora nueva: " + hora + ":" + minutos + ":" + segundos);
    }
}
