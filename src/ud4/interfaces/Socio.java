package ud4.interfaces;

import java.util.Arrays;

public class Socio implements Comparable {
    int id;
    String nombre;
    String fechaSocio;

    

    public Socio(int id, String nombre, String fechaSocio) {
        this.id = id;
        this.nombre = nombre;
        this.fechaSocio = fechaSocio;
    }


    
    @Override
    public String toString() {
        return "Socio [id=" + id + ", nombre=" + nombre + ", fechaSocio=" + fechaSocio + "]";
    }



    @Override
    public int compareTo(Object o) {
        Socio otroSocio = (Socio) o;
        //return otroSocio.nombre.compareTo(nombre); // Orden alfabético de nombre.
        int res =  id - otroSocio.id;
        if (res == 0)
            return otroSocio.nombre.compareTo(nombre);  
        else
            return res;
    }

    public static void main(String[] args) {
        Socio s1 = new Socio (3, "Anselmo", "11-07-2002");
        Socio s2 = new Socio(1, "Josefa", "21-11-2001");
        int resultado = s1.compareTo(s2);
        System.out.println(resultado);
        resultado = s2.compareTo(s1);
        System.out.println(resultado);  
        Socio s3 = new Socio(1, "Pepe", "21-11-2001");
        resultado = s2.compareTo(s3);
        System.out.println(resultado);

        Socio[] socios = {s1, s2, s3};

        Arrays.sort(socios);

        for (Socio socio : socios) {
            System.out.println(socio);            
        }


    }

}
