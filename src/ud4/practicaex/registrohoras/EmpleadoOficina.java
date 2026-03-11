package ud4.practicaex.registrohoras;

import java.time.Duration;
import java.time.LocalTime;

public class EmpleadoOficina extends Empleado implements Registrable{

    public EmpleadoOficina(String nombre) {
        super(nombre);
    }

    @Override
    public double calcularHorasTrabajadas() {
        return Duration.between(horaEntrada, horaSalida).toHours();
    }

    @Override
    public void ficharEntrada() {
        horaEntrada = LocalTime.now();
    }

    @Override
    public void ficharSalida() {
        horaSalida = LocalTime.now();
    }

    @Override
    public boolean estaTrabajando() {
        return horaEntrada != null && horaSalida == null;
    }
    
}
