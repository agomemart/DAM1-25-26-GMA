package ud4.rol;

public class CrearPersonaje {
    public static void main(String[] args) {
        Personaje p = new Personaje("DDD", Raza.HUMANO, 1, 1, 1, 1, 0, 1);
        Personaje p2 = new Personaje("EEE", Raza.ELFO, 1, 1, 1, 1, 0, 1);
        System.out.println(p.mostrar());
        System.out.println(p2.mostrar());
    }
}
