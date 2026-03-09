package ud4.practicaex.productos;

import java.util.Arrays;

public class MainProductos {
    public static void main(String[] args) {
        Producto[] productos = new Producto[5];

        Producto p1 = new Producto("Gel", 5.4, 2);
        Producto p2 = new Producto("Jamón", 2, 10);
        Producto p3 = new Producto("Agua", 0.56, 24);
        Producto p4 = new Producto("Anchoas", 3.54, 0);
        Producto p5 = new Producto("Atún", 2.5, 5);

        productos[0] = p1;
        productos[1] = p2;
        productos[2] = p3;
        productos[3] = p4;
        productos[4] = p5;

        System.out.println("Sin ordenar: ");
        for (int i = 0; i < productos.length; i++) {
            productos[i].mostrarInfo();
        }
        System.out.println();

        Arrays.sort(productos);

        System.out.println("Productos ordenados por precio: ");
        for (int i = 0; i < productos.length; i++) {
            productos[i].mostrarInfo();
        }
        System.out.println();

        Arrays.sort(productos, new ComparadorStock());
        System.out.println("Productos ordenados por stock: ");
        for (int i = 0; i < productos.length; i++) {
            productos[i].mostrarInfo();
        }
        System.out.println();

        Arrays.sort(productos, new ComparadorNombre());
        System.out.println("Productos ordenados por nombre: ");
        for (int i = 0; i < productos.length; i++) {
            productos[i].mostrarInfo();
        }

    }

}
