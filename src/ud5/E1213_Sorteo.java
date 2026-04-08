package ud5;

import java.util.Set;

public class E1213_Sorteo {
    public static void main(String[] args) {
        Sorteo<Integer> sorteo = new Sorteo<>();
        for (int i = 0; i <= 50; i++) {
            sorteo.add(i);
        }

        Set<Integer> premados = sorteo.premiados(5);
        System.out.println(premados);
    }
}
