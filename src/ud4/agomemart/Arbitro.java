package ud4.agomemart;

/**
 * @author Adrián Gómez Martínez
 */

public class Arbitro extends Persona {
    public Arbitro(String dni, String nombre) {
        super(dni, nombre, null);
    }

    public String getNumeroColegiado() {
        String numColegiado = "";
        String[] palabrasNombre = nombre.split(" ");
        numColegiado += palabrasNombre[0];

        numColegiado += dni.substring(dni.length() - 4, dni.length() - 1);
        return numColegiado;
    }

    @Override
    public String toString() {
        return getNumeroColegiado();
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

}
