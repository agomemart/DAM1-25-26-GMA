package ud2.ejercicios.practicaex;

import java.util.Scanner;

public class ControlEstacionamiento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Registro de vehículos en el estacionamiento:");

        int tipoVehiculo = 0;
        do {
            System.out.print("Tipo de vehículo (1-Auto, 2-Moto, 3-Camión, -1-Salir): ");
            tipoVehiculo = sc.nextInt();

            System.out.println("Tiempo de estacionamiento (en horas sin decimales): ");
            int tiempoEstacionamiento = sc.nextInt();

            if (tiempoEstacionamiento >= 1 && tiempoEstacionamiento <= 12) {
                
            } else {
                System.out.println("Tiempo fuera de rango");
            }
        } while(tipoVehiculo != -1);
        sc.close();
        
    }
}
