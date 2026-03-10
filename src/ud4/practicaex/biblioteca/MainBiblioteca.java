package ud4.practicaex.biblioteca;

import java.util.Arrays;

public class MainBiblioteca {
    public static void main(String[] args) {
        Material[] materiales = new Material[5];

        Libro l1 = new Libro("Lazarillo de tormes", 1857, Genero.HISTORIA, "Anónimo");
        Revista r1 = new Revista("Hola", 2025, Genero.HISTORIA, 2254);
        Libro l2 = new Libro("It", 1998, Genero.NOVELA, "Stephen King");
        Revista r2 = new Revista("Lecturas", 2026, Genero.CIENCIA, 3562);
        Libro l3 = new Libro("Don quijote de la mancha", 1815, Genero.NOVELA, "Cervantes");

        materiales[0] = l1;
        materiales[1] = r1;
        materiales[2] = l2;
        materiales[3] = r2;
        materiales[4] = l3;

        System.out.println("Sin ordenar:");
        for (Material material : materiales) {
            material.mostrarInfo();
        }
        System.out.println();

        Arrays.sort(materiales);
        System.out.println("Orden natural:");
        for (Material material : materiales) {
            material.mostrarInfo();
        }
        System.out.println();

        Arrays.sort(materiales, new ComparadorTitulo());
        System.out.println("Ordenados por título:");
        for (Material material : materiales) {
            material.mostrarInfo();
        }
        System.out.println();

        Arrays.sort(materiales, new ComparadorGenero());
        System.out.println("Ordenados por género:");
        for (Material material : materiales) {
            material.mostrarInfo();
        }
        System.out.println();
    }
}
