package ud3.arrays.practicaex;

public class ContarPosNegCeros {
    public static void main(String[] args) {
        int[] array = {1, 2, -3, 4, 0, -6, 7, 8, -9, 10};
        int pos = 0;
        int neg = 0;
        int ceros = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                pos++;
            } else if(array[i] < 0) {
                neg++;
            } else {
                ceros++;
            }
        }

        System.out.println("Hay " + pos + " positivos, " + neg + " negativos y " + ceros + " ceros");
    }
}
