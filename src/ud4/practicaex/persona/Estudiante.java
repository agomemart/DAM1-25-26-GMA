package ud4.practicaex.persona;

public class Estudiante extends Persona implements Evaluable{
    protected double notaExamen;
    protected double notaTrabajo;

    public Estudiante(double notaExamen, double notaTrabajo) {
        this.notaExamen = notaExamen;
        this.notaTrabajo = notaTrabajo;
    }
    @Override
    public double calcularNotaFinal() {
        return 0.7 * notaExamen + 0.3 * notaTrabajo;
    }
    @Override
    public String obtenerRol() {
        return getClass().getSimpleName();
    }

}
