package ud4.herencia;

public class Jefe extends Empleado{
    String cargo;
    double bonus;

    public Jefe(String nombre, double salario, String cargo) {
        this.nombre = nombre;
        this.salario = salario;
        this.cargo = cargo;
    }

    public Jefe() {

    }

    
    @Override
    public void mostrarDatos() {
        System.out.println("JEFE: " + nombre + "(" + cargo + ")");
    }

    public static void main(String[] args) {
        Jefe j = new Jefe();

        j.cargo = "Supervisor";
        j.nombre = "Pepe";
        j.salario = 2000;
    }
}
