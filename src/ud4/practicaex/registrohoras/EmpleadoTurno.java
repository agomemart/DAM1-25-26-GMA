package ud4.practicaex.registrohoras;

public class EmpleadoTurno extends Empleado{
    public enum Turno {
        MANANA, TARDE, NOCHE
    }
    
    private Turno turno;

    public EmpleadoTurno(String nombre) {
        super(nombre);
    }

    @Override
    public double calcularHorasTrabajadas() {
        if (horaEntrada != null && horaSalida != null) {
            return 8;
        } else {
            return 0;
        }
    }
    
}
