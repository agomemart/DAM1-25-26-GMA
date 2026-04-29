package ud5.practicaEx.concursopociones;

import java.util.List;

public class Pocion implements Comparable<Pocion>{
    private String nombre;
    private List<String> ingredientes;
    private int potencia;
    
    public Pocion(String nombre, List<String> ingredientes, int potencia) {
        this.nombre = nombre;
        this.ingredientes = ingredientes;
        this.potencia = potencia;
    }

    @Override
    public String toString() {
        return nombre + " (" + potencia + ")";
    }

    @Override
    public int compareTo(Pocion o) {
        return this.nombre.compareTo(o.nombre);
    }

    public int getPotencia() {
        return potencia;
    }

    public String getNombre() {
        return nombre;
    }

    public List<String> getIngredientes() {
        return ingredientes;
    }

    
}
