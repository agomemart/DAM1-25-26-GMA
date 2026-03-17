package ud4.agomemart;

import java.util.Arrays;

/**
 * @author Adrián Gómez Martínez
 */
public class Equipo {
    private String nombre;
    private String color;
    private Jugador[] jugadores;

    public Equipo(String nombre, String color) {
        if (nombre != null && !nombre.isEmpty() && color != null && !color.isEmpty()) {
            this.nombre = nombre;
            this.color = color;
            this.jugadores = new Jugador[0];
        } else {
            throw new IllegalArgumentException("Datos incorrectos.");
        }

    }

    public boolean add(Jugador jugador) {
        if (jugador == null || jugadores.length == 4) {
            return false;
        }

        for (Jugador jug : jugadores) {
            if (jug.getDorsal() == jugador.getDorsal() || jug.dni.equals(jugador.dni)) {
                return false;
            }
        }

        jugadores = Arrays.copyOf(jugadores, jugadores.length + 1);
        jugadores[jugadores.length - 1] = jugador;
        return true;
    }

    @Override
    public String toString() {
        String salida = nombre + "\nColor camiseta:\n- " + color + "\nJugadores:\n";
        for (Jugador jugador : jugadores) {
            salida += jugador.toString() + "\n";
        }
        return salida;
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
        Equipo other = (Equipo) obj;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;
        if (!Arrays.equals(jugadores, other.jugadores))
            return false;
        return true;
    }

    public String getNombre() {
        return nombre;
    }

    public Jugador[] getJugadores() {
        return jugadores;
    }

}
