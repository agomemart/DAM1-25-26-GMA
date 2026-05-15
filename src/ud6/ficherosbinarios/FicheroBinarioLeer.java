package ud6.ficherosbinarios;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class FicheroBinarioLeer {
    public static void main(String[] args) {
        try {
            FileInputStream archivo = new FileInputStream("datos.dat");
            ObjectInputStream in = new ObjectInputStream(archivo);

            int entero = in.readInt();
            double real = in.readDouble();
            boolean bool = in.readBoolean();

            in.close();

            System.out.println("Entero: " + entero + " - Real: " + real + " - Booleano: " + bool);
            
        } catch (FileNotFoundException e) {
            System.out.println("No existe el archivo");
        } catch (IOException e) {
            System.out.println("Error de I/O");
        }
    }
}
