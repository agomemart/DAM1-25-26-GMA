package ud5.practicaEx;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class FuncionesMap {
    public static Map<String, Integer> contarPalabras(List<String> lista) {
        if (lista == null || lista.isEmpty()) {
            return new HashMap<>();
        }
        Map<String, Integer> contarPalabras = new HashMap<>();

        for (String string : lista) {
            if (contarPalabras.get(string) == null) {
                contarPalabras.put(string, 1);
            } else {
                contarPalabras.put(string, contarPalabras.get(string) + 1);
            }
        }

        return contarPalabras;
    }

    static String claveMayorValor(Map<String, Integer> mapa) {
        if (mapa == null || mapa.isEmpty()) {
            return null;
        }

        int maxValor = Integer.MIN_VALUE;
        String claveMax = null;
        for (Map.Entry<String, Integer> entry : mapa.entrySet()) {

            if (entry.getValue() > maxValor) {
                claveMax = entry.getKey();
                maxValor = entry.getValue();
            }
        }

        return claveMax;
    }

    static Map<Integer, String> invertir(Map<String, Integer> mapa) {
        if (mapa == null || mapa.isEmpty()) {
            return new HashMap<>();
        }

        Map<Integer, String> mapaInvertido = new HashMap<>();
        for (Map.Entry<String, Integer> entry : mapa.entrySet()) {
            mapaInvertido.put(entry.getValue(), entry.getKey());
        }

        return mapaInvertido;
    }

    static int sumaValores(Map<String, Integer> mapa) {
        if (mapa == null || mapa.isEmpty()) {
            return 0;
        }

        int suma = 0;
        for (Integer num : mapa.values()) {
            suma += num;
        }

        return suma;
    }

    static Map<String, Integer> filtrar(Map<String, Integer> mapa, int minimo) {
        if (mapa == null || mapa.isEmpty()) {
            return new HashMap<>();
        }

        Map<String, Integer> mapaFiltrado = new HashMap<>();
        for (Map.Entry<String, Integer> entry : mapa.entrySet()) {
            if (entry.getValue() != null && entry.getValue() >= minimo) {
                mapaFiltrado.put(entry.getKey(), entry.getValue());
            }
        }

        return mapaFiltrado;
    }

    static Map<Character, Integer> contarPorInicial(List<String> nombres) {
        if (nombres == null || nombres.isEmpty()) {
            return new HashMap<>();
        }

        Map<Character, Integer> porInicial = new HashMap<>();
        for (String nombre : nombres) {
            char clave = nombre.toLowerCase().charAt(0);
            Integer valor = porInicial.get(clave);
            if (valor != null) {
                porInicial.put(clave, valor + 1);
            } else {
                porInicial.put(clave, 1);
            }
        }
        
        return porInicial;
    }

    static void eliminarMenores(Map<String, Integer> mapa, int limite) {
        if (mapa == null || mapa.isEmpty()) return;

        Iterator<Map.Entry<String, Integer>> it = mapa.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, Integer> entry = it.next();
            if (entry.getValue() < limite) {
                it.remove();
            }
        }
    }

    static Map<Integer, List<String>> agruparPorLongitud(List<String> palabras) {
        if (palabras == null || palabras.isEmpty()) {
            return new HashMap<>();
        }

        Map<Integer, List<String>> agrupadasPorLongitud = new HashMap<>();
        for (String palabra : palabras) {
            int longitud = palabra.length();

            if (!agrupadasPorLongitud.containsKey(longitud)) {
                agrupadasPorLongitud.put(longitud, new ArrayList<>());
            }

            agrupadasPorLongitud.get(longitud).add(palabra);
        }

        return agrupadasPorLongitud;
    }

    static Map.Entry<String, Integer> maxEntry(Map<String, Integer> mapa) {
        if (mapa == null ||mapa.isEmpty()) {
            return null;
        }

        Map.Entry<String, Integer> mayorValor = null;
        for (Map.Entry<String, Integer> entry : mapa.entrySet()) {
            if (mayorValor == null || entry.getValue() > mayorValor.getValue()) {
                mayorValor = entry;
            }
        }

        return mayorValor;
    }
}
