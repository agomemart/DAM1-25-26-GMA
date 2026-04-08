package ud5;

import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

public class Sorteo<T> {
    Set<T> sorteo = new LinkedHashSet<>();
    Set<T> premiados(int numeros) {
        Set<T> res = new LinkedHashSet<>();
        Random rnd = new Random();

        int contador = 0;
        while (numeros <= contador) {
            //res.add(rnd.nextInt(50 + 1));
            contador++;
        }
        

        return res;
        
    }

    public boolean add(T elemento) {
        sorteo.add(elemento);
        return true;
    }
}
