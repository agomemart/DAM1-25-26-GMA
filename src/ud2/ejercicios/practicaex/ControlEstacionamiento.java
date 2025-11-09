package ud2.ejercicios.practicaex;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ControlEstacionamiento {
    static Scanner sc = new Scanner(System.in);

    public static int entradaValida(int min, int max) {
        int valor = min - 1;
        boolean esValido = false;

        do {
            try {
                System.out.print("Introduce un número entre " + min + " y " + max + ": ");
                valor = sc.nextInt();

                if (valor >= min && valor <= max) {
                    esValido = true;
                } else {
                    System.out.println("ERROR.Número fuera de rango");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada no válida. Escribe un número entero.");
                sc.nextLine();
            }
        } while (!esValido);

        return valor;
    }

    public static int costeEstacionamiento(int precioTarifa, int tiempoEstacionamiento) {
        return precioTarifa * tiempoEstacionamiento;
    }

    public static void mostrarDatos(int auto, int moto, int camion, double totalCosteEstacionamiento) {
        System.out.println("Coches registrados: " + auto);
        System.out.println("Motos registradas: " + moto);
        System.out.println("Camiones registrados: " + camion);
        System.out.printf("Ingresos totales: %.2f euros\n", totalCosteEstacionamiento);
    }

    public static void main(String[] args) {
        System.out.println("Registro de vehículos en el estacionamiento:");

        int tipoVehiculo = 0;
        int auto = 0;
        int moto = 0;
        int camion = 0;
        int precioTarifa = 0;
        double totalCosteEstacionamiento = 0;

        do {
            System.out.print("Tipo de vehículo (1-Auto, 2-Moto, 3-Camión, -1-Salir): ");
            tipoVehiculo = entradaValida(-1, 3);

            if (tipoVehiculo != -1) {
                switch (tipoVehiculo) {
                    case 1:
                        auto++;
                        precioTarifa = 2;
                        break;
                    case 2:
                        moto++;
                        precioTarifa = 1;
                        break;
                    case 3:
                        camion++;
                        precioTarifa = 3;
                        break;
                }
                System.out.println("Tiempo de estacionamiento (en horas sin decimales(max 12h)): ");
                int tiempoEstacionamiento = entradaValida(1, 12);

                double importeEstacionamiento = 0;
                if (tiempoEstacionamiento > 8) {
                    double pagarConDescuento = 0.9;
                    importeEstacionamiento = costeEstacionamiento(precioTarifa, tiempoEstacionamiento)
                            * pagarConDescuento;
                } else {
                    importeEstacionamiento = costeEstacionamiento(precioTarifa, tiempoEstacionamiento);
                }
                totalCosteEstacionamiento += importeEstacionamiento;
                System.out.println("Total a pagar: " + importeEstacionamiento + " euros.");
            }
        } while (tipoVehiculo != -1);
        sc.close();

        mostrarDatos(auto, moto, camion, totalCosteEstacionamiento);
    }
}
