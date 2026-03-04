package ud4.practicaex.empleado2;

public class EmpleadoSenior extends Empleado{
    private double bonusFijo;

    public EmpleadoSenior(String nombre, double salario, String categoria, double bonusFijo) {
        super(nombre, salario, categoria);
        this.bonusFijo = bonusFijo;
    }

    @Override
    double calcularSalarioFinal() {
        return salario + bonusFijo;
    }
    
}
