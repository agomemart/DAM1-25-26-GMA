package ud5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

enum Posicion {
    PORTERO, DEFENSA, CENTROCAMPISTA, DELANTERO
}

public class EP1237 {
    static void altaJugador(Map<Integer, Jugador> plantilla, Integer dorsal, Jugador jugador) {
        plantilla.put(dorsal, jugador);
    }

    static Jugador eliminarJugador(Map<Integer, Jugador> plantilla, Integer dorsal) {
        Jugador eliminado = plantilla.get(dorsal);
        plantilla.remove(dorsal);
        return eliminado;
    }

    static void mostrar(Map<Integer, Jugador> plantilla) {
        Set<Integer> dorsales = plantilla.keySet();
        List<Jugador> jugadores = new ArrayList<>(plantilla.values());

        Iterator<Integer> it = dorsales.iterator();
        int cont = 0;
        while (it.hasNext()) {
            System.out.println(it.next() + " - " + jugadores.get(cont));
            cont++;
        }
    }

    static void mostrar(Map<Integer, Jugador> plantilla, String posicion) {
        Set<Integer> dorsales = plantilla.keySet();
        List<Jugador> jugadores = new ArrayList<>(plantilla.values());

        Iterator<Integer> it = dorsales.iterator();
        int cont = 0;
        while (it.hasNext()) {
            if (jugadores.get(cont).posicion.equals(posicion)) {
                System.out.println(it.next() + " - " + jugadores.get(cont));
                cont++;
            }
            cont++;
        }
    }

    static boolean editarJugador(Map<Integer, Jugador> plantilla, Integer dorsal, Jugador jugador) {
        if (plantilla.get(dorsal) != null) {
            Jugador jugadorEditado = plantilla.get(dorsal);
            jugadorEditado.estatura = jugador.estatura;
            jugadorEditado.nombre = jugador.nombre;
            jugadorEditado.posicion = jugador.posicion;
            plantilla.put(dorsal, jugadorEditado);

            return true;
        }

        return false;
    }
}

class Jugador {
    String dni;
    String nombre;
    Posicion posicion;
    int estatura;

    public Jugador(String dni, String nombre, Posicion posicion, int estatura) {
        this.dni = dni;
        this.nombre = nombre;
        this.posicion = posicion;
        this.estatura = estatura;
    }

    @Override
    public String toString() {
        return nombre;
    }

}
