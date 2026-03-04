package ud4.practicaex.empleado;

public class EmpleadoPorHoras extends Empleado implements Trabajable{
    private double horasTrabajadas;
    private double precioHora;

    public EmpleadoPorHoras(String nombre, double salarioBase, double horasTrabajadas, double precioHora) {
        super(nombre, salarioBase);
        if (horasTrabajadas > 0 && precioHora > 0) {
            this.horasTrabajadas = horasTrabajadas;
            this.precioHora = precioHora;
        } else {
            throw new IllegalArgumentException("Datos incorrectos");
        }
        
    }

    @Override
    public double calcularSalario() {
        return horasTrabajadas * precioHora;
    }

    @Override
    public String descripcion() {
        return "Empleado por horas";
    }

    @Override
    public void trabajar() {
        System.out.println("Trabajando por horas");
    }
}
