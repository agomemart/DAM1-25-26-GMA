package UD1.ejercicios.parejas;

import java.util.Scanner;

/* Realiza un programa que facilite el trabajo de estos periodistas que acepte por teclado un número
de hectáreas e imprima a cuántos campos de fútbol equivale.
Para evitar discriminaciones y para que aficionados a otros deportes también puedan entender la
magnitud de la tragedia, calcula e imprime el valor de superficie introducido en número de campos de
baloncesto, de tenis, etc. Para residentes en Madrid (o no) puedes ofrecer también el dato en número
equivalente de parques del Retiro quemados.
Puedes personalizar el programa con alguna medida equivalente de tu localidad o región de origen.
Para los cálculos puedes usar las siguientes dimensiones:
● 1 hectárea = 100 x 100 metros = 10000 m2
● Campo de fútbol según la FIFA (media): 105 x 70 metros
● Cancha de baloncesto: 28 x 15 metros
● Pista de tenis (dobles): 23,77 x 10,97 metros
● Parque del Retiro: 125 hectáreas
Formatea y redondea la salida de resultados a tu criterio para favorecer la legibilidad 
*/

public class UnidadesMedida {
    public static void main(String[] args) {
        final double METROS_CAMPO_FUTBOL = 105 * 70;
        final double METROS_CANCHA_BALONCESTO = 28 * 15;
        final double METROS_PISTA_TENIS = 23.77 * 10.97;
        final int HECTAREAS_RETIRO = 125; 
        final int METROS_HECTAREAS = 10000;
        double hectareas, campoFutbol, canchaBaloncesto, pistaTenis, parqueRetiro;

        System.out.print("Inserta número de hectareas: ");
        Scanner sc = new Scanner(System.in);
        hectareas = sc.nextDouble();
        sc.close();

        campoFutbol = (METROS_HECTAREAS / METROS_CAMPO_FUTBOL) * hectareas;
        canchaBaloncesto = (METROS_HECTAREAS / METROS_CANCHA_BALONCESTO) * hectareas;
        pistaTenis = (METROS_HECTAREAS / METROS_PISTA_TENIS) * hectareas;
        parqueRetiro =  hectareas / HECTAREAS_RETIRO;
        
        System.out.printf("En campo de futbol equivaldría a %.2f \n", campoFutbol);
        System.out.printf("En cancha de Baloncesto equivaldría a %.2f \n", canchaBaloncesto);
        System.out.printf("En  pista de tenis equivaldría a %.2f \n", pistaTenis);
        System.out.printf("Equivaldría a %.2f %s", parqueRetiro, " parque del retiro");
        
    }
    
}
