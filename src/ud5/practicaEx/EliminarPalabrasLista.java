package ud5.practicaEx;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EliminarPalabrasLista {
    public static void main(String[] args) {
        List<String> palabras = new ArrayList<>();

        Iterator<String> it = palabras.iterator();
        while (it.hasNext()) {
            for (int i = 0; i < it.next().length(); i++) {
                if (Character.toLowerCase(it.next().charAt(i)) == 'a') {
                    it.remove();
                }
            }
        }
            
        
    }
}
