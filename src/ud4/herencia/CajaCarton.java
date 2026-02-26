package ud4.herencia;

public class CajaCarton extends Caja {
    static double superficieTotalCarton = 0;

    public CajaCarton(int ancho, int alto, int fondo) {
        super(ancho, alto, fondo, Unidad.CM);
        superficieTotalCarton += superficie();

    }

    @Override
    public double getVolumen() {
        return super.getVolumen() * 0.8;
    }

    public double superficie() {
        return 2 * (ancho * alto + ancho * fondo + alto * fondo);
    }

}
