package ud4.herencia;

import ud4.clases.Persona;

public class Empleado extends Persona {
    protected double salario;

    public Empleado(String nombre, int edad, double estatura, double salario) {
        super(nombre, edad, estatura);
        this.salario = salario;
    }

    public Empleado() {

    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println(salario);
    }

    public static void main(String[] args) {
        Empleado e = new Empleado("Sancho", 25, 1.8, 1725.49);

        System.out.println(e.nombre);
        System.out.println(e.salario);

        e.saludar();
    }
}
