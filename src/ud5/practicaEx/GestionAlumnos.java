package ud5.practicaEx;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class GestionAlumnos {
    static void altaAlumno(Map<String, Alumno> alumnos, String dni, Alumno a) {
        if (!alumnos.containsKey(dni)) {
            alumnos.put(dni, a);
        } else {
            System.out.println("El alumno ya existe!!");
        }
    }

    static boolean añadirNota(Map<String, Alumno> alumnos, String dni, double nota) {
        if (alumnos.isEmpty() || dni == null || dni.isEmpty()) {
            return false;
        }

        if (!alumnos.containsKey(dni)) {
            return false;
        }

        alumnos.get(dni).getNotas().add(nota);

        return true;
    }

    static void mostrar(Map<String, Alumno> alumnos) {
        for (Map.Entry<String, Alumno> entry : alumnos.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNombre() + " - " + entry.getValue().media());
        }
    }

    static void mostrar(Map<String, Alumno> alumnos, Curso curso) {
        System.out.println("Alumnos de " + curso + ":");
        for (Alumno a : alumnos.values()) {
            if (a.getCurso() == curso) {
                System.out.println(a);
            }
        }
    }

    static Alumno mejorAlumno(Map<String, Alumno> alumnos) {
        Alumno mejorMedia = null;
        for (Alumno a : alumnos.values()) {
            if (mejorMedia == null || a.media() > mejorMedia.media()) {
                mejorMedia = a;
            }
        }
        return mejorMedia;
    }

    static Map<Curso, Integer> contarPorCurso(Map<String, Alumno> alumnos) {
        Map<Curso, Integer> res = new HashMap<>();

        for (Alumno a : alumnos.values()) {
            Curso c = a.getCurso();
            if (res.containsKey(c)) {
                res.put(c, res.get(c) + 1);
            } else {
                res.put(c, 1);
            }
        }

        return res;
    }

    static List<Alumno> aprobados(Map<String, Alumno> alumnos) {
        List<Alumno> aprobados = new ArrayList<>();

        for (Alumno a : alumnos.values()) {
            if (a.media() >= 5) {
                aprobados.add(a);
            }
        }
        return aprobados;
    }

    static Set<String> obtenerDNIs(Map<String, Alumno> alumnos) {
        Set<String> dnisUnicos = new HashSet<>(alumnos.keySet());

        return dnisUnicos;
    }
}

enum Curso {
    DAM1, DAM2, DAW1, DAW2
}

class Alumno {
    private String dni;
    private String nombre;
    private Curso curso;
    private List<Double> notas;

    public Alumno(String dni, String nombre, Curso curso, List<Double> notas) {
        this.dni = dni;
        this.nombre = nombre;
        this.curso = curso;
        if (notas != null) {
            this.notas = notas;
        } else {
            this.notas = new ArrayList<>();
        }
        
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public Curso getCurso() {
        return curso;
    }

    public List<Double> getNotas() {
        return notas;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public void setNotas(List<Double> notas) {
        this.notas = notas;
    }

    public double media() {
        if (notas == null || notas.isEmpty()) {
            return 0;
        }

        double sumaNotas = 0;
        for (Double nota : notas) {
            sumaNotas += nota;
        }

        return sumaNotas / notas.size();
    }

    @Override
    public String toString() {
        return dni + " - " + nombre + " - " + curso;
    }

}
