package ud3.api;

public class Hipotenusa {
    static double hipotenusa(double ladoA, double ladoB) {
        return Math.sqrt(Math.pow(ladoA, 2) + Math.pow(ladoB, 2));
    }

    public static void main(String[] args) {
        System.out.println(hipotenusa(5.2, 3.6));
    }
}
