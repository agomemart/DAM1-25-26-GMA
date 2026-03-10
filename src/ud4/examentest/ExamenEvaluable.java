package ud4.examentest;

public class ExamenEvaluable extends Examen{

    public ExamenEvaluable(String titulo) {
        super(titulo);
    }

    public void responderConsola(Pregunta pregunta, int indiceRespuesta) {
        pregunta.toString();
        if (indiceRespuesta >= 0 && indiceRespuesta <= 3) {
            pregunta.corregir(indiceRespuesta);
        }

    }

    public int corregir(String[] respuestas) {
        int respuestasCorrectas = 0;
        for (int i = 0; i < preguntas.length; i++) {
            if (preguntas[i].corregir(respuestas[i].charAt(0) - 'a')) {
                respuestasCorrectas++;
            }
        }
        return respuestasCorrectas;
    }


    public double puntuacionSobre10(int numResCorrectas) {
        return (double)numResCorrectas / numPreguntas();
    }
}
