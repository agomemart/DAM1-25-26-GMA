package ud2.ejercicios.practicaex;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ControlTemperaturas {
    static Scanner sc = new Scanner(System.in);

    public static double preguntarTemperatura(int min, int max, int hora) {
        double valor = 0;
        boolean esValido = false;

        do {
            try {
                System.out.print("Inserta la temperatura de la hora " + hora + ": ");
                valor = sc.nextDouble();
                if (valor < min || valor > max) {
                    System.out.println("Temperatura fuera de rango. Debe estar entre " + min + " y " + max + ".");
                } else {
                    esValido = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("Dato introducido no válido.");
                sc.nextLine();
            }
        } while (!esValido);

        return valor;
    }

    public static void mostrarInforme(double temperaturaMax, double temperaturaMin, int alertas, double media) {
        System.out.printf("Máxima: %.2f\n", temperaturaMax);
        System.out.printf("Mínima: %.2f\n", temperaturaMin);
        System.out.printf("Alertas: %d\n", alertas);
        System.out.printf("Media: %.2f\n", media);
    }

    public static void main(String[] args) {
        int alertas = 0;
        int alertasConsecutivas = 0;
        double temperaturaMinima = Double.MAX_VALUE;
        double temperaturaMax = 0;
        double sumaTemperaturas = 0;

        for (int i = 0; i < 24; i++) {
            double temperatura = preguntarTemperatura(-50, 50, i + 1);
            sumaTemperaturas += temperatura;
            if (temperatura < 1 || temperatura > 5) {
                alertas++;
                alertasConsecutivas++;
                if (alertasConsecutivas == 3) {
                    System.out.println("PELIGRO. TEMPERATURA CRÍTICA");
                    alertasConsecutivas = 0;
                }
            } else {
                alertasConsecutivas = 0;
            }
            if (temperatura < temperaturaMinima) {
                temperaturaMinima = temperatura;
            }
            if (temperatura > temperaturaMax) {
                temperaturaMax = temperatura;
            }
        }

        double mediaTemperaturas = sumaTemperaturas / 24;

        mostrarInforme(temperaturaMax, temperaturaMinima, alertas, mediaTemperaturas);
    }
}
