package ud3.agomemart;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * @author Adrián Gómez Martínez
 */
public class PreguntaMasDificil {
    static double mediaPreguntaMasDificil(double[][] notas) {
        if (notas == null || notas.length == 0) {
            return -1;
        }

        
        double media = 0;
        double mediaMin = Double.MAX_VALUE;

        for (int j = 0; j < notas[0].length; j++) {
            double sumaNotasPregunta = 0;

            for (int i = 0; i < notas.length; i++) {
                sumaNotasPregunta += notas[i][j];
            }
            media = sumaNotasPregunta / notas.length;

            if(media < mediaMin) {
                mediaMin = media;
            }
            
        }

       
        return mediaMin;
    }

    @Test
    void testMediaPreguntaMasDificil() {
        double[][] notas = {
            {4, 10, 0, 8},
            {8, 2, 9.5, 3}, 
            {2, 1, 0, 0},
            {9, 6, 0, 0},
            {10, 3, 10, 9.5}
        };

        assertEquals(3.9, PreguntaMasDificil.mediaPreguntaMasDificil(notas), 0.1);
    }

    @Test
    void testMatrizHorizontal() {
        double[][] notas = {
            {4, 10, 0, 8},
            {8, 2, 9, 3}
        };

        assertEquals(4.5, PreguntaMasDificil.mediaPreguntaMasDificil(notas), 0.1);
    } 

    @Test
    void testMatrizVacia() {
        assertEquals(-1, PreguntaMasDificil.mediaPreguntaMasDificil(new double[0][0]));
    }
    
    @Test
    void testMatrizNull() {
        assertEquals(-1, PreguntaMasDificil.mediaPreguntaMasDificil(null));
    }    

    public static void main(String[] args) {
        double[][] notas = { { 4, 10, 0, 8 }, { 8, 2, 9.5, 3 }, { 2, 1, 0, 0 }, { 9, 6, 0, 0 }, { 10, 3, 10, 9.5 } };
        System.out.println(mediaPreguntaMasDificil(notas));
    }
}
