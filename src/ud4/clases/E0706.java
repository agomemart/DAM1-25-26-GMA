package ud4.clases;

import java.util.Scanner;

public class E0706 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce una hora, minutos, segundos: ");
        int horas = sc.nextInt();
        int minutos = sc.nextInt();

        System.out.print("Introduce el numero de horas n siguientes que se incrementarán: ");
        int n = sc.nextInt();
        sc.close();

        Hora hora = new Hora(horas, minutos);

        /*hora.mostrar();

        for (int i = 0; i < n; i++) {
            hora.incSegundo();
            hora.mostrar();
        }*/
    }
}
