package ud5.practicaEx;

enum Departamento {RRHH, VENTAS, IT, ADMIN}

public class Empleado {
    private String dni;
    private String nombre;
    private double salario;
    private Departamento departamento;
    
    public Empleado(String dni, String nombre, double salario, Departamento departamento) {
        this.dni = dni;
        this.nombre = nombre;
        this.salario = salario;
        this.departamento = departamento;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSalario() {
        return salario;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return nombre + " - " + salario;
    }

    

}
