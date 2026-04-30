package ud5.practicaEx;

import java.util.Comparator;
import java.util.List;

public class EjerProducto {
    
}

class Producto {
    String nombre;
    double precio;
    int stock;
    
    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    @Override
    public String toString() {
        return  nombre + " - " + precio + " - " + stock;
    }

    Comparator<Producto> porPrecioAsc = (p1, p2) -> Double.compare(p1.precio, p2.precio);
    Comparator<Producto> porStockDesc = (p1, p2) -> p2.stock - p1.stock;
    Comparator<Producto> porPrecioDescNombreAsc = (p1, p2) -> {
        int comp = Double.compare(p2.precio, p1.precio);
        
        if (comp == 0) {
            return p1.nombre.compareTo(p2.nombre);
        }
        return comp;
    };

    static void ordenar(List<Producto> lista, Comparator<Producto> comp) {
        if (lista == null ||lista.isEmpty() || comp == null) {
            return;
        }
        
        lista.sort(comp);
    }
}