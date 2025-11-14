package ud2.gmaexamen;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Adrián Gómez Martínez
 */
public class Radar {
    static Scanner sc = new Scanner(System.in);

    public static int introducirDatoValido(int min, int max) {
        int valor = min - 1;
        do {
            try {
                valor = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Dato introducido no válido." + e.getMessage());
                sc.nextLine();
            }
        } while (valor < min || valor > max);

        return valor;
    }

    public static double velocidadMedia(int distancia, int tiempo) {
        double velocidadMedia = (double) (distancia * 120 / tiempo) / 10 * 300;
        return velocidadMedia;
    }

    public static void main(String[] args) {
        System.out.println("Radar de control de velocidad de tramo");
        System.out.println("--------------------------------------");

        int distanciaTramo = 0;
        int velocidadMaximaPermitida = 0;
        int tiempo = 0;
        int numCoches = 0;
        int numMultas = 0;
        double velocidadMaximaRegistrada = 0;

        do {
            System.out.print("Distancia del tramo (km): ");
            distanciaTramo = introducirDatoValido(-1, Integer.MAX_VALUE);
            System.out.print("Velocidad máxima permitida (km/h): ");
            velocidadMaximaPermitida = introducirDatoValido(-1, 120);
            if (velocidadMaximaPermitida <= 0 || distanciaTramo <= 0) {
                break;
            }
            do {
                System.out.print("Introduce el tiempo en segundos en recorrer el tramo: ");
                tiempo = introducirDatoValido(-1, Integer.MAX_VALUE);
                if (tiempo <= 0) {
                    break;
                }
                System.out.printf("Velocidad media: %.2f km/h\n", velocidadMedia(distanciaTramo, tiempo));
                numCoches++;
                double velocidadMaxSuperada20 = velocidadMaximaPermitida + velocidadMaximaPermitida * 0.2;
                double velocidadMedia = velocidadMedia(distanciaTramo, tiempo);
                if (velocidadMedia > velocidadMaximaPermitida) {
                    if (velocidadMedia > velocidadMaxSuperada20) {
                        System.out.println("Conducción temeraria!! Multa con retirada de puntos!!");
                    } else {
                        System.out.println("Velocidade excesiva! Multa!");
                    }
                    numMultas++;
                } else {
                    System.out.println("Dentro del límite");
                }

                if (velocidadMedia > velocidadMaximaRegistrada) {
                    velocidadMaximaRegistrada = velocidadMedia;
                }
            } while (tiempo > 0);

        } while (distanciaTramo > 0 || velocidadMaximaPermitida > 0);
        sc.close();

        System.out.println("Número total de coches: " + numCoches);
        System.out.println("Número total de multas: " + numMultas);
        System.out.printf("Velocidad máxima registrada: %.2f km/h", velocidadMaximaRegistrada);
    }
}
