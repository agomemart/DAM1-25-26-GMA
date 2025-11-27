package ud3.arrays;

import java.util.Scanner;

public class ArrayNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numPositvos = 0;
        int numNegativos = 0;
        int num0 = 0;
        int sumaPositivos = 0;
        int sumaNegativos = 0;
        double mediaPositivos, mediaNegativos;
        System.out.print("Introduce un número: ");
        int numIntroducido = sc.nextInt();
        int[] tabla = new int[numIntroducido];

        for (int i = 0; i < tabla.length; i++) {
            System.out.println("Inserta el número " + i + ": ");
            tabla[i] = sc.nextInt();
            if (tabla[i] > 0) {
                numPositvos++;
                sumaPositivos += tabla[i];
            } else if(tabla[i] < 0) {
                numNegativos++;
                sumaNegativos += tabla[i];
            } else {
                num0++;
            }
        }
        sc.close();

        mediaPositivos = sumaPositivos / numPositvos;
        mediaNegativos = sumaNegativos / numNegativos;
        System.out.println("Media números negativos: " + mediaNegativos);
        System.out.println("Media números positivos: " + mediaPositivos);
        System.out.println("Número de ceros: " + num0);

        
    }
}
