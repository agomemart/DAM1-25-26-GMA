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

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Persona other = (Persona) obj;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;
        if (edad != other.edad)
            return false;
        return true;
    }

    

    
}
