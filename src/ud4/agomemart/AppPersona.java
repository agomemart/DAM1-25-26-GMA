package ud4.agomemart;
import java.time.LocalDate;
import java.util.Arrays;

public class AppPersona {
    public static void main(String[] args) {
        Persona persona = new Persona("12345678A", "Juan Pérez", LocalDate.of(1990, 3, 13));
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("DNI: " + persona.getDni());
        System.out.println("Fecha de Nacimiento: " + persona.getFechaNacimiento());
        System.out.println("Edad: " + persona.getEdad() + " años");

        Persona[] personas = {
            new Persona("12345678A", "Juan Pérez", LocalDate.of(1990, 3, 13)),
            new Persona("87654321B", "Ana Gómez", LocalDate.of(1985, 7, 22)),
            new Persona("56789012C", "Carlos López", LocalDate.of(2000, 1, 5))
        };
        System.out.println("\nListado de personas ordenadas por nombre:");
        Arrays.sort(personas);
        for (Persona p : personas) {
            System.out.println("- " + p);
        }
    }    
}
