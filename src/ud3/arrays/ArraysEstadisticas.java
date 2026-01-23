package ud3.arrays;

import java.util.Arrays;

public class ArraysEstadisticas {
    static int suma(int[] numeros) {
        if (numeros == null || numeros.length == 0) {
            return -1;
        }
        int suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }
        return suma;
    }

    static int minimo(int[] numeros) {
        if (numeros == null || numeros.length == 0) {
            return -1;
        }
        int[] copiaNumeros = Arrays.copyOf(numeros, numeros.length);
        Arrays.sort(copiaNumeros);
        return copiaNumeros[0];
    }

    static int maximo(int[] numeros) {
        if (numeros == null || numeros.length == 0) {
            return -1;
        }
        int[] copiaNumeros = Arrays.copyOf(numeros, numeros.length);
        Arrays.sort(copiaNumeros);
        return copiaNumeros[copiaNumeros.length - 1];
    }

    static double media(int[] numeros) {
        if (numeros == null || numeros.length == 0) {
            return -1;
        }
        int sumaNumeros = 0;
        for (int i = 0; i < numeros.length; i++) {
            sumaNumeros += numeros[i];
        }
        return (double)sumaNumeros / numeros.length;
    }

    static double mediana(int[] numeros) {
        if (numeros == null || numeros.length == 0) {
            return -1;
        }
        int[] copiaNumeros = Arrays.copyOf(numeros, numeros.length);
        Arrays.sort(copiaNumeros);
        if (numeros.length % 2 == 0) {
            int indiceCentral = numeros.length / 2;
            double sumaNumeros = copiaNumeros[indiceCentral] + copiaNumeros[indiceCentral + 1];
            return sumaNumeros / 2.0;
        } else {
            return copiaNumeros[numeros.length / 2];
        }
    }

    static int moda(int[] numeros) {
        if (numeros == null || numeros.length == 0) {
            return -1;
        }

        int moda = numeros[0];
        int maxFrecuencia = 0;
        boolean empate = false;

        for (int i = 0; i < numeros.length; i++) {
            int contador = 0;
            for (int j = 0; j < numeros.length; j++) {
                if (numeros[i] == numeros[j]) {
                    contador++;
                }
            }

            if (contador > maxFrecuencia) {
                maxFrecuencia = contador;
                moda = numeros[i];
                empate = false;
            } else if (contador == maxFrecuencia && numeros[i] != moda) {
                empate = true;
            }
        }

        return empate ? -1 : moda;

    }

    public static void main(String[] args) {
        // Declaración de variables y constantes
        int[] numeros1 = { 2, 4, 6, 7, 4, 7, 9, 2, 5, 6, 7 };
        int[] numeros2 = { 2, 4, 6, 7, 4, 9, 2, 5, 6, 7 };
        // Proceso y salida
        imprimeEstadisticas(numeros1);
        imprimeEstadisticas(numeros2);
    }

    static void imprimeEstadisticas(int[] numeros) {
        System.out.println("ARRAY ORIGINAL: " + Arrays.toString(numeros));
        System.out.println("---------------------------------------------");
        System.out.println("Longitud: " + numeros.length);
        System.out.println("Suma: " + suma(numeros));
        System.out.println("Máximo: " + maximo(numeros));
        System.out.println("Mínimo: " + minimo(numeros));
        System.out.println("Media: " + media(numeros));
        System.out.println("Mediana: " + mediana(numeros));
        System.out.println("Moda: " + moda(numeros));
        Arrays.sort(numeros);
        System.out.println("ARRAY ORDENADO: " + Arrays.toString(numeros));
        System.out.println("---------------------------------------------\n\n");

    }
}
