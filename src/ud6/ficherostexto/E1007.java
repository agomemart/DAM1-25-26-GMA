package ud6.ficherostexto;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class E1007 {
    public static void main(String[] args) {
        try {
            BufferedWriter out = new BufferedWriter(new FileWriter("Quijote.txt"));
            out.write("En un lugar de La Mancha,");
            out.newLine();
            out.write("de cuyo nombre no quiero acordarme");
            out.close();
        } catch (IOException e) {
            System.out.println("Error I/O");
        }
    }
}
