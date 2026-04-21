package ud5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

public class InterfacesFuncionalesPredicate {
    public static void main(String[] args) {
        Predicate<Integer> esPositivo = x -> x > 0;

        System.out.println(esPositivo.test(6)); //true
        System.out.println(esPositivo.test(0)); //false

        Predicate<Integer> esNoPositivo = esPositivo.negate();
        System.out.println(esNoPositivo.negate().test(6)); //false
        
        Predicate<Integer> esPar = x -> x % 2 == 0;
        System.out.println(esPar.test(6)); //true
        System.out.println(esPar.test(5)); //false

        Predicate<Integer> esPositivoYPar = esPositivo.and(esPar);
        System.out.println(esPositivoYPar.test(6)); //true
        System.out.println(esPositivoYPar.test(-6)); //false
        System.out.println(esPositivoYPar.test(5)); //false

        Predicate<Integer> esPositivoOPar = esPositivo.or(esPar);
        System.out.println(esPositivoOPar.test(6)); //true
        System.out.println(esPositivoOPar.test(-6)); //true
        System.out.println(esPositivoOPar.test(5)); //true
        System.out.println(esPositivoOPar.test(-5)); //false

        Collection<Cliente> clientes = new ArrayList<>();

        Cliente c1 = new Cliente("77777777S", "Adrián", "01/01/2000");
        clientes.add(c1);
        clientes.add(new Cliente("77777778S", "Pepe", "02/02/2009"));
        clientes.add(new Cliente("77777779S", "Juan", "02/02/2008"));
        
        Predicate<Cliente> esMayorEdad = c -> c.getEdad() >= 18;
        clientes.removeIf(esMayorEdad.negate());
        System.out.println(clientes);
        
    }
}
