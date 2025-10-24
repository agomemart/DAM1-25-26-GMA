package ud2.parejas;

import java.util.Random;
import java.util.Scanner;

public class CalculadoraHumana {
    static final int MAX_OPERACIONES = 7;
    static final int MAX_FALLOS = 3;
    static final int MAX_VALOR = 200;

    static void mostrarInstrucciones() {
        System.out.println("---La Calculadora Humana---");
        System.out.println("Resuelve " + MAX_OPERACIONES + " operaciones correctamente.");
        System.out.println("Puedes fallar hasta " + MAX_FALLOS + " veces.");
        System.out.println("Todos los resultados estarán entre 1 y " + MAX_VALOR + ".");
        System.out.println();
    }
    static int pedirResultado(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Tu respuesta: ");
        return sc.nextInt();
    }
    static int obtenerOperando2Division(int operando1){
         for (int i = 2; i <= operando1; i++) {
            if (operando1 % i == 0 && operando1 / i <= MAX_VALOR) {
                return i;
            }
        }
        return -1;    
    }
    static int obtenerOperando2Suma(int operando1) {
        int max = MAX_VALOR - operando1;
        return generarAleatorio(max > 0 ? max : 1);
    }
    static int obtenerOperando2Resta(int operando1) {
        return generarAleatorio(operando1);
    }
    static int obtenerOperando2Multiplicacion(int operando1) {
        int max = MAX_VALOR / operando1;
        return generarAleatorio(max > 0 ? max : 1);
    }
    static int generarOperacion(int operando1) {
        int operador = generarAleatorio(4);
        int operando2 = 0;
        int resultado = 0;
        boolean valido = false;

        do {
            switch (operador) {
                case 1:
                    operando2 = obtenerOperando2Suma(operando1);
                    resultado = operando1 + operando2;
                    valido = resultado <= MAX_VALOR;
                    if (valido)
                        System.out.println(operando1 + " + " + operando2 + " = ?");
                    break;

                case 2:
                    operando2 = obtenerOperando2Resta(operando1);
                    resultado = operando1 - operando2;
                    valido = resultado >= 0;
                    if (valido)
                        System.out.println(operando1 + " - " + operando2 + " = ?");
                    break;

                case 3:
                    operando2 = obtenerOperando2Multiplicacion(operando1);
                    resultado = operando1 * operando2;
                    valido = resultado <= MAX_VALOR;
                    if (valido)
                        System.out.println(operando1 + " * " + operando2 + " = ?");
                    break;

                case 4:
                    operando2 = obtenerOperando2Division(operando1);
                    if (operando2 != -1) {
                        resultado = operando1 / operando2;
                        valido = true;
                        System.out.println(operando1 + " / " + operando2 + " = ?");
                    }
                    break;
            }
        } while (!valido);

        return resultado;
    }

    static int generarAleatorio(int max) {
        Random rnd = new Random();
        return rnd.nextInt(max) + 1;
    }
    public static void main(String[] args) {
        mostrarInstrucciones();

        int aciertos = 0;
        int fallos = 0;
        int operando1 = generarAleatorio(MAX_VALOR);

        while (aciertos < MAX_OPERACIONES && fallos < MAX_FALLOS) {
           int resultadoCorrecto = generarOperacion(operando1);
            int respuesta = pedirResultado();

            while (respuesta != resultadoCorrecto) {
                System.out.println("Incorrecto. Intenta otra vez.");
                fallos++;
                if (fallos >= MAX_FALLOS) break;
                respuesta = pedirResultado();
            }

            if (respuesta == resultadoCorrecto) {
                System.out.println("Correcto!");
                aciertos++;
                operando1 = resultadoCorrecto;
            }
        }

        if (aciertos >= MAX_OPERACIONES) {
            System.out.println("Enhorabuena!!");
        } else {
            System.out.println("Has superado el número máximo de fallos.");
        }
    }
}
