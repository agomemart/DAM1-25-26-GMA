package ud4.practicaex.biblioteca2;

public class Libro extends Material implements Prestamo{
    private String autor;
    private boolean prestado;

    public Libro(String titulo, int anhoPublicacion, Genero genero, String autor) {
        super(titulo, anhoPublicacion, genero);
        if (autor != null && !autor.isEmpty()) {
            this.autor = autor;
        } else {
            throw new IllegalArgumentException("Autor no válido.");
        }
    }

    @Override
    public int calcularAntiguedad() {
        int anhoActual = java.time.Year.now().getValue();
        return anhoActual - getAnhoPublicacion();
    }

    @Override
    public void prestar() {
        if (prestado) {
            System.out.println("El libro ya está prestado.");
        } else {
            prestado = true;
        }
    }

    @Override
    public void devolver() {
        prestado = false;
    }

    @Override
    public boolean estaPrestado() {
        return prestado;
    }

    public int contarPalabrasTitulo() {
        String[] palabras = getTitulo().split(" ");
        return palabras.length;
    }
    
}
