package ud5.agomemart;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * @author Adrián Gómez Martínez
 */
public class Playa {
    int id;
    String nombre;
    String concello;
    String provincia;
    double lat;
    double lon;

    public Playa(int id, String nombre, String concello, String provincia, double lat, double lon) {
        this.id = id;
        this.nombre = nombre;
        this.concello = concello;
        this.provincia = provincia;
        this.lat = lat;
        this.lon = lon;
    }

    static void playasConcello(List<Playa> playas, String concello) {
        if (playas == null || playas.isEmpty() || concello == null || concello.isEmpty()) {
            return;
        }

        Iterator<Playa> it = playas.iterator();

        while (it.hasNext()) {
            if (!it.next().concello.equalsIgnoreCase(concello)) {
                it.remove();
            }
        }
    }

    static List<Playa> playasOrdenadas(List<Playa> playas, Comparator<Playa> comp1, Comparator<Playa> comp2) {
        if (playas == null || playas.isEmpty() || comp1 == null || comp2 == null) {
            return new ArrayList<>();
        }

        Comparator<Playa> comparador = comp1.thenComparing(comp2);
        List<Playa> res = new ArrayList<>(playas);
        res.sort(comparador);

        return res;
    }

    static Map<String, List<Playa>> playasPorProvincia(List<Playa> lista) {
        if (lista == null || lista.isEmpty()) {
            return new HashMap<>();
        }

        Map<String, List<Playa>> res = new LinkedHashMap<>();
        for (Playa playa : lista) {
            String clave = playa.provincia;

            if (res.containsKey(clave)) {
                List<Playa> playasProvincia = res.get(clave);
                playasProvincia.add(playa);
                res.put(clave, playasProvincia);
            } else {
                List<Playa> playasProvincia = new ArrayList<>();
                playasProvincia.add(playa);
                res.put(clave, playasProvincia);
            }
        }

        return res;
    }

    static Map<Playa, Integer> playasFavoritas(Map<String, List<Playa>> mapa) {
        if (mapa == null || mapa.isEmpty()) {
            return new HashMap<>();
        }

        Map<Playa, Integer> res = new HashMap<>();
        Integer puntuacion = 0;
        for (Map.Entry<String, List<Playa>> entrada : mapa.entrySet()) {
            List<Playa> playas = new ArrayList<>(entrada.getValue());
            for (Playa playa : playas) {
                if (res.containsKey(playa)) {
                    puntuacion = res.get(playa);
                } else {
                    puntuacion = 0;
                }

                if (playas.indexOf(playa) == 0) {
                    puntuacion += 10;
                } else if (playas.indexOf(playa) == 1) {
                    puntuacion += 5;
                } else if (playas.indexOf(playa) == 2) {
                    puntuacion += 2;
                }

                if (puntuacion != 0) {
                    res.put(playa, puntuacion);
                }
            }
        }

        Set<Entry<Playa, Integer>> setEntradas = res.entrySet();

        Comparator<Entry<Playa, Integer>> comp = (e1, e2) -> {
            if (Integer.compare(e1.getValue(), e2.getValue()) == 0) {
                return e1.getKey().nombre.compareTo(e2.getKey().nombre);
            }
            return Integer.compare(e1.getValue(), e2.getValue());
        };

        List<Entry<Playa, Integer>> listaOrdenada = new ArrayList<>(setEntradas);
        listaOrdenada.sort(comp);

        Map<Playa, Integer> resOrdenado = new LinkedHashMap<>();
        for (Entry<Playa, Integer> entrada : listaOrdenada) {
            resOrdenado.put(entrada.getKey(), entrada.getValue());
        }

        return resOrdenado;
    }
}
