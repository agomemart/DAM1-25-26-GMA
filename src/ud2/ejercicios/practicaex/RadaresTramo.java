package ud2.ejercicios.practicaex;

public class RadaresTramo {
    public static void radarVelocidad(int distancia, int velocidadMax, int tiempo) {
        if (distancia == 0 && velocidadMax == 0 && tiempo == 0) {
            System.out.println("Fin de datos");
            return;
        }
        if (distancia <= 0 || velocidadMax <= 0 || tiempo <= 0) {
            System.out.println("ERROR");
            return;
        }

        double velocidadMedia = (distancia / (double) tiempo) * 3.6;
        double limiteMulta = velocidadMax * 1.2;
        if (velocidadMedia <= velocidadMax) {
            System.out.println("OK");
        } else if (velocidadMedia < limiteMulta) {
            System.out.println("MULTA");
        } else {
            System.out.println("PUNTOS");
        }
    }

    public static void main(String[] args) {
        // Casos OK
        radarVelocidad(1000, 120, 30);   // velocidadMedia = 120 km/h → OK
        radarVelocidad(5000, 80, 225);   // velocidadMedia = 80 km/h → OK

        // Casos MULTA (velocidad media > límite, < 20% extra)
        radarVelocidad(1000, 120, 29);   // velocidadMedia ≈ 124.14 km/h → MULTA
        radarVelocidad(5000, 80, 200);   // velocidadMedia = 90 km/h → MULTA

        // Casos PUNTOS (velocidad media ≥ 20% extra)
        radarVelocidad(1000, 120, 25);   // velocidadMedia ≈ 144 km/h → PUNTOS
        radarVelocidad(5000, 80, 150);   // velocidadMedia ≈ 120 km/h → PUNTOS

        // Casos ERROR (entradas inválidas)
        radarVelocidad(0, 80, 10);       // distancia = 0 → ERROR
        radarVelocidad(2000, 0, 200);    // velocidadMax = 0 → ERROR
        radarVelocidad(2000, 80, -5);    // tiempo negativo → ERROR
        radarVelocidad(-1000, 80, 50);   // distancia negativa → ERROR

        // Caso fin de datos
        radarVelocidad(0, 0, 0);         // no hace nada
    }
}
