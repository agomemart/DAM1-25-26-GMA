package ud4.examentest;

import java.util.Arrays;

public class Examen {
    private String titulo;
    private Pregunta[] preguntas;

    public Examen(String titulo) {
        if (titulo != null || titulo.length() != 0) {
            this.titulo = titulo;
        }
    }

    public boolean addPregunta(Pregunta pregunta) {
        if (pregunta == null) {
            preguntas = new Pregunta[1];
        } else {
            for (Pregunta p : preguntas) {
                if (p == pregunta) {
                    return false;
                }
            }
            preguntas = Arrays.copyOf(preguntas, preguntas.length + 1);
        }
        preguntas[preguntas.length - 1] = pregunta;
        return true;
    }

    public int numPreguntas() {
        return preguntas.length;
    }

    public int corregir(String[] respuestasUsusario) {
        int puntuacion = 0;
        for (int i = 0; i < preguntas.length; i++) {
            if (preguntas[i].corregir(respuestasUsusario[i].charAt(0) - 'a')) {
                puntuacion++;
            }
        }
        return puntuacion;
    }

    @Override
    public String toString() {
        String str = "Examen: " + titulo + "\n";
        str += "==================================\n";
        for (int i = 0; i < preguntas.length; i++) {
            str = str + (i + 1) + ". " + preguntas[i] + "\n";
        }
        return str;
    }

}
