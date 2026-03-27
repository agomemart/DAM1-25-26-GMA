package ud5;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class E1209 {
    public static void main(String[] args) {
        Random rnd = new Random();
        List<Integer> numeros = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            numeros.add(rnd.nextInt(10) + 1);
        }

        for (Integer num : numeros) {
            if (num % 2 == 0) {
                System.out.println(numeros.get(num));
            }
        }
    }
}
