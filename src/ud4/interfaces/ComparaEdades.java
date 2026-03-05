package ud4.interfaces;

import java.util.Comparator;

public class ComparaEdades implements Comparator<Socio> {

    @Override
    public int compare(Socio o1, Socio o2) {
        return o1.edad - o2.edad;
    }

}
