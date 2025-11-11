package ud2.ejercicios.practicaex;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MaquinaRefrescos {
    public static boolean esMonedaValida(int moneda) {
        return moneda == 1 || moneda == 2 || moneda == 5 || moneda == 10 || moneda == 20 || moneda == 50 || moneda == 100 || moneda == 200;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean esImporteSuficiente = false;
        int totalMonedas = 0;

        System.out.print("Inserta el precio del refresco en céntimos: ");
        int precioRefresco = sc.nextInt();
        

        do {
            try {
                System.out.print("Inserta una moneda: ");
                int moneda = sc.nextInt();
                
                if (esMonedaValida(moneda)) {
                    totalMonedas += moneda;
                    System.out.println("Llevas " + totalMonedas + " de " + precioRefresco + " céntimos");
                } else {
                    System.out.println("La moneda introducida no es válida.");
                }
            } catch(InputMismatchException e) {
                System.out.println("Inserta un número entero válido.");
                sc.nextLine();
            }

            if (totalMonedas >= precioRefresco) {
                esImporteSuficiente = true;
                System.out.println("REFRESCO DISPENSADO");
            }

        } while (!esImporteSuficiente);
        sc.close();

        if (totalMonedas > precioRefresco) {
            int sobrante = totalMonedas - precioRefresco;
            System.out.println("CAMBIO: " + sobrante + " céntimos");
        }
    }
}
