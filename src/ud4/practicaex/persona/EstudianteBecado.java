package ud4.practicaex.persona;

public class EstudianteBecado extends Estudiante{

    public EstudianteBecado(double notaExamen, double notaTrabajo) {
        super(notaExamen, notaTrabajo);
    }

    @Override
    public double calcularNotaFinal() {
        double notaFinal = super.calcularNotaFinal();
        if (notaFinal > 8) {
            notaFinal += 0.5;
        }

        if (notaFinal > 10) {
            notaFinal = 10;
        }

        return notaFinal;
       
    }

    
    
}
