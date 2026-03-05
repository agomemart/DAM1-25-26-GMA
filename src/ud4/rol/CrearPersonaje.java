package ud4.rol;

public class CrearPersonaje {
    public static void main(String[] args) {
        Personaje per1, per2, per3;

        per1 = new Personaje("Aragorn", Raza.HUMANO, 80, 80, 80, 10, 0, 50);
        per2 = new Personaje("Legolas", Raza.ELFO, 70, 100, 80, 10, 0, 60);
        per3 = new Personaje("Gimli", Raza.ENANO, 70, 100, 80, 10, 0, 60);

        System.out.println(per1.mostrar());
        System.out.println(per2.mostrar());
        System.out.println(per3.mostrar());

        Personaje per4 = new Personaje(null, Raza.HOBBIT, 1,1, 1);
        System.out.println(per4.mostrar());

        Personaje per5 = new Personaje(null, Raza.ORCO);
        System.out.println(per5.mostrar());

        System.out.println(Personaje.rnd(1, 100));

        System.out.println(per1);
        System.out.println(per1.sumarExperiencia(900)); // 0  900
        System.out.println(per1.sumarExperiencia(200));  // 1  1100
        System.out.println(per1.sumarExperiencia(1000));  // 1  2100
        System.out.println(per1.sumarExperiencia(3000));  // 3  5100
        
        
        int danho = per1.atacar(per2);
        if (danho > 0) {
            System.out.println(per2 + " pierde " + danho + " puntos");
        } else {
            System.out.println(per2 + " esquiva el ataque");
        }
        

    }
}
