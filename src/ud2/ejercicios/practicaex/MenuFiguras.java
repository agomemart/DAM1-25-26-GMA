package ud2.ejercicios.practicaex;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuFiguras {
    static Scanner sc = new Scanner(System.in);

    public static void mostrarMenu() {
        System.out.println("1. Triángulo");
        System.out.println("2. Rectángulo");
        System.out.println("0. SALIR");
    }

    public static int leerDatoValido(int min, int max) {
        int valor = 0;
        int resultado = 0;
        try {
            valor = sc.nextInt();
            if (valor < min || valor > max) {
                System.out.println("Opción inválida. Inserta un valor entre " + min + " y " + max);
                resultado = -1;
            } else {
                resultado = valor;
            }
        } catch (InputMismatchException e) {
            System.out.println("Opción inválida. Inserta un número entero válido");
            resultado = -1;
            sc.nextLine();
        }
        return resultado;
    }

    public static void dibujarTriangulo(int filas) {
        for (int i = 1; i <= filas; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void dibujarRecangulo(int ancho, int alto) {
        for (int i = 0; i < alto; i++) {
            for (int j = 0; j < ancho; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static int contabilizarError(int numErrores, final int ERRORES_PERMITIDOS) {
        numErrores++;
        System.out.println("Llevas " + numErrores + " de " + ERRORES_PERMITIDOS + " errores.");
        return numErrores;
    }

    public static void main(String[] args) {
        final int ERRORES_PERMITIDOS = 3;
        int opcionMenu = 0;
        int numErrores = 0;

        do {
            mostrarMenu();
            System.out.print("Inserta la opción: ");
            opcionMenu = leerDatoValido(0, 2);
            if (opcionMenu == -1) {
                numErrores = contabilizarError(numErrores, ERRORES_PERMITIDOS);
            } else {
                switch (opcionMenu) {
                    case 0:
                        System.out.println("Hasta pronto!!");
                        break;
                    case 1:
                        System.out.print("inserta el número de filas del triángulo: ");
                        int filasTriangulo = leerDatoValido(2, 20);
                        if (filasTriangulo == -1) {
                            numErrores = contabilizarError(numErrores, ERRORES_PERMITIDOS);
                        } else {
                            dibujarTriangulo(filasTriangulo);
                        }
                        break;
                    case 2:
                        System.out.print("Inserta el ancho: ");
                        int ancho = leerDatoValido(2, 20);
                        if (ancho == -1) {
                            numErrores = contabilizarError(numErrores, ERRORES_PERMITIDOS);
                        }
                        System.out.print("Inserta el alto: ");
                        int alto = leerDatoValido(2, 20);
                        if (alto == -1) {
                            numErrores = contabilizarError(numErrores, ERRORES_PERMITIDOS);
                        }
                        if (ancho != -1 && alto != -1) {
                            dibujarRecangulo(ancho, alto);
                        }
                        break;
                }
            }
        } while (opcionMenu != 0 && numErrores < ERRORES_PERMITIDOS);
        sc.close();

        if (numErrores >= ERRORES_PERMITIDOS) {
            System.out.println("Se superó el número máximo de errores permitidos. Hasta pronto!");
        }
    }
}
