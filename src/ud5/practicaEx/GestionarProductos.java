package ud5.practicaEx;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class GestionarProductos {
    static void altaProducto(Map<String, Producto> productos, String id, Producto p) {
        if (productos == null || productos.isEmpty() || id == null || id.isEmpty() || p == null)
            return;

        if (productos.get(id) == null) {
            productos.put(id, p);
        }
    }

    static Producto eliminarProducto(Map<String, Producto> productos, String id) {
        if (productos == null || productos.isEmpty() || id == null || id.isEmpty()) {
            return null;
        }

        return productos.remove(id);
    }

    static void mostrar(Map<String, Producto> productos) {
        for (Map.Entry<String, Producto> entry : productos.entrySet()) {
            System.out.println(
                    entry.getKey() + " - " + entry.getValue().getNombre() + " - " + entry.getValue().getPrecio());
        }
    }

    static void mostrar(Map<String, Producto> productos, Categoria c) {
        for (Producto p : productos.values()) {
            if (p.getCategoria() == c) {
                System.out.println(p);
            }
        }
    }

    static Producto masCaro(Map<String, Producto> productos) {
        if (productos == null || productos.isEmpty()) {
            return null;
        }

        Producto masCaro = null;

        for (Producto p : productos.values()) {
            if (masCaro == null || p.getPrecio() > masCaro.getPrecio()) {
                masCaro = p;
            }
        }

        return masCaro;
    }

    static Map<Categoria, Integer> contarPorCategoria(Map<String, Producto> productos) {
        if (productos == null || productos.isEmpty()) {
            return null;
        }

        Map<Categoria, Integer> porCategoria = new HashMap<>();
        for (Producto p : productos.values()) {
            Categoria c = p.getCategoria();
            if (porCategoria.get(c) != null) {
                porCategoria.put(c, porCategoria.get(c) + 1);
            } else {
                porCategoria.put(c, 1);
            }
        }

        return porCategoria;
    }

    static List<Producto> filtrar(List<Producto> lista, Predicate<Producto> p) {
        if (lista == null || lista.isEmpty() || p == null) {
            return null;
        }

        List<Producto> filtrado = new ArrayList<>();
        for (Producto pr : lista) {
            if (p.test(pr)) {
                filtrado.add(pr);
            }
        }

        return filtrado;
    }

    static <R> List<R> transformar(List<Producto> lista, Function<Producto, R> f) {
        if (lista == null || lista.isEmpty() || f == null) {
            return null;
        }

        List<R> transformado = new ArrayList<>();
        for (Producto p : lista) {
            transformado.add(f.apply(p));
        }

        return transformado;
    }

    static void procesar(List<Producto> lista, Consumer<Producto> c) {
        if (lista == null || lista.isEmpty() ||c == null)
            return;

        for (Producto p : lista) {
            c.accept(p);
        }
    }

    Comparator<Producto> porPrecioAsc = (p1, p2) -> Double.compare(p1.getPrecio(), p2.getPrecio());
    Comparator<Producto> porNombreAsc = (p1, p2) -> p1.getNombre().compareTo(p2.getNombre());
    Comparator<Producto> porPrecioDescNombre = (p1, p2) -> {
        if (Double.compare(p2.getPrecio(), p1.getPrecio()) == 0) {
            return p1.getNombre().compareTo(p2.getNombre());
        }
        return Double.compare(p2.getPrecio(), p1.getPrecio());
    };

    static void ordenar(List<Producto> lista, Comparator<Producto> comp) {
        if (lista == null || lista.isEmpty()) return;

        lista.sort(comp);
    }
}
