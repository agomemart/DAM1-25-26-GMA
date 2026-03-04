package ud4.practicaex.empleado2;

public abstract class Empleado {
    protected String nombre;
    protected double salario;
    protected String categoria;

    public Empleado(String nombre, double salario, String categoria) {
        this.nombre = nombre;
        this.salario = salario;
        this.categoria = categoria;
    }
    abstract double calcularSalarioFinal();
    
    public void mostrarInfo() {
    System.out.println("Nombre: " + nombre);
    System.out.println("Salario: " + salario);
    System.out.println("Categoría: " + categoria);
}
}
