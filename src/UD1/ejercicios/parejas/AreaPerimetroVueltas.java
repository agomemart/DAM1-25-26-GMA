package ud1.ejercicios.parejas;

import java.util.Scanner;
/**
 * @author Adrián Gómez
 */
public class AreaPerimetroVueltas {
    public static void main(String[] args) {
        final int DISTANCIA_MARATON = 21097;
        double largo;
        double ancho;

        Scanner sc = new Scanner(System.in);
        System.out.print("Inserta el largo (m): ");
        largo = sc.nextDouble();
        System.out.print("Inserta el ancho (m): ");
        ancho = sc.nextDouble();
        sc.close();

        String mensajeError = (largo < ancho)
            ? "Error: el largo debe ser mayor o igual al ancho. La figura no tiene sentido."
            : "";

        double radio = (largo >= ancho) ? ancho / 2 : 0;
        double areaCirculo = (largo >= ancho) ? Math.PI * Math.pow(radio, 2) : 0;
        double areaRectangulo = (largo >= ancho) ? (largo * ancho) - areaCirculo : 0;
        double areaTotal = (largo >= ancho) ? areaCirculo + areaRectangulo : 0;

        double perimetroCirculo = (largo >= ancho) ? 2 * Math.PI * radio : 0;
        double perimetroRectangulo = (largo >= ancho) ? (2 * largo + 2 * ancho) - perimetroCirculo : 0;
        double perimetroTotal = (largo >= ancho) ? perimetroRectangulo + perimetroCirculo : 0;

        double vueltas = (largo >= ancho) ? DISTANCIA_MARATON / perimetroTotal : 0;
        int vueltasCompletas = (largo >= ancho) ? (int) vueltas : 0;
        double metrosSobrantes = (largo >= ancho) ? Math.ceil((vueltas - vueltasCompletas) * perimetroTotal) : 0;

        System.out.println((largo < ancho) ? mensajeError : "");
        System.out.print((largo < ancho) ? "" : "Área total: ");
        System.out.printf((largo < ancho) ? "" : "%.2f metros cuadrados%n", areaTotal);
        System.out.print((largo < ancho) ? "" : "Perímetro total: ");
        System.out.printf((largo < ancho) ? "" : "%.2f m%n", perimetroTotal);
        System.out.println((largo < ancho) ? "" : "MEDIA MARATÓN: " + DISTANCIA_MARATON + " m");
        System.out.println((largo < ancho) ? "" : "Vueltas completas: " + vueltasCompletas);
        System.out.println((largo < ancho) ? "" : "Metros sobrantes: " + Math.round(metrosSobrantes) + " m");
    }
}
