package ud4.alumnado;

public class AlumnosLeerMostrarArray {
    public static void main(String[] args) {
        int NUM_ALUMNOS = 1;

        Alumno[] alumnos = new Alumno[NUM_ALUMNOS];

        for (int i = 0; i < alumnos.length; i++) {
            alumnos[i] = AlumnoLeerMostrar.leerDatosAlumno();            
        }

        System.out.println("\n\nLISTADO DE ALUMNOS");
        System.out.println("==================\n");
        for (Alumno alumno : alumnos) {
            AlumnoLeerMostrar.mostrarAlumno(alumno);
            System.out.println();
        }

    }
}
