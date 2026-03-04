package ud4.practicaex.empleado;

public class EmpleadoTiempoCompleto extends Empleado implements Trabajable{

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

    @Override
    public void trabajar() {
        System.out.println("Trbajando jornada completa");
    }
    
}
