package ud4.herencia;

enum Unidad {
    CM, M
}

public class Caja {
    protected int ancho;
    protected int alto;
    protected int fondo;
    protected Unidad unidad;
    protected String etiqueta;

    public Caja(int ancho, int alto, int fondo, Unidad unidad) {
        this.ancho = ancho;
        this.alto = alto;
        this.fondo = fondo;
        this.unidad = unidad;
    }

    public double getVolumen(){
        if (this.unidad == Unidad.CM) {
            ancho = ancho / 100;
            alto = alto / 100;
            fondo = fondo / 100;
        }
        return ancho * alto * fondo;
    }

    public void setEtiqueta(String etiqueta){
        if (etiqueta.length() <= 30) {
            this.etiqueta = etiqueta;
        }
    }

    @Override
    public String toString() {
        return "(" + ancho + " x " + alto + " x " + fondo + ") " + unidad + " " + etiqueta;
    }

    

}
