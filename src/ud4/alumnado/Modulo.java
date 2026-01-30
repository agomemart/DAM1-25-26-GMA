package ud4.alumnado;

public class Modulo {
    String nombre;
    int horas;
    Alumno[] alumnadoMatriculado;

    public void mostrar() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Horas: " + horas);
        System.out.println("Alumnado matriculado: ");
        for (Alumno alumno : alumnadoMatriculado) {
            alumno.mostrar();
        }
    }
}
