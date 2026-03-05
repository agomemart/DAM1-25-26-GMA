package ud4.rol;

public class Dragon extends Monstruo {
    public Dragon() {
        ataque = rnd(100, 200);
        defensa = rnd(60,100);
        velocidad = rnd(80, 120);
        puntosVida = rnd(120,250);
    }  
    
    @Override
    public int atacar(Personaje p) {
        int danho = super.atacar(p);
        if (danho > 0) {
            if (rnd(1, 100) > 50)
                // Ataque de llamarada
                System.out.println("Chamuscad@!!");
        }
        return danho;        
    }            
}
