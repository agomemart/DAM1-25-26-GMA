package ud1.ejercicios.parejas;

import java.util.Scanner;

/**
 * @author Adrián Gómez
 */

public class CajeroAutomatico {
    public static void main(String[] args) {
        int importeEfectivo;
        int nMinBilletes5, nMinBilletes10, nMinBilletes20, nMinBilletes50;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el importe que quieres sacar en efectivo: ");
        importeEfectivo = sc.nextInt();
        sc.close();

        int multipo5 = importeEfectivo % 5;
        int hacerMultiplo5 = importeEfectivo - multipo5;
        String mensajeMultiplo5 = (multipo5 == 0)
            ? "El número introducido es múltiplo de 5, se puede sacar la cantidad introducida: " + importeEfectivo + " euros"
            : "El número introducido no es múltiplo de 5, no se puede sacar esa cantidad. Se sacará como máximo: " + hacerMultiplo5 + " euros";
                   
        nMinBilletes50 = importeEfectivo / 50;
        nMinBilletes20 = (importeEfectivo % 50) / 20;
        nMinBilletes10 = (importeEfectivo % 50 % 20) / 10;
        nMinBilletes5 = (importeEfectivo % 50 % 20 % 10) / 5;

        System.out.println(mensajeMultiplo5);
        System.out.println("La cantidad introducida se puede sacar en " + nMinBilletes5 + " billetes de 5 euros");
        System.out.println("La cantidad introducida se puede sacar en " + nMinBilletes10 + " billetes de 10 euros");
        System.out.println("La cantidad introducida se puede sacar en " + nMinBilletes20 + " billetes de 20 euros");
        System.out.println("La cantidad introducida se puede sacar en " + nMinBilletes50 + " billetes de 50 euros");
    }
}
