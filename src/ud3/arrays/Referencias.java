package ud3.arrays;
/**
 * @author Adrián Gómez
 */
public class Referencias {
    public static void main(String[] args) {
        int[] tabla = new int[10];
        int[] tabla2 = tabla;
        int[] tabla3 = tabla;
        
        System.out.println(tabla);
        System.out.println(tabla2);
        System.out.println(tabla3);
    }
}
