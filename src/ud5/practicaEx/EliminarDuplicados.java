package ud5.practicaEx;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class EliminarDuplicados {
    static Set<String> eliminarDuplicados(List<String> lista) {
        if (lista == null || lista.isEmpty()) {
            return null;
        }

        Set<String> sinDuplicados = new HashSet<>(lista);
        
        return sinDuplicados;
    }
}
