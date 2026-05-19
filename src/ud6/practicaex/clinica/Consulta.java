package ud6.practicaex.clinica;

import java.io.Serializable;
import java.time.LocalDate;

public class Consulta implements Serializable{
    String paciente;
    LocalDate fecha;
    String especialidad;
    int duracion;
    
    public Consulta(String paciente, LocalDate fecha, String especialidad, int duracion) {
        this.paciente = paciente;
        this.fecha = fecha;
        this.especialidad = especialidad;
        this.duracion = duracion;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((paciente == null) ? 0 : paciente.hashCode());
        result = prime * result + ((fecha == null) ? 0 : fecha.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Consulta other = (Consulta) obj;
        if (paciente == null) {
            if (other.paciente != null)
                return false;
        } else if (!paciente.equals(other.paciente))
            return false;
        if (fecha == null) {
            if (other.fecha != null)
                return false;
        } else if (!fecha.equals(other.fecha))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return paciente + " - " + fecha + " - " + especialidad;
    }

    
}
