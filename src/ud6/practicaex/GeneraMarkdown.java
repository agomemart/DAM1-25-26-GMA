package ud6.practicaex;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class GeneraMarkdown {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Titulo del documento: ");
        String titulo = sc.nextLine();
        System.out.print("Autor: ");
        String autor = sc.nextLine();
        System.out.print("Texto principal: ");
        String textoPrincipal = sc.nextLine();
        System.out.print("Texto del enlace: ");
        String textoEnlace = sc.nextLine();
        System.out.print("URL del enlace: ");
        String urlEnlace = sc.nextLine();
        System.out.print("Nombre del fichero: ");
        String nombreFichero = sc.nextLine();
        sc.close();

        String contenido = "# " + titulo + "\n\nAutor: " + autor + "\n\n" + textoPrincipal +
                "\n\n[" + textoEnlace + "](" + urlEnlace + ")";

        try (BufferedWriter out = new BufferedWriter(new FileWriter(nombreFichero))) {
            out.write(contenido);
        } catch (IOException e) {
            System.out.println("Error de I/O");
        }
    }
}
