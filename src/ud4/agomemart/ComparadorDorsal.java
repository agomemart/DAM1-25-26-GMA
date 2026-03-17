package ud4.agomemart;

/**
 * @author Adrián Gómez Martínez
 */
import java.util.Comparator;

public class ComparadorDorsal implements Comparator<Jugador> {
    @Override
    public int compare(Jugador j1, Jugador j2) {
        return j1.getDorsal() - j2.getDorsal();
    }
}
