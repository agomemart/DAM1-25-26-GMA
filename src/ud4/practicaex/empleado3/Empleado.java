package ud4.practicaex.empleado3;

public abstract class Empleado {
    private String nombre;
    private int id;
    private double salarioBase;

    public Empleado(String nombre, int id, double salarioBase) {
        if (nombre != null && !nombre.isEmpty() && salarioBase > 0) {
            this.nombre = nombre;
            this.id = id;
            this.salarioBase = salarioBase;
        } else {
            throw new IllegalArgumentException("Datos inválidos");
        }
    }

    

    public Empleado(String nombre, int id) {
        if (nombre != null && !nombre.isEmpty()) {
            this.nombre = nombre;
            this.id = id;
        } else {
            throw new IllegalArgumentException("Datos inválidos");
        }
        
    }



    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void mostrarInfo() {
        System.out.println("Empleado: " + getNombre());
        System.out.println("ID: " + getId());
        System.out.println("Salario base: " + salarioBase);
    }

    public abstract double calcularSalario(); 

}
