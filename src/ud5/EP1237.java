package ud5;

import java.util.Map;

enum Posicion {
    PORTERO, DEFENSA, CENTROCAMPISTA, DELANTERO
}

public class EP1237 {
    static void altaJugador(Map<Integer, Jugador> plantilla, Integer dorsal, Jugador jugador) {
        if (!plantilla.containsKey(dorsal)) {
            plantilla.put(dorsal, jugador);
        } else {
            System.out.println("Dorsal ya existente!");
        }

    }

    static Jugador eliminarJugador(Map<Integer, Jugador> plantilla, Integer dorsal) {
        return plantilla.remove(dorsal);
    }

    static void mostrar(Map<Integer, Jugador> plantilla) {
        for (Map.Entry<Integer, Jugador> entry : plantilla.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }

    static void mostrar(Map<Integer, Jugador> plantilla, String posicion) {
        for (Map.Entry<Integer, Jugador> entry : plantilla.entrySet()) {
            if (entry.getValue().posicion.toString().equals(posicion.toString())) {
                System.out.println(entry.getKey() + " - " + entry.getValue());
            }
        }
    }

    static boolean editarJugador(Map<Integer, Jugador> plantilla, Integer dorsal, Jugador jugador) {
        if (plantilla.containsKey(dorsal)) {
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
