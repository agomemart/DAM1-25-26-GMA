package ud6.practicaex;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LogApache {
    public static void main(String[] args) {
        try {
            BufferedReader in = new BufferedReader(new FileReader("bacharelato_access.log"));
            Map<String, Integer> accesosPorIp = new HashMap<>();
            int accesosIncorrectos = 0;
            int totalAccesos = 0;

            String linea;

            while ((linea = in.readLine()) != null) {
                totalAccesos++;

                int posPrimerEspacio = linea.indexOf(" ");
                String ip = linea.substring(0, posPrimerEspacio);
                int pos404 = linea.indexOf("404");
                if (accesosPorIp.containsKey(ip)) {
                    accesosPorIp.put(ip, accesosPorIp.get(ip) + 1);
                } else {
                    accesosPorIp.put(ip, 1);
                }
                
                if (pos404 != -1) {
                    accesosIncorrectos++;
                }
            }
            in.close();

            List<Map.Entry<String, Integer>> entradas = new ArrayList<>(accesosPorIp.entrySet());
            entradas.sort((e1, e2) -> e2.getValue() - e1.getValue());
            
            System.out.println("Nº total de accesos al servidor: " + totalAccesos);
            System.out.println("Nº de accesos incorrectos: " + accesosIncorrectos);
            System.out.println("IPs por numero de accesos:");
            for (Map.Entry<String,Integer> e : entradas) {
                System.out.println(e.getKey() + " -> " + e.getValue() + " veces");
            }

        } catch (FileNotFoundException e) {
            System.out.println("El fichero no existe");
        } catch (IOException e) {
            System.out.println("Error de I/O");
        }
    }
}
