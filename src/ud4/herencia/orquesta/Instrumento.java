package ud4.herencia.orquesta;

import java.util.Arrays;

enum Nota{
    DO, RE, MI, FA, SOL, LA, SI
}

public abstract class Instrumento {
    protected Nota[] melodia;
    protected int numNotas;

    

    public Instrumento() {
        melodia = new Nota[numNotas];
    }

    public void add(Nota nota) {
        melodia = Arrays.copyOf(melodia, melodia.length + 1);
        melodia[melodia.length - 1] = nota;
    }

    public abstract void interpretar();
}
