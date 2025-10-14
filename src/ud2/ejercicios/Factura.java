package ud2.ejercicios;
/**
 * @author Adrián Gómez
 */
import java.util.Scanner;

public class Factura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double IVA = 0.21;
        final double DESCUENTO = 0.05;
        
        System.out.print("Introduce el precio del producto: ");
        double precioProducto = sc.nextDouble();
        System.out.print("Introduce el número de unidades del producto: ");
        int unidades = sc.nextInt();
        sc.close();

        double precioFinalCompra = precioProducto * unidades;
        double ivaFactura = precioFinalCompra * IVA;
        double totalFactura = precioFinalCompra + ivaFactura;

        if (totalFactura > 100) {
            double facturaConDescuento = totalFactura - totalFactura * DESCUENTO;
            System.out.printf("Total: %.2f euros incluyendo descuento adiccional de 5 por ciento\n", facturaConDescuento);
        } else {
            System.out.printf("Total: %.2f euros\n", totalFactura);
        }
    }
}
