package ud2.ejercicios.practicaex;

public class ChiclesRegalo {
    public static int totalChicles(int chiclesIniciales, int envoltoriosChicleGratis, int chiclesGratisEntregados) {
        int resultado = 0;
        if (chiclesIniciales < 0 || envoltoriosChicleGratis < 0 || chiclesGratisEntregados < 0) {
            resultado = -1;
        } else if (envoltoriosChicleGratis == 0) {
            resultado = chiclesIniciales;
        } else if (chiclesGratisEntregados > envoltoriosChicleGratis) {
            resultado = -1;
        } else {
            int total = chiclesIniciales;
            int envoltorios = chiclesIniciales;

            while (envoltorios >= envoltoriosChicleGratis) {
                int nuevos = (envoltorios / envoltoriosChicleGratis) * chiclesGratisEntregados;
                total += nuevos;
                envoltorios = nuevos + (envoltorios % envoltoriosChicleGratis);
            }
            resultado = total;
        }
        return resultado;
    }

    public static void main(String[] args) {
        System.out.println("Prueba 1 -> " + totalChicles(25, 5, 1) + " (esperado: 31)");
        System.out.println("Prueba 2 -> " + totalChicles(30, 4, 1) + " (esperado: 38)");
        System.out.println("Prueba 3 -> " + totalChicles(20, 5, 2) + " (esperado: 32)");
        System.out.println("Prueba 4 -> " + totalChicles(100, 5, 1) + " (esperado: 124)");
        System.out.println("Prueba 5 -> " + totalChicles(10, 9, 1) + " (esperado: 11)");

        System.out.println("Prueba 6 -> " + totalChicles(50, 0, 0) + " (esperado: 50)");
        System.out.println("Prueba 7 -> " + totalChicles(20, 0, 5) + " (esperado: 20)");

        System.out.println("Prueba 8 -> " + totalChicles(8, 10, 1) + " (esperado: 8)");
        System.out.println("Prueba 9 -> " + totalChicles(20, 5, 0) + " (esperado: 20)");

        System.out.println("Prueba 10 -> " + totalChicles(0, 5, 1) + " (esperado: 0)");
        System.out.println("Prueba 11 -> " + totalChicles(1, 1, 0) + " (esperado: 1)");

        System.out.println("Prueba 12 -> " + totalChicles(-5, 5, 1) + " (esperado: -1)");
        System.out.println("Prueba 13 -> " + totalChicles(10, -3, 1) + " (esperado: -1)");
        System.out.println("Prueba 14 -> " + totalChicles(10, 5, -1) + " (esperado: -1)");
        System.out.println("Prueba 15 -> " + totalChicles(10, 5, 6) + " (esperado: -1)");
        System.out.println("Prueba 16 -> " + totalChicles(-1, -1, -1) + " (esperado: -1)");

        System.out.println("Prueba 17 -> " + totalChicles(500, 5, 1) + " (esperado: 624)");

    }

}
