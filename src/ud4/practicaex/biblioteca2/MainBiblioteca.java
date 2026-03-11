package ud4.practicaex.biblioteca2;

import java.util.Arrays;

public class MainBiblioteca {
    public static void main(String[] args) {
        Material[] materiales = new Material[6];

        Libro l1 = new Libro("Lazarillo de tormes", 1857, Genero.HISTORIA, "Anónimo");
        Libro l2 = new Libro("It", 1998, Genero.NOVELA, "Stephen King");
        Libro l3 = new Libro("Don quijote de la mancha", 1815, Genero.NOVELA, "Cervantes");
        Revista r1 = new Revista("Hola", 2025, Genero.HISTORIA, 2254);
        Revista r2 = new Revista("Lecturas", 2026, Genero.CIENCIA, 3562);
        Revista r3 = new Revista("Computer Hoy", 2020, Genero.TECNOLOGIA, 1524);
        
        materiales[0] = l1;
        materiales[1] = l2;
        materiales[2] = l3;
        materiales[3] = r1;
        materiales[4] = r2;
        materiales[5] = r3;

        

        Arrays.sort(materiales);
        Arrays.sort(materiales, new ComparadorTituloLongitud());
    }

    public static void mostrarPorGenero(Material[] materiales, Genero genero) {
            for (Material material : materiales) {
                if (material.getGenero().name().equals(genero.name())) {
                    System.out.println(material.mostrarInfo());
                }
            }
        }

        public static int contarLibrosPrestados(Libro[] libros) {
            int contadorPrestados = 0;

            for (Libro libro : libros) {
                if (libro.estaPrestado()) {
                    contadorPrestados++;
                }
            }

            return contadorPrestados;
        }

        public static void buscarPorTitulo(Material[] materiales, String palabra) {
            for (Material material : materiales) {
                String[] palabras = material.getTitulo().split(" ");
                for (String palabraB : palabras) {
                    if (palabraB.equals(palabra)) {
                        System.out.println(material.mostrarInfo());
                    }
                }
            }
        }
}
