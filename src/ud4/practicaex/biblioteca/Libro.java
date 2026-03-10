package ud4.practicaex.biblioteca;

public class Libro extends Material implements Prestamo {
    private String autor;
    private boolean prestado;

    public Libro(String titulo, int anhoPublicacion, Genero genero, String autor) {
        super(titulo, anhoPublicacion, genero);
        if (autor != null && !autor.isEmpty()) {
            this.autor = autor;
        } else {
            throw new IllegalArgumentException("Autor no válido");
        }

    }

    @Override
    public void prestar() {
        if (prestado) {
            System.out.println("El libro ya está prestado");
        } else {
            prestado = true;
        }
    }

    @Override
    public void devolver() {
        prestado = false;
    }

}
