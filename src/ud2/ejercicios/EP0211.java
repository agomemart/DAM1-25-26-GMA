package ud2.ejercicios;

import java.util.Scanner;

public class EP0211 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Inserta un número de 3 o 4 cifras: ");
        int num = sc.nextInt();
        sc.close();

        boolean esCapicua = false;
        if (num < 1000 && num > 99) {
            int unidades = num % 10;
            int centenas = num / 100;
            esCapicua = unidades == centenas;
        } else if (num < 1000 && num > 99) {
            int unidades = num % 10;
            int decenas = num / 10 % 10;
            int centenas = num / 100 % 10;
            int uMillar = num / 1000;
            esCapicua = unidades == uMillar && centenas == decenas;
        }

        System.out.println(esCapicua ? "Es capicua" : "No es capicua");

    }
}
