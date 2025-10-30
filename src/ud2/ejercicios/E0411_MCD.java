package ud2.ejercicios;

public class E0411_MCD {
    static int mcd(int a, int b) {
        int mcd = 0;
        if (a == 0) {
            mcd = b;
        } else if (b == 0) {
            mcd = a;
        } else if (a >= b) {
            mcd = mcd(a - b, b);
        } else if (b > a) {
            mcd = mcd(a, b - a);
        }
        return mcd;
    }

    public static void main(String[] args) {
        System.out.println(mcd(10, 25)); //5
        System.out.println(mcd(100, 60)); //20
        System.out.println(mcd(26, 39)); //13
    }
}
