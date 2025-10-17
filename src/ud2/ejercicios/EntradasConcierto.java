package ud2.ejercicios;

import java.util.Scanner;

public class EntradasConcierto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Aforo máximo: ");
        int aforoMaximo = sc.nextInt();
        System.out.print("Precio por entrada: ");
        double precioEntrada = sc.nextDouble();
        System.out.print("Número de entradas vendidas: ");
        int entradasVendidas = sc.nextInt();
        sc.close();

        double aforo20 = aforoMaximo * 0.2;
        double aforo50 = aforoMaximo * 0.5;
        double recaudadoConcierto = 0;

        if (entradasVendidas <= aforo20) {
            System.out.println("Concierto cancelado.");
        } else if (entradasVendidas <= aforo50) {
            double entradaConDescuento = precioEntrada - precioEntrada * 0.25;
            recaudadoConcierto = entradasVendidas * entradaConDescuento;
            System.out.println("Entradas con descuento del 25%");
            System.out.println("Recaudado: " + recaudadoConcierto);
        } else {
            recaudadoConcierto = entradasVendidas * precioEntrada;
            System.out.println("Recaudado: " + recaudadoConcierto);
        }
    }
}
