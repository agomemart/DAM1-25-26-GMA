package ud4.practicaex.empleado3;

public class EmpleadoFijo extends Empleado{
    protected double bonus;

    public EmpleadoFijo(String nombre, int id, double salarioBase, double bonus) {
        super(nombre, id, salarioBase);
        this.bonus = bonus;
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() + bonus;
    }
    
}
