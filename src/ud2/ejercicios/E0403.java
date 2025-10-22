package ud2.ejercicios;

public class E0403 {
    static double areaCirculo(double r, double altura) {
        return 2 * Math.PI * r * (altura + r);
    }

    static double volumenCirculo(double r, double altura) {
        return Math.PI * Math.pow(r, 2) * altura;
    }

    public static void main(String[] args) {
        System.out.printf("Area círculo: %.2f m2%n", areaCirculo(2, 4));
        System.out.printf("Volumen círculo: %.2f m3%n", volumenCirculo(2, 4));
    }
}
