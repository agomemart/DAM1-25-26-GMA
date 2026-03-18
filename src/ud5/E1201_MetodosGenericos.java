package ud5;

import java.util.Arrays;

public class E1201_MetodosGenericos {
    public static <U> U[] add(U e, U[] t) {
        if (t == null) {
            return null;
        }

        t = Arrays.copyOf(t, t.length + 1);
        t[t.length - 1] = e;

        return t;
    }
}
