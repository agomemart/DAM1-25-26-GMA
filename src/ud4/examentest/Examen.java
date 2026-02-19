package ud4.examentest;

import java.util.Arrays;

public class Examen {
    String titulo;
    Pregunta[] preguntas;
   
    public Examen(String titulo) {
        if (titulo != null || titulo.length() != 0) {
            this.titulo = titulo;
        }
    }

    public void addPregunta(){
        
    }

    public int numPreguntas() {
        return preguntas.length;
    }

    @Override
    public String toString() {
        return titulo + "\n" + preguntas.toString();
    }

    
}
