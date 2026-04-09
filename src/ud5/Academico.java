package ud5;

import java.util.Map;

public class Academico implements Comparable<Academico>{
    String nombre;
    int anhoIngreso;
    
    public Academico(String nombre, int anhoIngreso) {
        this.nombre = nombre;
        this.anhoIngreso = anhoIngreso;
    }

    static boolean nuevoAcademico (Map<Character, Academico> academia, Academico nuevo, Character letra) {
        academia.put(letra, nuevo);
        return true;
    }


    @Override
    public int compareTo(Academico o) {
        return this.nombre.compareToIgnoreCase(o.nombre);
    }

    @Override
    public String toString() {
        return nombre + " (" + anhoIngreso + ")";
    }

    



    
}
