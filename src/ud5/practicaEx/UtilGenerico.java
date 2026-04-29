package ud5.practicaEx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class UtilGenerico {
    public static <T> Collection<T> filtrarMayores(Collection<T> elementos, T elemento, Comparator<T> comp) {
        if (elementos == null || elementos.isEmpty() || comp == null) {
            return new ArrayList<>();
        }

        Collection<T> mayores = new LinkedList<>();
        
        for (T e : elementos) {
            if (comp.compare(e, elemento) >= 0) {
                mayores.add(e);
            }
        }

        return mayores;
    }

    public static <T> List<T> ordenarPorFrecuencia(List<T> lista) {
        if (lista == null || lista.isEmpty()) {
            return new ArrayList<>();
        }

        Map<T, Integer> frecuenciaElementos = new HashMap<>();
        for (T e : lista) {
            frecuenciaElementos.put(e, frecuenciaElementos.getOrDefault(e, 0) + 1);
           
        }
        
        List<T> resultado = new ArrayList<>(lista);
        resultado.sort((a, b) -> frecuenciaElementos.get(a).compareTo(frecuenciaElementos.get(b)));
        
        return resultado;
    }

    public static <K, V> Map<V, List<K>> invertirOrden(Map<K, V> mapa) {
        if (mapa == null || mapa.isEmpty()) {
            return new HashMap<>();
        }

        Map<V, List<K>> resultado = new HashMap<>();

        for (Map.Entry<K,V> entry : mapa.entrySet()) {
            K clave = entry.getKey();
            V valor = entry.getValue();

            if (!resultado.containsKey(valor)) {
                resultado.put(valor, new ArrayList<>());
            }

            resultado.get(valor).add(clave);
        }

        
        

        return resultado;
    }

    public static void main(String[] args) {
        Collection<Integer> numeros = Arrays.asList(2, 4, 5, 6, 7, 8, 9);
        Comparator<Integer> numerosAsc = (n1, n2) -> Integer.compare(n1, n2);

        Collection<Integer> mayores = filtrarMayores(numeros, 7, numerosAsc);
        System.out.println(mayores);
        
        List<String> palabras = Arrays.asList("hola", "adios", "hola", "la", "hola", "resultado", "la");
        List<String> palabrasPorFrecuencia = ordenarPorFrecuencia(palabras);
        System.out.println(palabrasPorFrecuencia);
    }
}
