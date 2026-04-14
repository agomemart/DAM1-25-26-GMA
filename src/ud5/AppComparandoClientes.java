package ud5;

import java.util.LinkedList;
import java.util.List;

public class AppComparandoClientes {
    public static void main(String[] args) {
        List<Cliente> clientes = new LinkedList<>();

        Cliente c1 = new Cliente("111", "Pepe", "01/01/2000");
        clientes.add(c1);
        clientes.add(new Cliente("222", "Marta", "02/02/2002"));
        clientes.add(new Cliente("333", "Juan", "03/03/2003"));
        clientes.add(new Cliente("444", "Lola", "04/04/2004"));

        /*
         * Comparator<Cliente> comparador = new Comparator<>() {
         * 
         * @Override
         * public int compare(Cliente o1, Cliente o2) {
         * return o1.getEdad() - o2.getEdad();
         * }
         * 
         * };
         */

        clientes.sort((o1, o2) -> o1.getEdad() - o2.getEdad());

        for (Cliente c : clientes) {
            System.out.println(c);
        }
    }
}
