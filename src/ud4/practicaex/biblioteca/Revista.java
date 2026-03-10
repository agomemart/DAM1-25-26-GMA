package ud4.practicaex.biblioteca;

public class Revista extends Material{
    private int numEdicion;

    public Revista(String titulo, int anhoPublicacion, Genero genero, int numEdicion) {
        super(titulo, anhoPublicacion, genero);
        if (numEdicion > 0) {
            this.numEdicion = numEdicion;
        } else {
            throw new IllegalArgumentException("Numero de edición incorrecto");
        }
    }
    
}
