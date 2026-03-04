package ud4.interfaces.relacionable;

public class AppRelacionable4 {
    public static void main(String[] args) {
        Relacionable[] array = new Relacionable[20];
        
        array[1] = new Linea(15, 3, 9, 5);
        array[5] = new Fraccion(10, 7);
        array[9] = new Fraccion(6, 25);
        array[11] = new Linea(3, 4, 10, 15);
        array[14] = new Fraccion(8, 3);
        array[15] = new Linea(0, 7, 1, 4);
        array[18] = new Linea(2, -1, 3, 5);                                                                       
       

        for (Relacionable r : array) {
            if (!Relacionable.esNull(r)) { //usamos el método static
                System.out.println(r.nombreClase());                                                              
                System.out.println(r);
                System.out.println();
            }
        }        
    }
}
