package ud6.ficherosbinarios;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class E1102 {
    public static void main(String[] args) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("cancionPirata.dat"))) {
            out.writeChars("Con diez cañones por banda,\r\n" +
                            "viento en popa a toda vela,\r\n" +
                            "no corta el mar, sino vuela\r\n" +
                            "un velero bergantin.");
            
        } catch (IOException e) {
            System.out.println("Error de I/O");
        }
    }
}
