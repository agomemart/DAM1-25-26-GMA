package ud4.herencia.geometria;

public class Punto3D extends Punto{
    private double z;

    public Punto3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public double distancia(Punto3D otro) {
        return Math.sqrt(Math.pow(otro.x - this.x, 2) + Math.pow(otro.y - this.y, 2) + Math.pow(otro.z - this.z, 2));
    }

    
    
}
