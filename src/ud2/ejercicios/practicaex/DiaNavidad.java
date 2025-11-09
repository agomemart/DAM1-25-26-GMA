package ud2.ejercicios.practicaex;

import java.util.Scanner;

public class DiaNavidad {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numFechas = sc.nextInt();
        for (int i = 0; i < numFechas; i++) {
            int dia = sc.nextInt();
            int mes = sc.nextInt();
            if (dia == 25 && mes == 12) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();

    }
}
