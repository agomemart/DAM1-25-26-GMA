package ud5.practicaEx;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class AlumnosInterfaces {
    static List<Alumno> filtrar(List<Alumno> lista, Predicate<Alumno> criterio) {
        if (lista == null || lista.isEmpty() || criterio == null) {
            return new ArrayList<>();
        }
        List<Alumno> cumpleCriterio = new ArrayList<>();
        for (Alumno a : lista) {
            if (criterio.test(a)) {
                cumpleCriterio.add(a);
            }
        }

        return cumpleCriterio;
    }

    static <R> List<R> transformar(List<Alumno> lista, Function<Alumno, R> f) {
        if (lista == null || lista.isEmpty() || f == null) {
            return new ArrayList<>();
        }

        List<R> listaTransformada = new ArrayList<>();
        for (Alumno a : lista) {
            listaTransformada.add(f.apply(a));
        }

        return listaTransformada;
    }

    static void procesar(List<Alumno> lista, Consumer<Alumno> accion) {
        if (lista == null || accion == null)
            return;

        for (Alumno a : lista) {
            accion.accept(a);
        }
    }

    Comparator<Alumno> porNotaAsc = (a1, a2) -> Double.compare(a1.getNota(), a2.getNota());
    Comparator<Alumno> porNombreAsc = (a1, a2) -> a1.getNombre().compareTo(a2.getNombre());
    Comparator<Alumno> porEdadDesc = (a1, a2) -> Integer.compare(a2.getEdad(), a1.getEdad());
    Comparator<Alumno> porNotaNombre = (a1, a2) -> {
        if (Double.compare(a2.getNota(), a1.getNota()) == 0) {
            return a1.getNombre().compareTo(a2.getNombre());
        }
        return Double.compare(a2.getNota(), a1.getNota());
    };

    static void ordenar(List<Alumno> lista, Comparator<Alumno> comp) {
        Collections.sort(lista, comp);
    }
}

class Alumno {
    String nombre;
    double nota;
    int edad;

    public Alumno(String nombre, double nota, int edad) {
        this.nombre = nombre;
        this.nota = nota;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public double getNota() {
        return nota;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public String toString() {
        return nombre + " - " + nota + " - " + edad;
    }
}