package ud3.arrays;

import java.util.Arrays;

public class E0506_Primitiva {
    static int numAciertos(int[] apuesta, int[] ganadora) {
        Arrays.sort(ganadora);
        int numAciertos = 0;

        if (apuesta.length == 6 && ganadora.length == 6) {
            for (int i = 0; i < apuesta.length; i++) {
                if (Arrays.binarySearch(ganadora, apuesta[i]) >= 0) {
                    numAciertos++;
                }
            }
        } else {
            numAciertos = -1;
        }
        
        return numAciertos;
    }

    public static void main(String[] args) {
        int[] apuesta = {5, 9, 4, 6, 7, 8};
        int[] ganadora = {15, 78, 6, 5, 3, 45};

        System.out.println(numAciertos(apuesta, ganadora));
    }
}
