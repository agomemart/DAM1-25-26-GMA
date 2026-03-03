package ud4.herencia.geometria;

public class Punto {
    protected double x;
    protected double y;

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void desplazaX(double dx) {
        x += dx;
    }

    public void desplazaY(double dy) {
        y += dy;
    }

    public void desplaza(double dx, double dy) {
        x += dx;
        y += dy;
    }

    public double distancia(Punto otro) {
        return Math.sqrt(Math.pow(otro.x - this.x, 2) + Math.pow(otro.y - this.y, 2));
    }

    public String mostrar() {
        return "(" + x + ", " + y + ")";
    }

}
