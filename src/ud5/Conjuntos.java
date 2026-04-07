package ud5;

import java.util.HashSet;
import java.util.Set;

public class Conjuntos {
    public static void main(String[] args) {
        Set<Cliente> clientes = new HashSet<>();
        
        Cliente c1 = new Cliente("77777777S", "Adrián", "01/01/2000");
        clientes.add(c1);
        clientes.add(new Cliente("77777778S", "Pepe", "02/02/2000"));
        clientes.add(new Cliente("77777778S", "Pepe", "02/02/2000"));
        clientes.add(c1);
    }
}
