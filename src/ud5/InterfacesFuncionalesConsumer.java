package ud5;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class InterfacesFuncionalesConsumer {
    public static void main(String[] args) {
        List<Cliente> clientes = new ArrayList<>();
        
        Cliente c1 = new Cliente("77777777S", "Adrián", "01/01/2000");
        clientes.add(c1);
        clientes.add(new Cliente("77777778S", "Pepe", "02/02/2009"));
        clientes.add(new Cliente("77777779S", "Juan", "02/02/2008"));
        
        Consumer<Cliente> saludo = c -> System.out.println("Hola " + c.nombre);
        
        saludo.accept(c1);
        clientes.forEach(saludo);
    }
}
