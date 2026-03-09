package ud4.practicaex.productos;

import java.util.Comparator;

public class ComparadorStock implements Comparator<Producto>{

    @Override
    public int compare(Producto o1, Producto o2) {
        return o2.getStock() - o1.getStock();
    }
    
}
