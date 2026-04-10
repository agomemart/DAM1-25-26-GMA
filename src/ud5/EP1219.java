package ud5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class EP1219 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce una frase: ");
        String frase = sc.nextLine();
        sc.close();
        
        List<String> palabras = new ArrayList<>(Arrays.asList(frase.split(" ")));
        Set<String> palabrasUnicas = new LinkedHashSet<>(palabras);
        Set<String> repetidas = new LinkedHashSet<>();

        Iterator<String> it = palabrasUnicas.iterator();
        while (it.hasNext()) {
            String palabra = it.next();
            if (palabras.indexOf(palabra) != palabras.lastIndexOf(palabra)) {
                repetidas.add(palabra);
                it.remove();
            }
        }

        System.out.println("Repetidas: " + repetidas);
        System.out.println("No repetidas: " + palabrasUnicas);
        
    }
}
