package ud2.parejas;

import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * @author Adrián Gómez
 */
public class Supermercado {
   public static double importeTotalProducto(double precio, int unidades) {
        return precio * unidades;
    }

    public static boolean validarNumeroPositivo(double num) {
        boolean valido = true;
        if (num <= 0) {
            System.out.println("Número introducido no válido. Debe ser mayor que 0.");
            valido = false;
        }
        return valido;
    }

    public static void procesarPagoEnEfectivo(double total, Scanner sc) {
        double efectivo = 0;
        boolean cantidadCorrecta = false;

        while (!cantidadCorrecta) {
            System.out.print("Introduce el importe entregado en efectivo: ");
            try {
                efectivo = sc.nextDouble();
                if (efectivo >= total) {
                    cantidadCorrecta = true;
                } else {
                    System.out.println("Cantidad insuficiente. Introduzca otra cantidad.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: introduce un valor numérico válido.");
                sc.next(); // limpiar buffer
            }
        }

        double cambio = efectivo - total;

        if (cambio == 0) {
            System.out.println("Pago exacto. No hay cambio.");
        } else {
            System.out.printf("Su cambio es de: %.2f euros%n", cambio);
            desglosarCambio(cambio);
        }
    }

    public static void desglosarCambio(double cambio) {
        int euros = (int) cambio;
        int centimos = (int) Math.round((cambio - euros) * 100);

        System.out.println("Desglose del cambio:");
        euros = desgloseEuros(euros);
        centimos = desgloseCentimos(centimos);
        System.out.println("Cambio desglosado completamente.");
    }

    private static int desgloseEuros(int euros) {
        euros = desglosarDenominacion(euros, 50, "billetes de 50 euros");
        euros = desglosarDenominacion(euros, 20, "billetes de 20 euros");
        euros = desglosarDenominacion(euros, 10, "billetes de 10 euros");
        euros = desglosarDenominacion(euros, 5, "billetes de 5 euros");
        euros = desglosarDenominacion(euros, 2, "monedas de 2 euros");
        euros = desglosarDenominacion(euros, 1, "monedas de 1 euro");
        return euros;
    }

    private static int desgloseCentimos(int centimos) {
        centimos = desglosarDenominacion(centimos, 50, "monedas de 50 céntimos");
        centimos = desglosarDenominacion(centimos, 20, "monedas de 20 céntimos");
        centimos = desglosarDenominacion(centimos, 10, "monedas de 10 céntimos");
        centimos = desglosarDenominacion(centimos, 5, "monedas de 5 céntimos");
        centimos = desglosarDenominacion(centimos, 2, "monedas de 2 céntimos");
        centimos = desglosarDenominacion(centimos, 1, "monedas de 1 céntimo");
        return centimos;
    }

    private static int desglosarDenominacion(int cantidad, int denominacion, String descripcion) {
        int num = cantidad / denominacion;
        if (num > 0) {
            System.out.printf("%d %s%n", num, descripcion);
            cantidad = cantidad % denominacion;
        }
        return cantidad;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continuarCompra = true;

        while (continuarCompra) {
            double totalCompra = 0;
            double precio = 0;
            int unidades = 0;
            boolean introduciendoProductos = true;

            System.out.println("=== Bienvenido a la caja del supermercado ===");
            System.out.println("Introduzca los productos. Para terminar, escriba un precio igual a -1.");

            while (introduciendoProductos) {
                boolean precioValido = false;
                while (!precioValido) {
                    try {
                        System.out.print("Precio del producto: ");
                        precio = sc.nextDouble();
                        if (precio == -1) {
                            introduciendoProductos = false;
                            precioValido = true;
                        } else {
                            precioValido = validarNumeroPositivo(precio);
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("Error: introduce un número válido.");
                        sc.next(); // limpiar buffer
                    }
                }

                if (introduciendoProductos) {
                    boolean unidadesValidas = false;
                    while (!unidadesValidas) {
                        try {
                            System.out.print("Unidades del producto: ");
                            unidades = sc.nextInt();
                            if (unidades > 0) {
                                unidadesValidas = true;
                                totalCompra = totalCompra + importeTotalProducto(precio, unidades);
                                System.out.printf("Subtotal: %.2f euros%n", totalCompra);
                            } else {
                                System.out.println("Las unidades deben ser mayores que 0.");
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("Error: introduce un número entero válido.");
                            sc.next(); // limpiar buffer
                        }
                    }
                }
            }

            System.out.printf("Total de la compra: %.2f euros%n", totalCompra);

            boolean metodoValido = false;
            while (!metodoValido) {
                System.out.print("Método de pago (1=Tarjeta, 2=Efectivo): ");
                try {
                    int metodoPago = sc.nextInt();
                    if (metodoPago == 1) {
                        System.out.println("Pago con tarjeta realizado. ¡Gracias por su compra!");
                        metodoValido = true;
                    } else if (metodoPago == 2) {
                        procesarPagoEnEfectivo(totalCompra, sc);
                        metodoValido = true;
                    } else {
                        System.out.println("Opción no válida. Introduzca 1 o 2.");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Error: introduzca 1 o 2.");
                    sc.next();
                }
            }

            System.out.print("¿Desea realizar otra compra? (1=Sí / 2=No): ");
            int respuesta = sc.nextInt();
            if (respuesta != 1) {
                continuarCompra = false;
            }
        }

        System.out.println("Gracias por su compra. ¡Hasta pronto!");
        sc.close();
    }
}
