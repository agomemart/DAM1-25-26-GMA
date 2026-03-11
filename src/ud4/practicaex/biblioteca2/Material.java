package ud4.practicaex.biblioteca2;

public abstract class Material implements Comparable<Material>{
    private String titulo;
    private int anhoPublicacion;
    private Genero genero;
    
    public Material(String titulo, int anhoPublicacion, Genero genero) {
        if (titulo != null && !titulo.isEmpty() && anhoPublicacion > 0) {
            this.titulo = titulo;
            this.anhoPublicacion = anhoPublicacion;
            this.genero = genero;
        } else {
            throw new IllegalArgumentException("Datos inválidos");
        }
        
    }

    public String mostrarInfo() {
        return titulo + "\n" + anhoPublicacion + "\n" + genero.name() + "\n";
    }

    public abstract int calcularAntiguedad();

    public int compareTo(Material m) {
        if (this.anhoPublicacion - m.anhoPublicacion == 0) {
            return this.titulo.compareTo(m.titulo);
        }

        return this.anhoPublicacion - m.anhoPublicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public Genero getGenero() {
        return genero;
    }

    public int getAnhoPublicacion() {
        return anhoPublicacion;
    }

    
}
