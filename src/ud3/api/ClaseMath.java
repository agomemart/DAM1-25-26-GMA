package ud3.api;

public class ClaseMath {

    static double random(double min, double max) {
        double random = Math.random();
        random *= max - min;
        random += min;
        return random;
        
    }

    public static void main(String[] args) {
        double numAleatorio = random(-360.0, 360.0);

        System.out.println(numAleatorio);
        System.out.println("Raíz cuadrada: " + Math.sqrt(numAleatorio));
        System.out.println("Número redondeado: " + Math.round(numAleatorio));
        System.out.println("Número redondeado hacia arriba: " + Math.ceil(numAleatorio));
        System.out.println("Número redondeado hacia abajo: " + Math.floor(numAleatorio));
        System.out.println("Valor absoluto: " + Math.abs(numAleatorio));
        System.out.println("Potencia al cubo: " + Math.pow(numAleatorio,3));
        System.out.println("Logaritmo natural: " + Math.log(numAleatorio));
        System.out.println("Seno: " + Math.sin(numAleatorio));
        System.out.println("Coseno: " + Math.cos(numAleatorio));
    }
}
