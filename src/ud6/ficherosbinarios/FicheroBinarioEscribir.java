package ud6.ficherosbinarios;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class FicheroBinarioEscribir {
    public static void main(String[] args) {
        try {
            FileOutputStream archivo = new FileOutputStream("datos.dat");
            ObjectOutputStream out = new ObjectOutputStream(archivo);

            out.writeInt(33);
            out.writeDouble(8.7);
            out.writeBoolean(true);

            out.close();
            
        } catch (FileNotFoundException e) {
            System.out.println("El archivo no existe");
        } catch (IOException e) {
                System.out.println("Error de I/O");
        }
    }
}
