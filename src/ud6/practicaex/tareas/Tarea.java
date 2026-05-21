package ud6.practicaex.tareas;

public class Tarea {
    String titulo;
    String descripcion;
    boolean prioritaria;
    
    public Tarea(String titulo, String descripcion, boolean prioritaria) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.prioritaria = prioritaria;
    }

    @Override
    public String toString() {
        String salida = titulo;
        if (prioritaria) {
            salida += " (PRIORITARIA)";
        }
        return salida;
    }

    
}
