package ud4.practicaex.registrohoras;

import java.util.Comparator;

public class ComparadorHorasTrabajadas implements Comparator<Empleado>{

    @Override
    public int compare(Empleado o1, Empleado o2) {
        return Double.compare(o2.calcularHorasTrabajadas(), o1.calcularHorasTrabajadas());
    }
    
}
