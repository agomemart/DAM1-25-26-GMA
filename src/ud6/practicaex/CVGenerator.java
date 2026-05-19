package ud6.practicaex;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CVGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nombre completo: ");
        String nombre = sc.nextLine();
        System.out.print("Profesión: ");
        String profesion = sc.nextLine();
        System.out.print("Descripción personal: ");
        String descPresonal = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Página web: ");
        String pagWeb = sc.nextLine();
        System.out.print("URL página:: ");
        String urlPag = sc.nextLine();
        System.out.print("Nombre fichero: ");
        String nombreFichero = sc.nextLine();
        sc.close();

        String contenido = "<html>\n" +
                "<head>\n" +
                "<meta charset=\"utf-8\">\n" +
                "<title>" + nombre + "</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "<h1>" + nombre + "</h1>\n" +
                "<h2>" + profesion + "</h2>\n" +
                "<p>" + descPresonal + "</p>\n" +
                "<p>Email: " + email + "</p>\n" +
                "<a href=\"" + urlPag + "\">" + pagWeb + "</a>\n" +
                "</body>\n" +
                "</html>";

        try {
            BufferedWriter out = new BufferedWriter(new FileWriter(nombreFichero));
            out.write(contenido);
            out.close();
        } catch (IOException e) {
            System.out.println("Error de I/O");
        }
        
    }
}
