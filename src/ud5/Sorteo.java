package ud5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Sorteo<T> {
    Set<T> elementos;

    public Sorteo() {
        this.elementos = new LinkedHashSet<>();
    }

    public Sorteo(Collection<T> coleccion) {
        this.elementos = new LinkedHashSet<>(coleccion);
    }

    public boolean add(T elemento) {
        return elementos.add(elemento);
    }

    public Set<T> premiados(int numPremiados) {
        List<T> listaAux = new ArrayList<>(elementos);
        Collections.shuffle(listaAux);

        Set<T> res = new LinkedHashSet<>();
        res.addAll(listaAux.subList(0, Math.min(numPremiados, elementos.size())));

        return res;
    }

    public boolean addAll(Collection<T> coleccion) {
        return elementos.addAll(coleccion);
    }

}
