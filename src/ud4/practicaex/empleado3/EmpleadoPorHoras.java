package ud4.practicaex.empleado3;

public class EmpleadoPorHoras extends Empleado{
    private double horasTrabajadas;
    private double precioHora;

    public EmpleadoPorHoras(String nombre, int id, double horasTrabajadas, double precioHora) {
        super(nombre, id);
        if (horasTrabajadas > 0 && precioHora > 0) {
            this.horasTrabajadas = horasTrabajadas;
            this.precioHora = precioHora;
        } else {
            throw new IllegalArgumentException("Horas o precio fuera de rango");
        }
        
    }

    @Override
    public double calcularSalario() {
        return horasTrabajadas * precioHora;
    }
}
