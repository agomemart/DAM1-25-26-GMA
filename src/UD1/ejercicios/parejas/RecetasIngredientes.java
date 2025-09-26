package ud1.ejercicios.parejas;

import java.util.Scanner;
/**
 * @author Adrián Gómez
 */

/*
Dada la siguiente receta de compota de manzana, pensada para 6 personas, u otra similar
que encuentres en Internet, realiza un programa que haga lo siguiente:
1. Mostrar un nombre o título adecuado en pantalla:
2. Mostrar la URL de la receta elegida:
3. Mostrar el número de personas y las cantidades necesarias de manzana, agua,
azúcar y limón para las que está pensada la receta elegida.
4. Opcionalmente puedes mostrar los otros ingredientes en otra línea de salida.
5. Solicitar por teclado al usuario un número de personas para el cual adaptar la receta.
6. Mostrar por pantalla las cantidades de manzana, agua, azúcar y limón necesarias
para elaborar la receta para el número de personas introducido.
7. Como extra, basándote en los precios de los ingredientes principales (manzanas y
azúcar) de un supermercado a tu elección, indica el coste de cada uno de los
ingredientes de la receta a elaborar y la suma total en euros, con hasta 2 decimales.
8. Opcionalmente puedes mostrar una recomendación de reducir al máximo la cantidad
de azúcar para que la receta sea más saludable.
 */

public class RecetasIngredientes {
    public static void main(String[] args) {
        final double MANZANA = 1.5; 
        final double AGUA = 330;
        final double AZUCAR = 120;
        final double ZUMO_LIMON = 1;
        final double PIEL_NARANJA = 1; 
        final double RAMA_CANELA = 1;
        final int PERSONAS = 6;

        System.out.println("Receta de compota de manzana");
        System.out.println("https://www.recetasderechupete.com/compota-de-manzana-casera/12509/");
        System.out.println("Ingredientes: ");
        System.out.println("Para " + PERSONAS + " personas");
        System.out.println(MANZANA + "kg de manzanas");
        System.out.println(AGUA + "ml de agua");
        System.out.println(AZUCAR + "g de azúcar");
        System.out.println(ZUMO_LIMON + "cucharadita de zumo de limón");
        System.out.println("La piel de " + PIEL_NARANJA + " naranja");
        System.out.println(RAMA_CANELA + "ramita de canela");

        Scanner sc = new Scanner(System.in);
        System.out.print("Para cuántas personas quieres adaptar esta receta: ");
        int personasFinal = sc.nextInt();
        sc.close();

        double manzanaFinal = personasFinal * MANZANA / PERSONAS;
        double aguaFinal = personasFinal * AGUA / PERSONAS;
        double azucarFinal = personasFinal * AZUCAR / PERSONAS;
        double zumoLimonFinal = personasFinal * ZUMO_LIMON / PERSONAS;
        double pielNaranjaFinal = personasFinal * PIEL_NARANJA / PERSONAS;
        double ramaCanelaFinal = personasFinal * RAMA_CANELA / PERSONAS;

        System.out.println("Para " + personasFinal + " personas las cantidades serían las siguientes: ");
        System.out.printf("%.2f kg de manzanas%n", manzanaFinal);
        System.out.printf("%.2f ml de agua%n", aguaFinal);
        System.out.printf("%.2f g de azúcar%n", azucarFinal);
        System.out.printf("%.2f cucharadita de zumo de limón%n", zumoLimonFinal);
        System.out.printf("La piel de %.2f naranjas%n", pielNaranjaFinal);
        System.out.printf("%.2f ramitas de canela%n", ramaCanelaFinal);
    }
}
