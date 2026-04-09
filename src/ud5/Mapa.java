package ud5;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Mapa {
    public static void main(String[] args) {
        Map<String, Double> m = new HashMap<>();

        m.put("Ana", 1.65);
        m.put("Marta", 1.60);
        m.put("Luis", 1.73);
        m.put("Pedro", 1.69);
        m.put("Pedrito", 1.69);

        System.out.println(m);

        double estaturaLuis = m.get("Luis");
        System.out.println("Estatura de Luis: " + estaturaLuis);

        System.out.println(m.containsKey("Marta"));
        System.out.println(m.containsKey("Marte"));
        System.out.println(m.containsValue(1.73));

        Set<String> claves = m.keySet();
        System.out.println(claves);

        Collection<Double> valores = m.values();
        System.out.println(valores);

        Set<Entry<String, Double>> entradas = m.entrySet();
        System.out.println(entradas);

        for (Entry<String,Double> entrada : entradas) {
            if (entrada.getValue()>= 1.7) {
                System.out.println(entrada.getKey());
            } else {
                entrada.setValue(entrada.getValue() + 0.2);
            }
        }

        Iterator<Entry<String, Double>> it = entradas.iterator();
        while (it.hasNext()) {
            Entry<String,Double> entrada = it.next();
            if (entrada.getValue() >= 1.7) {
                it.remove();
            }
        }

        System.out.println(entradas);
        System.out.println(m);

    }
}
