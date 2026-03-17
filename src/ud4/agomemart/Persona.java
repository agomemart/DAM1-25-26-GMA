package ud4.agomemart;

/**
 * @author Adrián Gómez Martínez
 */
import java.time.LocalDate;

public class Persona implements Comparable<Persona> {
    protected String dni;
    protected String nombre;
    protected LocalDate fechaNacimiento;

    public Persona(String dni, String nombre, LocalDate fechaNacimiento) {
        if (dni != null && !dni.isEmpty() && nombre != null && !nombre.isEmpty()) {
            this.dni = dni;
            this.nombre = nombre;
            this.fechaNacimiento = fechaNacimiento;
        } else {
            throw new IllegalArgumentException("Nombre o DNI no válidos.");
        }

    }

    @Override
    public String toString() {
        return nombre;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Persona other = (Persona) obj;
        if (dni == null) {
            if (other.dni != null)
                return false;
        } else if (!dni.equals(other.dni))
            return false;
        return true;
    }

    public int getEdad() {
        return LocalDate.now().getYear() - fechaNacimiento.getYear();
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    @Override
    public int compareTo(Persona p) {
        return this.nombre.compareTo(p.nombre);
    }

}
