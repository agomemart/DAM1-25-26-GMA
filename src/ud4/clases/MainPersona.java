package ud4.clases;

public class MainPersona {
    public static void main(String[] args) {
        Persona pepe, paco = null, otraPersona;

        pepe = new Persona();

        pepe.nombre = "Pepe";
        pepe.edad = 28;
        pepe.estatura = 1.7;

        pepe.saludar();

        pepe.cumplirAños();

        pepe.crecer(.1);

        System.out.println(pepe.edad + " - " + pepe.estatura);

        System.out.println(pepe.nombre);

        otraPersona = pepe;
        otraPersona.edad = 40;

        System.out.println(pepe.edad); 

        System.out.println(otraPersona.nombre);


        System.out.println(paco);

        otraPersona = null; 
        pepe = null;



        // Persona[] personas = new Persona[3];
        // personas[0] = pepe;
        // personas[1] = paco;


        System.out.println("Fin programa");
    }
}
