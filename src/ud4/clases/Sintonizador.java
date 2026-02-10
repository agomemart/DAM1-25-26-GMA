package ud4.clases;

public class Sintonizador {
    private double frecuencia;

    public Sintonizador(double frecuencia) {
        if (frecuencia >= 80 && frecuencia <= 108) {
            this.frecuencia = frecuencia;
        } else {
            this.frecuencia = 80;
            //throw new IllegalArgumentException("Frecuencia introducida no válida.");
        }

        
    }

    public void subirFrecuencia() {
        frecuencia += 0.5;
        if (frecuencia > 108) {
            frecuencia = 80;
        }
        mostrar();
    }

    public void bajarFrecuencia() {
        frecuencia -= 0.5;
        if (frecuencia < 80) {
            frecuencia = 108;
        }
        mostrar();
    }

    public void mostrar() {
        System.out.println("Frecuencia actual: " + frecuencia + "MHz");
    }

}
