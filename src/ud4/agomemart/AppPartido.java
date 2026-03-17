package ud4.agomemart;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class AppPartido {

    public static void main(String[] args) {

        Equipo estudiantes = new Equipo("Estudiantes", "Verde");
        estudiantes.add(new Jugador("12345678A", "Juan Pérez", LocalDate.of(1990, 3, 13), 10, Posicion.ALERO));
        estudiantes.add(new Jugador("87654321B", "Ana Gómez", LocalDate.of(1985, 7, 22), 9, Posicion.PIVOT));
        estudiantes.add(new Jugador("56789012C", "Carlos López", LocalDate.of(2000, 1, 5), 11, Posicion.BASE));

        Equipo basketClub = new Equipo("Basket Club", "Rojo");
        basketClub.add(new Jugador("34567890E", "Miguel Sánchez", LocalDate.of(1992, 11, 20), 7, Posicion.ESCOLTA));
        basketClub.add(new Jugador("23456789D", "Lucía Martínez", LocalDate.of(1995, 6, 30), 8, Posicion.ALERO));
        basketClub.add(new Jugador("87654321B", "Ana Gómez", LocalDate.of(1985, 7, 22), 9, Posicion.PIVOT));

        Partido partido = new Partido(estudiantes, basketClub);

        System.out.println(partido + "\n"); // Imprime el partido sin detalles ni resultado


        Arbitro arbitro = new Arbitro("12345678A", "Juan López");

        partido.setDetalles(arbitro, LocalDateTime.of(2026, 2, 12, 11, 30), "Pista superior");

        System.out.println(partido + "\n"); // Imprime el partido con detalles pero sin resultado


        partido.setResultado(35, 27);

        System.out.println(partido); // Imprime el resultado final del partido

    }

}
