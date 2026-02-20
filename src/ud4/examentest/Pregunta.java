package ud4.examentest;

import java.util.Arrays;

import ud3.arrays.Util;

public class Pregunta {
    String enunciado;
    String[] respuestas;
    int indiceCorrecta;

    public Pregunta(String enunciado, String[] respuestas, int indiceCorrecta) {
        if (respuestas.length > 2 && indiceCorrecta <= respuestas.length) {
            this.enunciado = enunciado;
            this.respuestas = respuestas;
            this.indiceCorrecta = indiceCorrecta;
        } else {
            throw new IllegalArgumentException(
                    "El número de respuestas o el índice de la respuesta correcta no es válido");
        }
    }

    public boolean corregir(int opcion) {
        return opcion == indiceCorrecta;
    }

    @Override
    public String toString() {
        char letraRespuesta = 'a';
        String str = "";

        str += enunciado + "\n";
        for (int i = 0; i < respuestas.length; i++) {
            str += letraRespuesta + ") " + respuestas[i] + "\n";
            letraRespuesta++;
        }
        return str;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Pregunta other = (Pregunta) obj;
        if (enunciado == null) {
            if (other.enunciado != null)
                return false;
        } else if (!enunciado.equals(other.enunciado))
            return false;
        if (!Arrays.equals(respuestas, other.respuestas))
            return false;
        return true;
    }

    public static Pregunta[] cargarFichero(String fichero) {
        String[] preguntasCSV = ud3.Util.readFileToStringArray(fichero);

        Pregunta[] preguntas = new Pregunta[preguntasCSV.length];

        for (int i = 0; i < preguntasCSV.length; i++) {
            String[] atributos = preguntasCSV[i].split("\t");
            String[] respuestas = new String[atributos.length - 2];
            System.arraycopy(atributos, 1, respuestas, 0, atributos.length - 2);
            preguntas[i] = new Pregunta(
                    atributos[0],
                    respuestas,
                    Integer.valueOf(atributos[atributos.length - 1]));
        }

        return preguntas;
    }

}
