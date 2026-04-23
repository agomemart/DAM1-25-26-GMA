package ud5.practicaEx;

import java.util.HashMap;
import java.util.Map;

public class GestionBiblioteca {
    static void altaLibro(Map<String, Libro> biblioteca, String isbn, Libro libro) {
        if (!biblioteca.containsKey(isbn)) {
            biblioteca.put(isbn, libro);
        } else {
            System.out.println("El libro ya existe!!");
        }
    }

    static Libro eliminarLibro(Map<String, Libro> biblioteca, String isbn) {
        return biblioteca.remove(isbn);
    }

    static void mostrar(Map<String, Libro> biblioteca) {
        for (Map.Entry<String, Libro> entry : biblioteca.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getTitulo());
        }
    }

    static void mostrar(Map<String, Libro> biblioteca, Genero genero) {
        for (Map.Entry<String, Libro> entry : biblioteca.entrySet()) {
            if (entry.getValue().getGenero() == genero) {
                System.out.println(entry.getKey() + " - " + entry.getValue().getTitulo());
            }
        }
    }

    static boolean editarLibro(Map<String, Libro> biblioteca, String isbn, Libro libro) {
        if (!biblioteca.containsKey(isbn)) {
            return false;
        }

        Libro l = biblioteca.get(isbn);
        l.setTitulo(libro.getTitulo());
        l.setAutor(libro.getAutor());
        l.setGenero(libro.getGenero());
        l.setNumPaginas(libro.getNumPaginas());

        return true;
    }

    static void buscarPorAutor(Map<String, Libro> biblioteca, String autor) {
        for (Map.Entry<String, Libro> entry : biblioteca.entrySet()) {
            if (entry.getValue().getAutor().equalsIgnoreCase(autor)) {
                System.out.println(entry.getValue());
            }
        }
    }

    static Libro libroMasLargo(Map<String, Libro> biblioteca) {
        if (biblioteca == null || biblioteca.isEmpty()) {
            return null;
        }

        Libro max = null;
        for (Libro l : biblioteca.values()) {
            if (max == null || l.getNumPaginas() > max.getNumPaginas()) {
                max = l;
            }
        }

        return max;
    }

    static Map<Genero, Integer> contarPorGenero(Map<String, Libro> biblioteca) {
        Map<Genero, Integer> resultado = new HashMap<>();

        for (Libro l : biblioteca.values()) {
            Genero g = l.getGenero();
            if (resultado.containsKey(g)) {
                resultado.put(g, resultado.get(g) + 1);
            } else {
                resultado.put(g, 1);
            }
        }

        return resultado;
    }
}

enum Genero {
    NOVELA, CIENCIA, HISTORIA, FANTASIA, TECNOLOGIA
}

class Libro {
    private String titulo;
    private String autor;
    private Genero genero;
    private int numPaginas;

    public Libro(String titulo, String autor, Genero genero, int numPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.numPaginas = numPaginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public Genero getGenero() {
        return genero;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    @Override
    public String toString() {
        return "Título: " + titulo + " - Género: " + genero + " - NºPag: " + numPaginas;
    }

}
