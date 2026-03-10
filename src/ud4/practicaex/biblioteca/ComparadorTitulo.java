package ud4.practicaex.biblioteca;

import java.util.Comparator;

public class ComparadorTitulo implements Comparator<Material>{

    @Override
    public int compare(Material o1, Material o2) {
        return o1.getTitulo().compareTo(o2.getTitulo());
    }
    
}
