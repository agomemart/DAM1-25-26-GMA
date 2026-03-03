package ud4.practicaex.claseabstracta;

public class EmpleadoTiempoCompleto extends Empleado{

    public EmpleadoTiempoCompleto(String nombre, double salarioBase) {
        super(nombre, salarioBase);
    }

    @Override
    public double calcularSalario() {
        return salarioBase;
    }

    @Override
    public String descripcion() {
        return "Empleado a tiempo completo";
    }
    
}
