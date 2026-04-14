package ud5;

import java.util.ArrayList;
import java.util.List;

public interface Saludo<T>{
    String saludar(T o);

    static <T> List<String> saludoGrupo(List<T> lista, Saludo<T> saludo) {
        List<String> saludosGrupo = new ArrayList<>();
        for (T e : lista) {
            saludosGrupo.add(saludo.saludar(e));
        }

        return saludosGrupo;
    }

    static <T> List<String> saludoGrupo(T[] t, Saludo<T> saludo) {
        List<String> saludosGrupo = new ArrayList<>();
        for (T e : t) {
            saludosGrupo.add(saludo.saludar(e));
        }

        return saludosGrupo;
    }
}
