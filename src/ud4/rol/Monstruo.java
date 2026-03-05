package ud4.rol;

import java.util.Arrays;
import java.util.Random;

/**
 * Monstruo es una clase abstracta porque no queremos permitir isntanciar monstruos genéricos.
 * @TODO Redefinimos la jerarquía para agrupar los parámetros comunes de Personaje y Monstruo??
 */
public abstract class Monstruo implements Comparable<Monstruo> {
    protected String nombre;
    protected int ataque;
    protected int defensa;
    protected int velocidad;
    protected int puntosVida;

    public String mostrar() {
        String str = "";
        str += getClass().getSimpleName() + "\n";
        str += "ataque=" + ataque + "\n";
        str += "defensa=" + defensa + "\n";
        str += "velocidad=" + velocidad + "\n";
        str += "puntosVida=" + puntosVida + "\n";

        return str;
    }

    @Override
    public String toString() {
        String str = "";
        str += getClass().getSimpleName();
        str += " (" + puntosVida + ")";

        return str;
    }

    public boolean estaVivo() {
        return puntosVida > 0;
    }
    public boolean perderVida(int puntos) {
        puntosVida -= puntos;
        return !estaVivo();
    }

    // Método abstracto?? Cada subclase de monstruo deberá implementarlo a su manera
    // O implementamos un ataque genérico que luego puedan sobreescribir?
    // Puede un monstruo no ser capaz de atacar? Como lo modelamos?    
    public int atacar(Personaje p){
        int ataque = this.ataque + rnd(1, 100);
        int defensa = p.getAgilidad() + rnd(1, 100);
        int danho = Math.min(ataque - defensa, p.getPv());
        if (danho > 0) {
            p.perderVida(danho);
            p.sumarExperiencia(danho);
            return danho;
        }
        return 0;         
    }

    public static Monstruo generaMonstruoAleatorio() {
        return null;
    }

    /*
    * UTILIDADES
    */    
    public static int rnd(int inicio, int fin) {
        Random rnd = new Random();
        return rnd.nextInt(inicio, fin + 1);
    } 


    

    @Override
    public int compareTo(Monstruo o) {
        return defensa - o.defensa;
    }

    public static void main(String[] args) {
        // Monstruo m = new Monstruo();
        //System.out.println(m);
        Orco o = new Orco();
        System.out.println(o);
        Troll t = new Troll();
        System.out.println(t);        
        Aranha a = new Aranha();
        System.out.println(a);
        Dragon d = new Dragon();
        System.out.println(d);      
        
        Monstruo m = o;
        m = d;

        Personaje p = new Personaje("Pepe");
        System.out.println(p.mostrar());
        Monstruo[] monstruos = { a, d, o, t};

        Arrays.sort(monstruos);

        for (Monstruo monstruo : monstruos) {
            System.out.println("\n" + monstruo + " ataca a " + p);
            int danho = monstruo.atacar(p);
            if (danho > 0) 
                System.out.println(p + " perdió " + danho + " puntos");
            else 
                System.out.println(p + " esquivó el ataque");
            
        }
        System.out.println(p.mostrar());
    } 
}
