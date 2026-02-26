package ud4.rol;

import java.util.Random;

public abstract class Monstruo {
    protected String nombre;
    protected int ataque;
    protected int defensa;
    protected int velocidad;
    protected int puntosVida;

    public String mostrar() {
        return "";
    }

    @Override
    public String toString() {
        String str = "";
        str += getClass().getSimpleName() + "\n";
        str += nombre + "\n, ataque=" + ataque + "\n, defensa=" + defensa + "\n, velocidad=" + velocidad
                + "\n, puntosVida=" + puntosVida;
        return str;
    }

    public boolean estaVivo() {
        return puntosVida > 0;
    }

    public boolean perderVida(int puntos) {
        puntosVida -= puntos;
        return !estaVivo();
    }

    public abstract int atacar(Personaje p);

    public static Monstruo generarMonstruoAleatorio() {
        return null;
    }

    public static int rnd(int inicio, int fin) {
        Random rnd = new Random();
        return rnd.nextInt(inicio, fin - 1);
    }

}
