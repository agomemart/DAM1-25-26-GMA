package ud3.api;

public class Circulo {
    static double volumenCirculo(double radio) {
        return 4.0 / 3 * Math.PI * Math.pow(radio, 3);
    }

    public static void main(String[] args) {
        System.out.println(volumenCirculo(14.5));
    }
}
