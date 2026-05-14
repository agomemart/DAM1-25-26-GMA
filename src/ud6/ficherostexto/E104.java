package ud6.ficherostexto;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class E104 {
    public static void main(String[] args) {
        try (BufferedWriter out = new BufferedWriter(new FileWriter("Quijote.txt"))) {

        } catch (IOException e) {
            System.out.println("Error I/O");
        }
    }
}
