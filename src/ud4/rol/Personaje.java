package ud4.rol;

public class Personaje {
    String nombre;
    String raza;
    int fuerza;
    int agilidad;
    int constitucion;
    int nivel = 1;
    int experiencia = 0;
    int puntosVida = 50 + constitucion;

    public Personaje(String nombre, String raza, int fuerza, int agilidad, int constitucion, int nivel, int experiencia,
            int puntosVida) {
        this.nombre = nombre;
        this.raza = raza;
        if (fuerza >= 1) {
            this.fuerza = fuerza;
        } else {
            fuerza = 1;
        }

        if (agilidad >= 1) {
            this.agilidad = agilidad;
        } else {
            agilidad = 1;
        }

        if (constitucion >= 1) {
            this.constitucion = constitucion;
        } else {
            constitucion = 1;
        }

        this.nivel = nivel;
        this.experiencia = experiencia;
        this.puntosVida = puntosVida;
    }

    /*public Personaje(String raza) {
        this.raza = raza;
    }

    public Personaje(String nombre) {
        this.nombre = nombre;
    }*/

    public void mostrar() {
        
    }
    
}
