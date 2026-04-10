package ud5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import ud3.Util;

public class E1216 {
    
    public static void main(String[] args) {
        // Cargar fichero
        String[] lineas = Util.readFileToStringArray("DATOS - Académicos RAE (2025_04_11).txt");
        // Crear Mapa
        Map<Character, Academico> mapaAcademia = new HashMap<>();

        // Recorrer y analizar lineas
        for (String linea : lineas) {
            if (linea == null || linea.isEmpty()) {
                continue;
            }
            // Crear academicos y entradas del mapa
            char letra = linea.charAt(6);
            String nombre = linea.substring(7, linea.length() - 6);
            int anho = Integer.valueOf(linea.substring(linea.length() - 5, linea.length() - 1));
            mapaAcademia.put(letra, new Academico(nombre, anho));

        }
        
        // Listados:
        // 1. sin letra, por orden de nombre
        System.out.println("Académicos ordenados por nombre:");
        Set<Academico> listaNombres = new TreeSet<>(mapaAcademia.values());
        System.out.println(listaNombres);
        
        // 2. sin letra, por orden de año de ingreso y en caso de empate por nombre
        System.out.println("\nAcadémicos ordenados por año de ingreso y nombre:");
        Comparator<Academico> compAnhoNombre = new Comparator<Academico>() {
            @Override
            public int compare(Academico o1, Academico o2) {
                int res = o1.anhoIngreso - o2.anhoIngreso;
                if (res == 0) {
                    return o1.nombre.compareTo(o2.nombre);
                }
                return res;
            }
            
        };

        List<Academico> listaAnhoNombres = new ArrayList<>(mapaAcademia.values());
        listaAnhoNombres.sort(compAnhoNombre);
        for (Academico a : listaAnhoNombres) {
            System.out.println(a.anhoIngreso + " - " + a.nombre);
        }

        // 3. con letra, por orden de letra (clave), indicando nombre y fecha de
        // ingreso.
        System.out.println("\nAcadémicos ordenados por letra, indicando nombre y año de ingreso");
        Set<Character> letras = new TreeSet<>(mapaAcademia.keySet());
        for (Character letra : letras) {
            System.out.println(letra + " - " + mapaAcademia.get(letra));
        }

    }
}
