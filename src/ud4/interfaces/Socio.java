package ud4.interfaces;

import java.util.Arrays;
import java.util.Comparator;

public class Socio implements Comparable {
    int id;
    String nombre;
    String fechaSocio;
    int edad;

    public Socio(int id, String nombre, String fechaSocio, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.fechaSocio = fechaSocio;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Socio [id=" + id + ", nombre=" + nombre + ", fechaSocio=" + fechaSocio + "edad=" + edad + "]";
    }

    @Override
    public int compareTo(Object o) {
        Socio otroSocio = (Socio) o;
        return id - otroSocio.id;
    }

    public static void main(String[] args) {
        Socio s1 = new Socio (3, "Anselmo", "11-07-2002",24);
        Socio s2 = new Socio(1, "Josefa", "21-11-2001",27);
        int resultado = s1.compareTo(s2);
        System.out.println(resultado);
        resultado = s2.compareTo(s1);
        System.out.println(resultado);  
        Socio s3 = new Socio(1, "Pepe", "21-11-2001",25);
        resultado = s2.compareTo(s3);
        System.out.println(resultado);

        Socio[] socios = {s1, s2, s3};

        ComparaEdades comparadorPorEdades = new ComparaEdades();

        Comparator<Socio> comparadorPorNombre = new Comparator<>() {
            @Override
            public int compare(Socio o1, Socio o2) {
                return  o1.nombre.compareTo(o2.nombre);
            }
        };
        Arrays.sort(socios, comparadorPorEdades.thenComparing(comparadorPorNombre));

        Arrays.sort(socios, new Comparator<Socio>() {
            @Override
            public int compare(Socio o1, Socio o2){
                return o1.fechaSocio.compareTo(o2.fechaSocio);
            }
        });

        for (Socio socio : socios) {
            System.out.println(socio);            
        }


    }

}
