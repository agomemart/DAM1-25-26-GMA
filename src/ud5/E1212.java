package ud5;

import java.util.LinkedHashSet;
import java.util.Set;

public class E1212 {
    static <E> Set<E> union(Set<E> conjunto1, Set<E> conjunto2) {
        Set<E> res = new LinkedHashSet<>();
        res.addAll(conjunto1);
        res.addAll(conjunto2);
        return res;
    }

    static <E> Set<E> interseccion(Set<E> conjunto1, Set<E> conjunto2) {
        Set<E> res = new LinkedHashSet<>();

        res.addAll(conjunto1);
        res.retainAll(conjunto2);

        /*for (E e : conjunto1) {
            if (conjunto2.contains(conjunto1)) {
                res.add(e);
            }
        }*/

        return res;
    }

    static <E> Set<E> except(Set<E> conjunto1, Set<E> conjunto2) {
        Set<E> res = new LinkedHashSet<>();
        res.addAll(conjunto1);
        res.removeAll(conjunto2);

        return res;
    }

    public static void main(String[] args) {
        Set<Integer> a = new LinkedHashSet<>();
        Set<Integer> b = new LinkedHashSet<>();
        a.add(1);
        a.add(5);
        a.add(3);
        a.add(8);

        b.add(2);
        b.add(5);
        b.add(6);
        b.add(9);

        Set<Integer> union = union(a, b);
        System.out.println("Unión: " + union);
        Set<Integer> interseccion = interseccion(a, b);
        System.out.println("Intersección: " + interseccion);
        Set<Integer> except = except(a, b);
        System.out.println("Except: " + except);
    }
}
