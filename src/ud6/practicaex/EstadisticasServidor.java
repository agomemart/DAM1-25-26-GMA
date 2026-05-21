package ud6.practicaex;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EstadisticasServidor {
    public static void main(String[] args) {
        try (BufferedReader in = new BufferedReader(new FileReader("servidor.log"))) {
            String linea;
            int contAccesos = 0;
            int contErrores = 0;
            int contGet = 0;
            int contPost = 0;
            int tamano = 0;
            Map<String, Integer> ipsPorRepeticiones = new HashMap<>();
            Map<String, Integer> urlPorApariciones = new HashMap<>();
            Map<String, Integer> navegadorPorApariciones = new HashMap<>();
            Map<String, Integer> ipMasErrores = new HashMap<>();

            while ((linea = in.readLine()) != null) {
                contAccesos++;
                String[] partes = linea.split(" ");

                if (Integer.parseInt(partes[5]) >= 400) {
                    contErrores++;
                    if (ipMasErrores.containsKey(partes[0])) {
                        ipMasErrores.put(partes[0], ipMasErrores.get(partes[0]) + 1);
                    } else {
                        ipMasErrores.put(partes[0], 1);
                    }
                }

                if (partes[3].equals("GET")) {
                    contGet++;
                } else {
                    contPost++;
                }

                if (ipsPorRepeticiones.containsKey(partes[0])) {
                    ipsPorRepeticiones.put(partes[0], ipsPorRepeticiones.get(partes[0]) + 1);
                } else {
                    ipsPorRepeticiones.put(partes[0], 1);
                }

                if (urlPorApariciones.containsKey(partes[4])) {
                    urlPorApariciones.put(partes[4], urlPorApariciones.get(partes[4]) + 1);
                } else {
                    urlPorApariciones.put(partes[4], 1);
                }

                if (navegadorPorApariciones.containsKey(partes[7])) {
                    navegadorPorApariciones.put(partes[7], navegadorPorApariciones.get(partes[7]) + 1);
                } else {
                    navegadorPorApariciones.put(partes[7], 1);
                }

                tamano += Integer.parseInt(partes[6]);
            }

            List<Map.Entry<String, Integer>> entradasIpApariciones = new ArrayList<>(ipsPorRepeticiones.entrySet());
            List<Map.Entry<String, Integer>> entradasUrlApariciones = new ArrayList<>(urlPorApariciones.entrySet());
            List<Map.Entry<String, Integer>> entradasNavApariciones = new ArrayList<>(
                    navegadorPorApariciones.entrySet());
            List<Map.Entry<String, Integer>> entradasIpErr = new ArrayList<>(ipMasErrores.entrySet());

            Comparator<Map.Entry<String, Integer>> comp = (e1, e2) -> e2.getValue() - e1.getValue();
            entradasIpApariciones.sort(comp);
            entradasUrlApariciones.sort(comp);
            entradasNavApariciones.sort(comp);
            entradasIpErr.sort(comp);

            System.out.println("Total de accesos: " + contAccesos);
            System.out.println("Total errores: " + contErrores);
            System.out.println("Total GET: " + contGet);
            System.out.println("Total POST: " + contPost);
            System.out.println("IPs por repeticiones:");
            for (Map.Entry<String, Integer> e : entradasIpApariciones) {
                System.out.println(e.getKey() + " - " + e.getValue());
            }
            System.out.println("URL más visitada: " + entradasUrlApariciones.get(0).getKey());
            System.out.println("Navegador más usado: " + entradasNavApariciones.get(0).getKey());
            System.out.println("IP con más errores: " + entradasIpErr.get(0).getKey());
            System.out.println("Tamaño total transferido: " + tamano);

        } catch (IOException e) {
            System.out.println("Error al leer el archivo");
        }
    }
}
