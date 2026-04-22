package ud5;

import java.util.function.Function;

public class Calculos {
    Integer cuadrado(Integer a) { // Método de instancia
        return a * a;
    }

    static Integer cubo(Integer x) { // Método estático
        return x * x * x;
    }

    public static void main(String[] args) {
        Function<Integer, Integer> f1 = Calculos::cubo;
        Calculos calc = new Calculos();
        Function<Integer, Integer> f2 = calc::cuadrado;
    }
}
