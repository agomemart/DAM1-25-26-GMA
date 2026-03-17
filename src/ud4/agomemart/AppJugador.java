package ud4.agomemart;
import java.time.LocalDate;

public class AppJugador {
    public static void main(String[] args) {
        Jugador[] jugadores = {
            new Jugador("12345678A", "Juan Pérez", LocalDate.of(1990, 3, 13), 10, Posicion.ALERO),
            new Jugador("87654321B", "Ana Gómez", LocalDate.of(1985, 7, 22), 9, Posicion.PIVOT),
            new Jugador("56789012C", "Carlos López", LocalDate.of(2000, 1, 5), 11, Posicion.BASE)
        };

        System.out.println("\nListado de jugadores ordenados por dorsal:");        
        Jugador.sort(jugadores);
        for (Jugador j : jugadores) {
            System.out.println("- " + j);
        }
    }
}
