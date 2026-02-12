package ud4.rol;

import java.util.Random;

public class Personaje {
    private String nombre;
    private Raza raza;
    private int fuerza;
    private int agilidad;
    private int constitucion;
    private int nivel;
    private int experiencia;
    private int puntosVida;

    private static final int VIDA_MINIMA = 50;

    public Personaje(String nombre, Raza raza, int fuerza, int agilidad, int constitucion, int nivel, int experiencia,
            int puntosVida) {
        if (fuerza <= 0 || agilidad <= 0 || constitucion <= 0 || nivel <= 0 ||
                puntosVida <= 0 || experiencia < 0 || raza == null) {
            throw new IllegalArgumentException("No se puede crear el personaje. Parámetros incorrectos");
        }

        this.nombre = nombre;
        this.raza = raza;

        this.fuerza = fuerza;
        this.agilidad = agilidad;
        this.constitucion = constitucion;
        this.nivel = nivel;
        this.puntosVida = puntosVida;

        this.experiencia = experiencia;
    }

    public Personaje(String nombre, Raza raza, int fuerza, int agilidad, int constitucion) {
        this(nombre, raza, fuerza, agilidad, constitucion, 1, 0, constitucion + VIDA_MINIMA);
    }

    public Personaje(String nombre, Raza raza) {
        Random rnd = new Random();
        this(nombre, raza, rnd.nextInt(100) + 1, rnd.nextInt(100) + 1, rnd.nextInt(100) + 1);
    }

    public Personaje(String nombre) {
        this(nombre, Raza.HUMANO);
    }

    public String mostrar() {
        return nombre + " (" + raza + ")\n - Fuerza: " + fuerza + "\n - Agilidad: " + agilidad + "\n - Constitución: "
                + constitucion + "\n - Nivel: " + nivel + "\n - Puntos de vida: " + puntosVida;
    }

    public String toString() {
        return nombre + " (" + puntosVida + "/" + getPvIniciales() + ")";
    }

    private int getPvIniciales() {
        return constitucion + VIDA_MINIMA;
    }

    public int sumarExperiencia(int puntos) {
        int expAnterior = experiencia / 1000;
        experiencia += puntos;
        return experiencia / 1000 - expAnterior;
    }

    public void subirNivel() {
        nivel++;
        fuerza = (int) (fuerza * 1.05);
        agilidad = (int) (agilidad * 1.05);
        constitucion = (int) (constitucion * 1.05);
    }

    public void curar() {
        if (puntosVida < getPvIniciales()) {
            puntosVida = getPvIniciales();
        }
    }

    public boolean perderVida(int puntos) {
        puntosVida -= puntos;
        return !estaVivo();
    }

    public boolean estaVivo() {
        return puntosVida > 0;
    }

    public int atacar(Personaje enemigo) {
        Random rnd = new Random();

        int ataque = fuerza + rnd.nextInt(100) + 1;
        int defensa = enemigo.agilidad + rnd.nextInt(100) + 1;
        int danho = Math.min(ataque - defensa, enemigo.puntosVida);

        if (danho > 0) {
            enemigo.perderVida(danho);
            enemigo.sumarExperiencia(danho);
            sumarExperiencia(danho);
            return danho;
        }
        return 0;
    }

    public int getAgilidad() {
        return agilidad;
    }

    public String getNombre() {
        return nombre;
    }
    
}
