package ud5.practicaEx;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EjerMap {
    static Map<String, Double> calcularMedias(Map<String, List<Integer>> mapa) {
        if (mapa == null || mapa.isEmpty()) {
            return new HashMap<>();
        }

        Map<String, Double> res = new HashMap<>();
        for (Map.Entry<String, List<Integer>> entrada : mapa.entrySet()) {
            List<Integer> listaNotas = entrada.getValue();
            double sumaNotas = 0;
            for (Integer nota : listaNotas) {
                sumaNotas += nota;
            }
            double media = sumaNotas / listaNotas.size();
            res.put(entrada.getKey(), media);

        }

        return res;
    }

    static String mejorAlumno(Map<String, Double> mapa) {
        if (mapa == null || mapa.isEmpty()) {
            return null;
        }

        double mayorMedia = 0;
        String alumnoMayorMedia = null;
        for (Map.Entry<String, Double> entry : mapa.entrySet()) {
            if (alumnoMayorMedia == null || entry.getValue() > mayorMedia || (entry.getValue().equals(mayorMedia) && entry.getKey().compareTo(alumnoMayorMedia) < 0)) {
                mayorMedia = entry.getValue();
                alumnoMayorMedia = entry.getKey();
            }
        }

        return alumnoMayorMedia;
    }

    static Map<Integer, List<String>> agruparPorAprobados(Map<String, List<Integer>> mapa) {
        if (mapa == null || mapa.isEmpty()) {
            return new HashMap<>();
        }

        Map<Integer, List<String>> res = new HashMap<>();

        for (Map.Entry<String, List<Integer>> entry : mapa.entrySet()) {
            int aprobados = 0;

            for (Integer nota : entry.getValue()) {
                if (nota >= 5) {
                    aprobados++;
                }
            }

            if (res.containsKey(aprobados)) {
                res.get(aprobados).add(entry.getKey());
            } else {
                List<String> lista = new ArrayList<>();
                lista.add(entry.getKey());
                res.put(aprobados, lista);
            }
        }

        
        return res;
    }
}
