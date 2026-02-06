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
    private static String centroEducativo = "IES Chan do Monte";

    public static void setCentroEducativo(String nuevoCentro) {
        if (nuevoCentro != null && !nuevoCentro.isEmpty())
            centroEducativo = nuevoCentro;
    }

    public static String getCentroEducativo() {
        return centroEducativo;
    }

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
        // Genera el nombre de usuario
        String username = "";
        username += nombre.charAt(0);

        int i = 0;
        while (i < apellido1.length() && i < 4 && apellido1.charAt(i) != ' ') {
            username += apellido1.charAt(i);
            i++;
        }

        i = 0;
        while (i < apellido2.length() && i < 4 && apellido2.charAt(i) != ' ') {
            username += apellido2.charAt(i);
            i++;
        }

        username = username.toLowerCase();

        username = username.replace('á', 'a');
        username = username.replace('é', 'e');
        username = username.replace('í', 'i');
        username = username.replace('ó', 'o');
        username = username.replace('ú', 'u');
        username = username.replace('ü', 'u');
        username = username.replace('ñ', 'n');

        return username;
    }

    public String getIniciales() {
        String iniciales = "";
        iniciales += nombre.charAt(0) + apellido1.charAt(0) + apellido2.charAt(0);

        return iniciales.toUpperCase();
    }

    public String getNombreCompleto() {
        return nombre + " " + apellido1 + " " + apellido2;
    }

}
