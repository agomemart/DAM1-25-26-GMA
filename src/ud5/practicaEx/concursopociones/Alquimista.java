package ud5.practicaEx.concursopociones;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Alquimista implements Comparable<Alquimista> {
    private String nombre;
    private String titulo;
    private List<Pocion> pociones;
    private Map<String, Integer> inventario;

    public Alquimista(String nombre, String titulo, List<Pocion> pociones, Map<String, Integer> inventario) {
        this.nombre = nombre;
        this.titulo = titulo;
        this.pociones = pociones;
        this.inventario = inventario;
    }

    @Override
    public String toString() {
        List<Pocion> copiaPociones = new ArrayList<>(pociones);
        copiaPociones.sort((p1, p2) -> {
            if (Integer.compare(p2.getPotencia(), p1.getPotencia()) == 0) {
                return p1.getNombre().compareTo(p2.getNombre());
            }

            return Integer.compare(p2.getPotencia(), p1.getPotencia());
        });

        Map<String, Integer> inventarioOrdenado = new TreeMap<>(inventario);

        return nombre + " (" + titulo + ")\nPociones: " + copiaPociones + "\nInventario: "
                + inventarioOrdenado;
    }

    @Override
    public int compareTo(Alquimista o) {
        return this.titulo.compareTo(o.titulo);
    }

    public int crearPociones() {
        List<Pocion> copia = new ArrayList<>(pociones);
        copia.sort((p1, p2) -> Integer.compare(p2.getPotencia(), p1.getPotencia()));

        int sumaPotencias = 0;

        for (Pocion p : pociones) {
            boolean puede = true;

            for (String ing : p.getIngredientes()) {
                if (!inventario.containsKey(ing)) {
                    puede = false;
                    break;
                }
            }

            if (puede) {
                for (String ing : p.getIngredientes()) {
                    int cant = inventario.get(ing) - 1;
                    if (cant == 0) {
                        inventario.remove(ing);
                    } else {
                        inventario.put(ing, cant);
                    }

                    sumaPotencias += p.getPotencia();
                }
            } else {
                System.out.println("No puede crear: " + p.getNombre());
            }
        }

        return sumaPotencias;

    }

    public String getNombre() {
        return nombre;
    }

    public String getTitulo() {
        return titulo;
    }

    public List<Pocion> getPociones() {
        return pociones;
    }

    public Map<String, Integer> getInventario() {
        return inventario;
    }

}
