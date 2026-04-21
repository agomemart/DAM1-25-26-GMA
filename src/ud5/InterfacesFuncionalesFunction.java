package ud5;

import java.util.function.Function;

public class InterfacesFuncionalesFunction {
    public static void main(String[] args) {
        Function<Double, Double> cuadrado = n -> n * n;
        Function<Double, Integer> redondear = n -> (int) (Math.round(n));
        Function<Double, Integer> cuadradoRedondeado = cuadrado.andThen(redondear);

        System.out.println(cuadrado.apply(7.));
        System.out.println(cuadradoRedondeado.apply(7.));
    }
}
