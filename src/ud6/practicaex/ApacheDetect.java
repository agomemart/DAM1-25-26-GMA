package ud6.practicaex;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ApacheDetect {
    public static void main(String[] args) {
        try (BufferedReader in = new BufferedReader(new FileReader("apache_access.log"))) {
            String linea;
            int contAccesos = 0;
            int cont404 = 0;
            int contLogin = 0;
            int contPostError = 0;
            Set<String> ipsAdmin = new HashSet<>();
            Map<String, Integer> ipsPorAcceso = new HashMap<>();
            List<String> lineasSospechosas = new ArrayList<>();

            while ((linea = in.readLine()) != null) {
                contAccesos++;
                String[] partes = linea.split(" ");
                String ip = partes[0];

                if (partes[7].equals("404")) {
                    cont404++;
                }

                if (partes[5].equals("/login")) {
                    contLogin++;
                    
                    if (ipsPorAcceso.containsKey(ip)) {
                        ipsPorAcceso.put(ip, ipsPorAcceso.get(ip) + 1);
                    } else {
                        ipsPorAcceso.put(ip, 1);
                    }
                }

                if (partes[5].equals("/admin")) {
                    ipsAdmin.add(ip);
                }

                if (partes[4].equals("\"POST") && Integer.parseInt(partes[7]) >= 400) {
                    contPostError++;
                }

                if (linea.contains("HTTP/1.1\" 404")) {
                    lineasSospechosas.add(linea);
                }
            }

            List<Map.Entry<String, Integer>> entradas = new ArrayList<>(ipsPorAcceso.entrySet());
            entradas.sort((e1, e2) -> e2.getValue() - e1.getValue());

            System.out.println("Total accesos: " + contAccesos);
            System.out.println("Total accesos 404: " + cont404);
            System.out.println("Total accesos /login:" + contLogin);
            System.out.println("IPs que intentaron acceder a /admin:");
            for (String ip : ipsAdmin) {
                System.out.println(ip);
            }
            System.out.println("Nº accesos POST 400 o más: " + contPostError);
            System.out.println("IP que más veces accedio a /login: " + entradas.get(0).getKey());
            System.out.println("Lineas sospechosas:");
            for (String l : lineasSospechosas) {
                System.out.println(l);
            }

        } catch (IOException e) {
            System.out.println("Error al leer el fichero");
        }
    }
}
