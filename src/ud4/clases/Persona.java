package ud4.clases;

public class Persona {
    // Atributos
    protected String nombre;
    protected byte edad;
    protected double estatura;
    // final String dni = "1111111X";

    // Métodos
    public void mostrarDatos(){
        System.out.println(nombre);
        System.out.println(edad);
        System.out.println(estatura);
    }

    public void saludar() {
        System.out.println("Hola, me llamo " + nombre);
    }

    public void cumplirAños() {
        edad++;
    }

    protected void crecer(double incremento) {
        estatura += incremento;
    }

    public Persona(String nombre, int edad, double estatura) {
        this.nombre = nombre;
        this.edad = (byte) edad;
        this.estatura = estatura;
    }

    public Persona(String nombre) {
        this(nombre, 0, 0);
    }


    public Persona() {
        edad = 18;
        estatura = 1.7;
    }
}
