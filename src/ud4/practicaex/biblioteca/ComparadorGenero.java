package ud4.practicaex.biblioteca;

import java.util.Comparator;

public class ComparadorGenero implements Comparator<Material>{

    @Override
    public int compare(Material o1, Material o2) {
        return o1.getGenero().name().compareTo(o2.getGenero().name());
    }
    
}
