package ud4.practicaex.empleado;

public abstract class Empleado implements Comparable<Empleado>{
    protected String nombre;
    protected double salarioBase;
    
    public Empleado(String nombre, double salarioBase) {
        if (nombre != null && !nombre.isEmpty() && salarioBase > 0) {
            this.nombre = nombre;
            this.salarioBase = salarioBase;
        } else {
            throw new IllegalArgumentException("Datos incorrectos");
        }
    }

    public void mostrarDatos(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario base: " + salarioBase);
    }

    public abstract double calcularSalario();

    public String descripcion(){
        return "Empleado genérico";
    }

    @Override
    public int compareTo(Empleado o) {
        return Double.compare(this.calcularSalario(), o.calcularSalario());
    }

    
}
