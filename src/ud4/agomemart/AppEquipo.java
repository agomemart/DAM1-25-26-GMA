package ud4.agomemart;
import java.time.LocalDate;

public class AppEquipo {
    public static void main(String[] args) {
        Equipo equipo = new Equipo("Estudiantes", "Verde");
        equipo.add(new Jugador("12345678A", "Juan Pérez", LocalDate.of(1990, 3, 13), 10, Posicion.ALERO));
        equipo.add(new Jugador("87654321B", "Ana Gómez", LocalDate.of(1985, 7, 22), 9, Posicion.PIVOT));
        equipo.add(new Jugador("56789012C", "Carlos López", LocalDate.of(2000, 1, 5), 11, Posicion.BASE));
        equipo.add(new Jugador("56789012C", "Carlos López", LocalDate.of(2000, 1, 5), 11, Posicion.BASE)); // Intento de añadir jugador duplicado
        equipo.add(new Jugador("23456789D", "Lucía Martínez", LocalDate.of(1995, 6, 30), 8, Posicion.ALERO));
        equipo.add(new Jugador("34567890E", "Miguel Sánchez", LocalDate.of(1992, 11, 20), 7, Posicion.ESCOLTA));
        System.out.print("EQUIPO 1: ");
        System.out.println(equipo);

        Equipo equipo2 = new Equipo("Estudiantes", "Negro");
        equipo2.add(new Jugador("12345678A", "Juan Pérez", LocalDate.of(1990, 3, 13), 10, Posicion.ALERO));
        equipo2.add(new Jugador("56789012C", "Carlos López", LocalDate.of(2000, 1, 5), 11, Posicion.BASE));
        equipo2.add(new Jugador("23456789D", "Lucía Martínez", LocalDate.of(1995, 6, 30), 8, Posicion.ALERO));
        equipo2.add(new Jugador("87654321B", "Ana Gómez", LocalDate.of(1985, 7, 22), 9, Posicion.PIVOT));
        System.out.print("EQUIPO 2: ");
        System.out.println(equipo2);
        
        System.out.println("\n¿Los equipos son iguales? " + equipo.equals(equipo2));
    }
}
