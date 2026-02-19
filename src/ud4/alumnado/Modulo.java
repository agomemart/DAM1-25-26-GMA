package ud4.alumnado;

import java.util.Arrays;

public class Modulo {
    byte curso;
    String codigo;
    String nombre;
    short horas;
    byte periodosSemanais;
    Alumno[] alumnos;

    public Modulo(int curso, String codigo, String nombre, int horas, int periodosSemanais) {
        this.curso = (byte) curso;
        this.codigo = codigo;
        this.nombre = nombre;
        this.horas = (short) horas;
        this.periodosSemanais = (byte) periodosSemanais;
    }

    /*
     * public static Modulo[] cargarFichero(String fichero) {
     * String[] moduloCSV = Util.readFIleToStringArray(fichero);
     * 
     * Modulo[] modulos = new Modulo[moduloCSV.length];
     * 
     * for (int i = 0; i < moduloCSV.length; i++) {
     * String[] atributos = moduloCSV[i].split(",");
     * modulos[i] = new Modulo(
     * Byte.valueOf(atributos[0]),
     * atributos[1],
     * atributos[2],
     * Short.valueOf(atributos[3]),
     * Byte.valueOf(atributos[4]));
     * }
     * 
     * return modulos;
     * }
     */

    public String mostrar() {
        String str = "";
        str += nombre + "\n";
        str += "Alumnado matriculado: ";
        if (!hayAlumnado()) {
            str += "No hay alumnado matriculado";
        } else {
            str += Arrays.toString(alumnos);
        }
        return str;
    }

    @Override
    public String toString() {
        return nombre;
    }

    public boolean hayAlumnado() {
        return alumnos == null || alumnos.length == 0;
    }

    public boolean estaMatriculado(Alumno a) {
        if (alumnos == null) {
            return false;
        }

        for (Alumno alumno : alumnos) {
            if (alumno == a) {
                return true;
            }
        }
        return false;
    }

    public boolean matricula(Alumno a) {
        if (estaMatriculado(a)) {
            return false;
        }
        if (alumnos == null) {
            alumnos = new Alumno[1];
        } else {
            alumnos = Arrays.copyOf(alumnos, alumnos.length + 1);
        }
        alumnos[alumnos.length - 1] = a;

        if (a.modulos == null) {
            a.modulos = new Modulo[1];
        } else {
            a.modulos = Arrays.copyOf(a.modulos, a.modulos.length + 1);
        }
        a.modulos[a.modulos.length - 1] = this;

        return true;
    }

    public double getSesiones() {
        return horas * 60.0 / 50;
    }

    public double getPorcentajeFaltas(int porcentaje) {
        return getSesiones() * porcentaje / 100;
    }
}
