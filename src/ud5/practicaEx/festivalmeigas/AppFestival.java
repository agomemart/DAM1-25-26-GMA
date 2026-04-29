package ud5.practicaEx.festivalmeigas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AppFestival {

    public static void main(String[] args) {
        System.out.println("\nFESTIVAL DE MEIGAS");
        System.out.println("==================\n");
        // Crea un array de meigas de exemplo
        Meiga[] meigasExemplo = Meiga.crearMeigasExemplo(Feitizo.crearFeitizosExemplo());

        // TODO: Ordena as Meigas de menor a maior número de feitizos
        Comparator<Meiga> porNumFeitizosAsc = (m1, m2) -> Integer.compare(m1.getFeitizos().size(), m2.getFeitizos().size());
        Arrays.sort(meigasExemplo, porNumFeitizosAsc);

        // Para cada meiga do festival, imprime os seus datos, lanza os
        // feitizos posibles, e imprime os puntos obtidos.
        Map<Meiga, Integer> puntuaciones = new HashMap<>();
        
        for (Meiga meiga : meigasExemplo) {
            System.out.println("MEIGA: ");
            System.out.println(meiga);
            int puntos = meiga.lanzarFeitizos();
            System.out.println("TOTAL PUNTOS: " + puntos + "\n\n");

            // TODO: Engade o código que necesites...
            puntuaciones.put(meiga, puntos);
        }

        // Amosa a clasificación final do festival
        System.out.println("Clasificación Final do Festival: ");
        // TODO: Engade o código que necesites...
        List<Map.Entry<Meiga, Integer>> lista = new ArrayList<>(puntuaciones.entrySet());
        lista.sort((e1, e2) -> {
            if (Integer.compare(e2.getValue(), e1.getValue()) == 0) {
                return e1.getKey().compareTo(e2.getKey());
            }

            return Integer.compare(e2.getValue(), e1.getValue());
        });

        for (Map.Entry<Meiga,Integer> entry : lista) {
            System.out.println(entry.getKey() + " (" + entry.getKey().getAlcume() + ")");
        }

        System.out.println("\nFIN DO FESTIVAL DE MEIGAS\n");
    }

}
