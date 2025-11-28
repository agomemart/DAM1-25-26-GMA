package ud3.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class E0502 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] tabla = new double[5];
        for (int i = 0; i < tabla.length; i++) {
            System.out.print("Inserta el número " + i + ": ");
            tabla[i] = sc.nextDouble();
        }
        sc.close();

        System.out.println(Arrays.toString(tabla));
    }
}
