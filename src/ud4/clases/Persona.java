package ud4.clases;

public class Persona {
    // Atributos
    String nombre;
    byte edad;
    double estatura;
    // final String dni = "1111111X";

    // Métodos
    void saludar() {
        System.out.println("Hola, me llamo " + nombre);
    }

    void cumplirAños() {
        edad++;
    }

    void crecer(double incremento) {
        estatura += incremento;
    }


}
