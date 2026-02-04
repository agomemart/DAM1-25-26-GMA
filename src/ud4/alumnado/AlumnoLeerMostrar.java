package ud4.alumnado;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class AlumnoLeerMostrar {
    public static void main(String[] args) {
        // Instancias Alumno
        Alumno alumno = null;

        alumno = leerDatosAlumno();
            
        mostrarAlumno(alumno);
    }

    public static void mostrarAlumno(Alumno alumno) {
        System.out.println("Ficha de Alumno/a");
        System.out.println("=================");
        System.out.println("Nombre: " + alumno.nombre);
        System.out.println("Apellido1: " + alumno.apellido1);
        System.out.println("Apellido2: " + alumno.apellido2);
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Fecha de Nacimiento: " + alumno.fechaNacimiento.format(formato));
        System.out.println("Nota Programación: " + alumno.notaProgramacion );
        System.out.println("Nota Contornos: " + alumno.notaContornos);
        System.out.println("Nota media: " + ((alumno.notaProgramacion + alumno.notaContornos) / 2));
    }

    public static Alumno leerDatosAlumno() {
        Alumno alumno = new Alumno();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nombre: ");
        alumno.nombre = sc.nextLine();
        System.out.print("Apellido1: ");
        alumno.apellido1 = sc.nextLine();
        System.out.print("Apellido2: ");
        alumno.apellido2 = sc.nextLine();
        System.out.print("Fecha de Nacimiento (dd/mm/aaaa): ");
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        alumno.fechaNacimiento = LocalDate.parse(sc.nextLine(), formato);
        System.out.print("Nota Programación: ");
        alumno.notaProgramacion = sc.nextDouble();
        System.out.print("Nota Contornos: ");
        alumno.notaContornos = sc.nextDouble();     
        return alumno;   
    }

}
