package ud4.interfaces.relacionable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class AppRelacionable2 {
public static void main(String[] args) {

        Linea l1 = new Linea(2, 2, 4, 1);
        Linea l2 = new Linea(5, 2, 10, 8);

        if (l1.esMayorQue(l2)) {
            System.out.println(l1 + "\nes mayor que" + l2);
        } else {
            System.out.println(l1 + "\nes menor o igual que" + l2);                                               
        }

        ArrayList<Linea> lineas = new ArrayList();

        lineas.add(new Linea(0, 7, 1, 4));
        lineas.add(new Linea(2, -1, 3, 5));
        lineas.add(new Linea(1, 9, 0, -3));
        lineas.add(new Linea(15, 3, 9, 5));
        
        Collections.sort(lineas, new Comparator<Linea>(){

            @Override
            public int compare(Linea o1, Linea o2) {
                if(o1.esMayorQue(o2)){
                    return 1;
                }else if(o1.esMenorQue(o2)){
                    return -1;
                }else{
                    return 0;
                }
            }
        });
        
        System.out.println("\nLineas ordenadas por longitud de menor a mayor");
        for (Linea l : lineas) {
            System.out.println(l);
        }
}
}
