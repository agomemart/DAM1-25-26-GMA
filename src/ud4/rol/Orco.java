package ud4.rol;


public class Orco extends Monstruo{
    public Orco(){
        ataque = rnd(30, 80);
        defensa = rnd(30, 50);
        velocidad = rnd(30, 50);
        puntosVida = rnd(30, 50);
    }

    @Override
    public int atacar(Personaje p) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'atacar'");
    }
}
