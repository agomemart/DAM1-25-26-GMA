package ud3.arrays.practicaex;

public class BuscarNumero {
        public static void main(String[] args) {
        int[][] t = {
            {1, 2, 3}, 
            {4, 5, 6}, 
            {7, 8, 5}
        };
        
        int numBuscar = 5;

        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t.length; j++) {
                if (t[i][j] == numBuscar) {
                    System.out.println("El número a buscar está en la posición " + i + " " + j);
                }
            }
        }
    }
}
