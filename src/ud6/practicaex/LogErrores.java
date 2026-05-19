package ud6.practicaex;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class LogErrores {
    public static void main(String[] args) {
        try (BufferedReader in = new BufferedReader(new FileReader("errores.log"))) {
            Map<String, Integer> ipsPorAparicion = new HashMap<>();
            Map<String, Integer> ipsPorErrores = new HashMap<>();
            int totalRegistros = 0;
            int contErrores = 0;
            String linea;

            while ((linea = in.readLine()) != null) {
                totalRegistros++;
                int posPrimerEspacio = linea.indexOf(' ');
                String ip = linea.substring(0, posPrimerEspacio);
                if (linea.indexOf("ERROR") != -1) {
                    contErrores++;
                    if (ipsPorErrores.containsKey(ip)) {
                        ipsPorErrores.put(ip, ipsPorErrores.get(ip) + 1);
                    } else {
                        ipsPorErrores.put(ip, 1);
                    }
                }

                if (ipsPorAparicion.containsKey(ip)) {
                    ipsPorAparicion.put(ip, ipsPorAparicion.get(ip) + 1);
                } else {
                    ipsPorAparicion.put(ip, 1);
                }
            }

            List<Entry<String, Integer>> listaEntradas = new ArrayList<>(ipsPorAparicion.entrySet());
            listaEntradas.sort((e1, e2) -> e2.getValue() - e1.getValue());

            List<Entry<String, Integer>> listaEntradas2 = new ArrayList<>(ipsPorErrores.entrySet());
            listaEntradas2.sort((e1, e2) -> e2.getValue() - e1.getValue());

            System.out.println("Nº total de registros: " + totalRegistros);
            System.out.println("Nº total de errores: " + contErrores);
            System.out.println("IPs distintas por aparicion: ");
            for (Entry<String,Integer> entry : listaEntradas) {
                System.out.println(entry.getKey() + " - " + entry.getValue() + " veces");
            }
            System.out.println("IP con mayor número de errores: " + listaEntradas2.getFirst().getKey());
        } catch (IOException e) {
            System.out.println("Error de I/O");
        }
    }
}
