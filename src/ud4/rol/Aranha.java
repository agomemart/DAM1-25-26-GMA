package ud4.rol;

public class Aranha extends Monstruo {
    public Aranha() {
        ataque = rnd(10, 50);
        defensa = rnd(20,40);
        velocidad = rnd(40, 70);
        puntosVida = rnd(30,80);
    }

    @Override
    public int atacar(Personaje p) {
        int danho = super.atacar(p);
        if (danho > 0) {
            if (rnd(1, 100) > 50)
                // Ataque de telaraña
                System.out.println("Enredado en la telaraña!!");
                
            if (rnd(1, 100) > 50)
                // Ataque de veneno
                System.out.println("Envenenado!!");
        }
        return danho;        
    }  
}
