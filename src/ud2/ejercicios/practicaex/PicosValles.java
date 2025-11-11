package ud2.ejercicios.practicaex;

import java.util.Scanner;

public class PicosValles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int numAnterior = 0;
        int numActual = 0;
        int picos = 0;
        int valles = 0;
        int minimo = Integer.MAX_VALUE;
        int maximo = Integer.MIN_VALUE;
        String tipoSecuencia = "";

        System.out.println("Números a introducir: ");
        int cantidadNumeros = sc.nextInt();

        for (int i = 0; i < cantidadNumeros; i++) {
            numActual = sc.nextInt();
            if (numActual > maximo) {
                maximo = numActual;
            }
            if (numActual < minimo) {
                minimo = numActual;
            }
            if (i == 0) {
                numAnterior = numActual;
                continue;
            }
            if (numAnterior < numActual) {
                System.out.println("Pico");
                picos++;
            } else if (numAnterior > numActual) {
                System.out.println("Valle");
                valles++;
            } else {
                System.out.println("Ni pico ni valle");
            }
            numAnterior = numActual;
        }
        sc.close();

        if (picos > 0 && valles > 0) {
            tipoSecuencia = "Mixta";
        } else if (picos == 0 && valles > 0) {
            tipoSecuencia = "Decreciente total";
        } else if (valles == 0 && picos > 0) {
            tipoSecuencia = "Creciente total";
        } else {
            tipoSecuencia = "Constante";
        }

        System.out.println("Picos: " + picos);
        System.out.println("Valles: " + valles);
        System.out.println("Tipo de secuencia: " + tipoSecuencia);
        System.out.println("Máximo: " + maximo);
        System.out.println("Mínimo: " + minimo);
    }
}
