package ud4.rol;

public class CrearPersonaje {
    public static void main(String[] args) {
        Personaje p = new Personaje("DDD", Raza.HUMANO, 0, 0, 0, 0, 0, 0);
        Personaje p2 = new Personaje("EEE", Raza.ELFO, 0, 0, 0, 0, 0, 0);
        System.out.println(p.mostrar());
        System.out.println(p2.mostrar());
    }
}
