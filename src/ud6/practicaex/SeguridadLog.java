package ud6.practicaex;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SeguridadLog {
    public static void main(String[] args) {
        try (BufferedReader in = new BufferedReader(new FileReader("seguridad.log"))) {
            Map<String, Integer> ipsPorApariciones = new HashMap<>();
            Map<String, Integer> ipsPorFallos = new HashMap<>();
            String linea;
            int contAccesos = 0;
            int contFallos = 0;
            while ((linea = in.readLine()) != null) {
                contAccesos++;
                int indicePrimerEspacio = linea.indexOf(' ');
                String ip = linea.substring(0, indicePrimerEspacio);

                if (linea.contains("FAIL")) {
                    contFallos++;
                    if (ipsPorFallos.containsKey(ip)) {
                        ipsPorFallos.put(ip, ipsPorFallos.get(ip) + 1);
                    } else {
                        ipsPorFallos.put(ip, 1);
                    }
                }

                if (ipsPorApariciones.containsKey(ip)) {
                    ipsPorApariciones.put(ip, ipsPorApariciones.get(ip) + 1);
                } else {
                    ipsPorApariciones.put(ip, 1);
                }
            }
            List<Entry<String, Integer>> entradasPorApariciones = new ArrayList<>(ipsPorApariciones.entrySet());
            entradasPorApariciones.sort((e1, e2) -> e2.getValue() - e1.getValue());
            List<Entry<String, Integer>> entradasPorFallos = new ArrayList<>(ipsPorFallos.entrySet());
            entradasPorFallos.sort((e1, e2) -> e2.getValue() - e1.getValue());
            double porcentaje = (double) contFallos * 100 / contAccesos;

            System.out.println("Total de accesos: " + contAccesos);
            System.out.println("Total de accesos fallidos: " + contFallos);
            System.out.println("Listado de IPs por apariciones:");
            for (Entry<String, Integer> e : entradasPorApariciones) {
                System.out.println(e.getKey() + " - " + e.getValue());
            }
            System.out.println("IP con más accesos: " + entradasPorApariciones.get(0).getKey());
            System.out.println("IP con mas FAIL: " + entradasPorFallos.get(0).getKey());
            System.out.println("Porcentaje fallos: " + porcentaje);

        } catch (IOException e) {
            System.out.println("Error de I/O");
        }
    }
}
