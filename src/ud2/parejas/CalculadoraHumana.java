package ud2.parejas;

import java.util.Random;
import java.util.Scanner;

public class CalculadoraHumana {
    static void mostrarInstrucciones(int numIntentos) {
        System.out.println("Resuelve las operaciones: ");
        System.out.println();
    }
    static int generarPrimeraOperacion() {
        int operando1 = generarAleatorio(200);
        int operando2 = generarAleatorio(200);
        return 0;
    }
    static int pedirResultado(){
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
    static int obtenerOperando2Division(int operando1){
        
        return 0;    
    }
    static int obtenerOperando2Suma(int operando1) {
        return 0;
    }
    static int obtenerOperando2Resta(int operando1) {
        return 0;
    }
    static int obtenerOperando2Multiplicacion(int operando1) {
        return 0;
    }
    static int generarOperacion(int operando1) {
        boolean operadorValido = false;
        
        do{
            int operador = generarAleatorio(4);
            switch (operador) {
                case 1:
                    if (operando1 < 150) {
                        operadorValido = true;
                        //generar operando 2
                    }
                    break;
                case 2:
                    if (operando1 >= 50) {
                        operadorValido = true;
                        //generar operando 2
                    }
                    break;
                case 3:
                    if (operando1 < 150) {
                        operadorValido = true;
                        //generar operando 2
                    }
                    break;
                case 4:
                    if (operando1 > 50) {
                        operadorValido = true;
                        //Añadir condicion que no sea primo en el if
                        //generar operando 2
                    }
                    break;
            }
        } while(!operadorValido);
        
        return 0;
    }
    static int generarAleatorio(int max) {
        Random rnd = new Random();
        int numAleatorio = rnd.nextInt(max) + 1;
        return numAleatorio;
    }
    public static void main(String[] args) {
        final int MAX_ACIERTOS = 7;
        final int MAX_NUM = 200;
        int aciertos = 0;
        int operando1, operando2;

        mostrarInstrucciones(MAX_ACIERTOS);

        operando1 = generarAleatorio(MAX_NUM);
        int resultado = generarOperacion(operando1);
        int resultadoUsuario = pedirResultado();

        while (resultado == resultadoUsuario) {
            aciertos++;
            //Sigue jugando
            operando1 = resultado;
            generarOperacion(operando1);
            //int resultadoUsuario = pedirResultado();
        }

        if (aciertos >= MAX_ACIERTOS) {
            System.out.println("Enhorabuena!!");
        } else {
            System.out.println("No conseguiste los " + MAX_ACIERTOS + " aciertos necesarios");
        }
    }
}
