package ud5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Colecciones {
    public static void main(String[] args) {
        Collection<Cliente> clientes = new ArrayList<>();

        Cliente c1 = new Cliente("77777777S", "Adrián", "01/01/2000");
        clientes.add(c1);
        clientes.add(new Cliente("77777778S", "Pepe", "02/02/2000"));
        clientes.add(new Cliente("77777778S", "Pepe", "02/02/2000"));
        clientes.add(c1);

        System.out.println(clientes);
        int i = 1;
        for (Cliente c : clientes) {
            System.out.println(i + ". " + c);
            i++;
        }

        //Iterator
        i = 1;
        Iterator<Cliente> itCliente = clientes.iterator();
        while(itCliente.hasNext()) {
            Cliente c = itCliente.next();
            System.out.println(i + ". " + c);
        }

        clientes.remove(c1);
        System.out.println(clientes);
        clientes.remove(c1);
        System.out.println(clientes);
        clientes.remove(c1);
        System.out.println(clientes);
        System.out.println(clientes.remove(new Cliente("77777778S", "Pepe", "02/02/2000")));
    }
}
