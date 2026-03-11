package ud4.practicaex.biblioteca2;

public class Revista extends Material {
    private int numeroEdicion;

    public Revista(String titulo, int anhoPublicacion, Genero genero, int numeroEdicion) {
        super(titulo, anhoPublicacion, genero);
        if (numeroEdicion > 0) {
            this.numeroEdicion = numeroEdicion;
        } else {
            throw new IllegalArgumentException("Número de edición no válido.");
        }
    }

    @Override
    public int calcularAntiguedad() {
        int anhoActual = java.time.Year.now().getValue();
        return anhoActual - getAnhoPublicacion();
    }

    public boolean tituloContiene(String palabra) {
        if (palabra == null || palabra.isEmpty()) {
            return false;
        }

        String[] palabras = getTitulo().split(" ");
        for (String string : palabras) {
            if (string.equals(palabra)) {
                return true;
            }
        }
        return false;
    }

}
