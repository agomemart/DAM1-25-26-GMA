package ud1.ejercicios.parejas;

import java.util.Scanner;
/**
 * @author Adrián Gómez
 */

/*
 * 1 hectárea = 100 x 100 metros = 10000 m2
● Campo de fútbol según la FIFA (media): 105 x 70 metros
● Cancha de baloncesto: 28 x 15 metros
● Pista de tenis (dobles): 23,77 x 10,97 metros
● Parque del Retiro: 125 hectáreas

 */
public class UnidadesMedida {
    public static void main(String[] args) {
        final int HECTAREA_METROS = 10000;
        final double CAMPO_FUTBOL = (105 * 70.0) / HECTAREA_METROS;
        final double CANCHA_BALONCESTO = (28 * 15.0) / HECTAREA_METROS;
        final double PISTA_TENIS = (23.77 * 10.97) / HECTAREA_METROS;
        final int HECTAREAS_RETIRO = 125;
        Scanner sc = new Scanner(System.in);

        System.out.print("Inserta el número de hectáreas: ");
        double hectareas = sc.nextDouble();
        sc.close();

        double hectareasCampoFutbol = hectareas / CAMPO_FUTBOL;
        double hectareasCanchabaloncesto = hectareas / CANCHA_BALONCESTO;
        double hectareasPistaTenis = hectareas / PISTA_TENIS;
        double hectareasRetiro = hectareas / HECTAREAS_RETIRO;

        System.out.println("Equivalencias:");
        System.out.printf("En campos de futbol equivaldría a %.2f \n", hectareasCampoFutbol);
        System.out.printf("En canchas de Baloncesto equivaldría a %.2f \n", hectareasCanchabaloncesto);
        System.out.printf("En  pistas de tenis equivaldría a %.2f \n", hectareasPistaTenis);
        System.out.printf("Equivaldría a %.2f %s", hectareasRetiro, "parques del retiro");
    }
}
