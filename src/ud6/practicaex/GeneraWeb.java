package ud6.practicaex;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class GeneraWeb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Titulo: ");
        String titulo = sc.nextLine();
        System.out.print("Descripción: ");
        String descripcion = sc.nextLine();
        System.out.print("Texto Enlace: ");
        String textoEnlace = sc.nextLine();
        System.out.print("URL Enlace: ");
        String urlEnlace = sc.nextLine();
        System.out.print("Nombre del archivo: ");
        String nombreArchivo = sc.nextLine();
        sc.close();

        String contenido = "<html>\n<head>\n<title>" + titulo + "</title>\n" + 
        "<meta charset=\"utf-8\">\n</head>\n<body>\n<h1>" + titulo + "</h1>\n" +
        "<p>" + descripcion + ". <br>\n<a href=\"" + urlEnlace + "\">" + textoEnlace + "</a>\n" + 
        "</p>\n</body>\n</html>";

        try (BufferedWriter out = new BufferedWriter(new FileWriter(nombreArchivo))) {
            out.write(contenido);
        } catch (IOException e) {
            System.out.println("Error de I/O");
        }
    }
}
