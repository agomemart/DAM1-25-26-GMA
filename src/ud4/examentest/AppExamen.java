package ud4.examentest;

import java.util.Scanner;

public class AppExamen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Examen examenUD2 = new Examen("TEST UD2 - Programación");

        Pregunta[] preguntas = Pregunta.cargarFichero("DATOS - PreguntasTest.tsv");

        for (int i = 0; i < preguntas.length; i++) {
            examenUD2.addPregunta(preguntas[i]);
        }

        System.out.println(examenUD2);

        // Pedir respuestas al usuario
        System.out.print("Inserta las respuestas: ");
        String respuestas = sc.nextLine();
        sc.close();

        // Corregir y dar nota
        String[] respuestasArray = respuestas.split(" ");
        int puntuacion = examenUD2.corregir(respuestasArray);

        System.out.println("Puntuación: " + puntuacion);

        System.out.println("FIN");
    }
}