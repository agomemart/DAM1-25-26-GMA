package ud4.rol;

import java.util.Random;

public class Personaje {
    private String nombre;
    private Raza raza;
    private int fuerza;
    private int agilidad;
    private int constitucion;
    private byte nivel;
    private int experiencia;
    private int pv;

    private static int VIDA_MINIMA = 50;


    /*
    * CONSTRUCTORES
    */
    public Personaje(String nombre, Raza raza, int fuerza, int agilidad, int constitucion, int nivel, int experiencia,
            int pv) {
        if (fuerza <= 0 || agilidad <= 0 || constitucion <= 0 || nivel <= 0 || pv <= 0 || experiencia < 0
                || raza == null)
            throw new IllegalArgumentException("No se puede crear el personaje: parámetros incorrectos");

        this.nombre = nombre;
        this.raza = raza;

        this.fuerza = fuerza;
        this.agilidad = agilidad;
        this.constitucion = constitucion;
        this.nivel = (byte) nivel;
        this.pv = pv;

        this.experiencia = experiencia;
    }

    public Personaje(String nombre, Raza raza, int fuerza, int agilidad, int constitucion) {
        this(nombre, raza, fuerza, agilidad, constitucion, 1, 0, constitucion + VIDA_MINIMA);
    }

    public Personaje(String nombre, Raza raza) {
        this(nombre, raza, rnd(1, 100),  rnd(1, 100), rnd(1, 100));
    }

    public Personaje(String nombre) {
        this(nombre, Raza.HUMANO);
    }

    /*
    * MÉTODOS DE INSTANCIA
    */

    public String mostrar() {
        String info = "";
        info += nombre;
        info += " (" + raza + ")\n";
        info += "- Fuerza: " + fuerza + "\n";
        info += "- Agilidad: " + agilidad + "\n";
        info += "- Constitución: " + constitucion + "\n";
        info += "- Nivel: " + nivel + "\n";
        info += "- Experiencia: " + experiencia + "\n";
        info += "- PV: " + pv + "\n";
        return info;
    }


    public String toString() {
        return nombre + " (" + pv + "/" + getPvIniciales() + ")";
    }

    private int getPvIniciales() {
        return constitucion + VIDA_MINIMA;
    }


    

    public int getPv() {
        return pv;
    }

    int sumarExperiencia(int puntos) {
        int expAnterior = experiencia / 1000;
        experiencia += puntos;
        return experiencia / 1000 - expAnterior;

        // @TODO Pensar si debemos subir de nivel aquí? 
    }

    void subirNivel() {
        nivel++;
        fuerza = (int) (fuerza * 1.05);
        agilidad = (int) (agilidad * 1.05);
        constitucion = (int) (constitucion * 1.05);
        
        // @TODO Debería el personaje recuperar algo o toda la vida?
    }

    void curar() {
        if (pv < getPvIniciales())
            pv = getPvIniciales();
    }

    boolean perderVida(int puntos) {
        pv -= puntos;
        return !estaVivo();
    }

    boolean estaVivo(){
        return pv > 0;
    }


    /*
    SISTEMA DE COMBATE
    */
    int atacar(Personaje enemigo) {
        int ataque = fuerza + rnd(1, 100);
        int defensa = enemigo.agilidad + rnd(1, 100);
        int danho = Math.min(ataque - defensa, enemigo.pv);
        if (danho > 0) {
            enemigo.perderVida(danho);
            enemigo.sumarExperiencia(danho);
            sumarExperiencia(danho);
            return danho;
        }
        return 0;
    }


    /*
    * UTILIDADES
    */    
    public static int rnd(int inicio, int fin) {
        Random rnd = new Random();
        return rnd.nextInt(inicio, fin + 1);
    }



    /*
    * GETTERS
    */
    
    public String getNombre() {
        return nombre;
    }
    public int getAgilidad() {
        return agilidad;
    }



}
