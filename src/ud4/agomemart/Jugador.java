package ud4.agomemart;

/**
 * @author Adrián Gómez Martínez
 */
import java.util.Arrays;
import java.time.LocalDate;

public class Jugador extends Persona {

    private int dorsal;
    private Posicion posicion;

    public Jugador(String dni, String nombre, LocalDate fechaNacimiento, int dorsal, Posicion posicion) {
        super(dni, nombre, fechaNacimiento);
        if (dorsal > 1 && dorsal < 99) {
            this.dorsal = dorsal;
            this.posicion = posicion;
        } else {
            throw new IllegalArgumentException("Dorsal incorrecto.");
        }

    }

    @Override
    public String toString() {
        return dorsal + ". " + nombre + " (" + posicion + ", " + getEdad() + " años)";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        Jugador other = (Jugador) obj;
        if (dorsal != other.dorsal)
            return false;
        if (posicion != other.posicion)
            return false;
        return true;
    }

    public int getDorsal() {
        return dorsal;
    }

    public static void sort(Jugador[] jugadores) {
        Arrays.sort(jugadores, new ComparadorDorsal());
    }

}
