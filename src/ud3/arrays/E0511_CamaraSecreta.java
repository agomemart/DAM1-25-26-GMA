package ud3.arrays;

import java.util.Random;
import java.util.Scanner;

public class E0511_CamaraSecreta {
    static int[] arrayAleatorio(int n) {
        Random rnd = new Random();
        int[] arrayAleatorio = new int[n];

        for (int i = 0; i < arrayAleatorio.length; i++) {
            arrayAleatorio[i] = rnd.nextInt(1,6);
        }
        return arrayAleatorio;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Longitud de la combinación: ");
        int longitud = sc.nextInt();
        int[] combinacionSecreta = arrayAleatorio(longitud);
        int[] combinacionUsuario = new int[longitud];
        
        while (!combinacionSecreta.equals(combinacionUsuario)) {
            for (int i = 0; i < combinacionUsuario.length; i++) {
                System.out.print("Inserta el número " + i + " de la combinación: ");
                combinacionUsuario[i] = sc.nextInt();
            }

        }
        System.out.println("Enhorabuena!!");
        
        sc.close();
    }
}
