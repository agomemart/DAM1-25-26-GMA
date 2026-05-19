package ud6.practicaex;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SeguridadWeb {
    public static void main(String[] args) {
        try (BufferedReader in = new BufferedReader(new FileReader("seguridad_web.log"))) {
            String linea;
            int contAccesos = 0;
            int contAccesosIncorrectos = 0;
            int contGet = 0;
            int contPost = 0;
            int tamanoTotal = 0;
            Map<String, Integer> ipsPorApariciones = new HashMap<>();
            Map<String, Integer> urlPorMasSolicitada = new HashMap<>();
            Map<String, Integer> ipsPorMasErrores = new HashMap<>();

            while ((linea = in.readLine()) != null) {
                contAccesos++;
                String[] partes = linea.split(" ");
    
                if (Integer.parseInt(partes[5]) >= 400) {
                    contAccesosIncorrectos++;
                    if (ipsPorMasErrores.containsKey(partes[0])) {
                        ipsPorMasErrores.put(partes[0], ipsPorMasErrores.get(partes[0]) + 1);
                    } else {
                        ipsPorMasErrores.put(partes[0], 1);
                    }
                }

                if (partes[3].equals("GET")) {
                    contGet++;
                } else {
                    contPost++;
                }

                if (ipsPorApariciones.containsKey(partes[0])) {
                    ipsPorApariciones.put(partes[0], ipsPorApariciones.get(partes[0]) + 1);
                } else {
                    ipsPorApariciones.put(partes[0], 1);
                }

                if (urlPorMasSolicitada.containsKey(partes[4])) {
                    urlPorMasSolicitada.put(partes[4], urlPorMasSolicitada.get(partes[4]) + 1);
                } else {
                    urlPorMasSolicitada.put(partes[4], 1);
                }

                tamanoTotal += Integer.parseInt(partes[6]);
            }

            List<Map.Entry<String, Integer>> entradasApariciones = new ArrayList(ipsPorApariciones.entrySet());
            List<Map.Entry<String, Integer>> entradasSolicitudes = new ArrayList(urlPorMasSolicitada.entrySet());
            List<Map.Entry<String, Integer>> entradasErrores = new ArrayList(ipsPorMasErrores.entrySet());

            Comparator<Map.Entry<String, Integer>> desc = (e1, e2) -> e2.getValue() - e1.getValue();
            entradasApariciones.sort(desc);
            entradasSolicitudes.sort(desc);
            entradasErrores.sort(desc);

            System.out.println("Total accesos: " + contAccesos);
            System.out.println("Accesos incorrectos: " + contAccesosIncorrectos);
            System.out.println("GET: " + contGet);
            System.out.println("POST: " + contPost);
            System.out.println();
            System.out.println("IPs registradas:");
            for (Map.Entry<String,Integer> e : entradasApariciones) {
                System.out.println(e.getKey() + " - " + e.getValue());
            }
            System.out.println("URL más solicitada: " + entradasSolicitudes.get(0).getKey());
            System.out.println("IP con más errores: " + entradasErrores.get(0).getKey());
            System.out.println("Tamaño total transferido: " + tamanoTotal);

        } catch (IOException e) {
            System.out.println("Error de I/O");
        } catch (NumberFormatException e) {
            System.out.println("Formato de numero incorrecto");
        }

        
    }
}
