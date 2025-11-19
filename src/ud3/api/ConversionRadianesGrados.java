package ud3.api;

public class ConversionRadianesGrados {
    static double radianesGrados(double radianes) {
        return radianes * 180 / Math.PI;
    }

    static double gradosRadianes(double grados) {
        return grados * Math.PI / 180;
    }

    public static void main(String[] args) {
        System.out.println(radianesGrados(0.52));
        System.out.println(gradosRadianes(30));
    }
}
