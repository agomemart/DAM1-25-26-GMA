package ud4.practicaex.biblioteca2;

import java.util.Comparator;

public class ComparadorTituloLongitud implements Comparator<Material>{

    @Override
    public int compare(Material o1, Material o2) {
        if (o1.getTitulo().length() - o2.getTitulo().length() == 0) {
            return  o1.getTitulo().compareTo(o2.getTitulo());
        }
        return o1.getTitulo().length() - o2.getTitulo().length();
    }
    
}
