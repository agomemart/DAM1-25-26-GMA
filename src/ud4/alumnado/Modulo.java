package ud4.alumnado;

public class Modulo {
    byte curso;
    String codigo;
    String nombre;
    short horas;
    byte periodosSemanais;

    public Modulo(int curso, String codigo, String nombre, int horas, int periodosSemanais) {
        this.curso = (byte) curso;
        this.codigo = codigo;
        this.nombre = nombre;
        this.horas = (short) horas;
        this.periodosSemanais = (byte) periodosSemanais;
    }

    /*public static Modulo[] cargarFichero(String fichero) {
        String[] moduloCSV = Util.readFIleToStringArray(fichero);

        Modulo[] modulos = new Modulo[moduloCSV.length];

        for (int i = 0; i < moduloCSV.length; i++) {
            String[] atributos = moduloCSV[i].split(",");
            modulos[i] = new Modulo(
                    Byte.valueOf(atributos[0]),
                    atributos[1],
                    atributos[2],
                    Short.valueOf(atributos[3]),
                    Byte.valueOf(atributos[4]));
        }

        return modulos;
    }*/

    public double getSesiones() {
        return horas * 60.0 / 50;
    }

    public double getPorcentajeFaltas(int porcentaje) {
        return getSesiones() * porcentaje / 100;
    }
}
