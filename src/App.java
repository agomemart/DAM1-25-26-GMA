public class App {
    public static void main(String[] args) throws Exception {
        final int MAYORIA_DE_EDAD = 21;
        /*
         * Comentario multilinea
         */
        System.out.println("Hola, Adrián Gómez!");
        System.out.print("Probando print. ");
        System.out.println("Vamos a aprender Java");
        int edad;
        edad = 17;
        //String nombre = null;
        //char letra = 'A';

        double importe = 123.56; //Comentario una linea

        boolean mayorEdad;
        mayorEdad = edad >= MAYORIA_DE_EDAD;

        System.out.println("Tengo " + edad + " años");
        System.out.println("Importe: " + importe + " euros");
        System.out.println("Soy mayor de edad? " + mayorEdad);
        System.out.println("La mayoria de edad es a los " + MAYORIA_DE_EDAD + " años");
    }
}
