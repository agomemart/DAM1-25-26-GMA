package ud6.practicaex;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class EstadisticasNotas {
    public static void main(String[] args) {
        try (BufferedReader in = new BufferedReader(new FileReader("Notas.txt"))) {
            Map<String, Integer> alumnosNotas = new HashMap<>();
            String linea;
            int sumaNotas = 0;
            int contAprobados = 0;
            while ((linea = in.readLine()) != null) {
                int posPrimerEspacio = linea.indexOf(' ');
                String nombre = linea.substring(0, posPrimerEspacio);
                try {
                    int nota = Integer.parseInt(linea.substring(posPrimerEspacio + 1));
                    alumnosNotas.put(nombre, nota);
                    sumaNotas += nota;
                    if (nota >= 5) {
                        contAprobados++;
                    }
                } catch(NumberFormatException e) {
                    System.out.println("Formato de nota incorrecto");
                    continue;
                }
            }

            double media = (double)sumaNotas / alumnosNotas.size();
            List<Entry<String, Integer>> entradas = new ArrayList<>(alumnosNotas.entrySet());
            entradas.sort((e1, e2) -> e2.getValue() - e1.getValue());

            System.out.println("Media: " + media);
            System.out.println("Nº aprobados: " + contAprobados);
            System.out.println("Alumno con mayor nota: " + entradas.getFirst().getKey());
            System.out.println("Alumno con menor nota: " + entradas.getLast().getKey());
            System.out.println("Lista alumnos por nota:");
            for (Entry<String,Integer> e : entradas) {
                System.out.println(e.getKey() + " - " + e.getValue());
            }

        } catch (IOException e) {
            System.out.println("Error de I/O");
        }
    }
}
