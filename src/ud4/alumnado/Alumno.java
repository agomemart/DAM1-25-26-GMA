package ud4.alumnado;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Alumno {
    String nombre;
    String apellido1;
    String apellido2;
    LocalDate fechaNacimiento;
    double notaProgramacion;
    double notaContornos;

    public void mostrar() {
        System.out.println("Ficha de Alumno/a");
        System.out.println("=================");
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Apellido1: " + apellido1);
        System.out.println("Apellido2: " + apellido2);
        System.out.println("Nombre de usuari@: " + getUsername());
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Fecha de Nacimiento: " + fechaNacimiento.format(formato));
        System.out.println("Nota Programación: " + notaProgramacion);
        System.out.println("Nota Contornos: " + notaContornos);
        System.out.println("Nota media: " + ((notaProgramacion + notaContornos) / 2));
    }

    public String getUsername() {
        char primeraLetraNombre = Character.toLowerCase(nombre.charAt(0));
        String primerAp = apellido1.toLowerCase().substring(0, 4);
        String segundoAp = apellido2.toLowerCase().substring(0, 4);
        String nombreUsuario = primeraLetraNombre + primerAp + segundoAp;

        return nombreUsuario;
    }

}
