package ud4.practicaex.persona;

public class MainPersona {
    public static void main(String[] args) {
        Evaluable[] personas = new Evaluable[3];

        Estudiante e1 = new Estudiante(5.4, 10);
        EstudianteBecado eb1 = new EstudianteBecado(8.5, 10);
        Estudiante e2 = new Estudiante(4.4, 6);

        personas[0] = e1;
        personas[1] = eb1;
        personas[2] = e2;

        for (int i = 0; i < personas.length; i++) {
            System.out.println(personas[i].calcularNotaFinal());
        }
    }
}
