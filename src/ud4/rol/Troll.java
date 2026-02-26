package ud4.rol;


public class Troll extends Monstruo{
    public Troll(){
        ataque = rnd(60, 120);
        defensa = rnd(50, 70);
        velocidad = rnd(20, 40);
        puntosVida = rnd(100, 200);
    }

    @Override
    public int atacar(Personaje p) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'atacar'");
    }

    
}
