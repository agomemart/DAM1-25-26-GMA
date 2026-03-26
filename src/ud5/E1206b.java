package ud5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

public class E1206b {
    public static void main(String[] args) {
        Random rnd = new Random();
        Collection<Integer> numerosPos = new ArrayList<>();
        Collection<Integer> numerosNeg = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            int num = rnd.nextInt( -100, 100) + 1;
            
            if (num >= 0) {
                numerosPos.add(num);
            } else {
                numerosNeg.add(num);
            }
        }
    }
}
