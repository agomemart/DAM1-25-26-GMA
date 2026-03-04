package ud4.interfaces.animales;

public class AppAnimales {
    public static void main(String[] args) {
        Perro p = new Perro();
        p.voz();

        Gato g = new Gato();
        g.voz();

        Caracol c = new Caracol();

        // Sonido son = new Sonido(); // No se pueden isntanciar interfaces

        System.out.println(Sonido.version);
        System.out.println(g.version);

        p.vozDurmiendo();
        g.vozDurmiendo();

        Leon le = new Leon();
        le.voz();
        le.vozDurmiendo();
        
        Sonido.bostezo();
        
        Tigre t = new Tigre();
        t.acechar();
        t.cazar();
        t.voz();
        t.vozDurmiendo();

        PerroLobo pl = new PerroLobo();
        pl.tipo();

        // Variables tipo interfaz
        p.correr();
        p.husmear();
        Sonido son = p;
        son.voz();
        //son.husmear(); // Error, no está definido en la interfaz

        g.arañar();
        son = g;
        son.voz();
        //son.arañar();
        
        son = le;
        son.voz();

        son = t;
        son.voz();

        Piano piano = new Piano();
        son = piano;
        son.voz();

        // Clases Anónimas
        Sonido animalDesconocido = new Sonido() {
            @Override
            public void voz() {
                System.out.println("jajijojujou");
            }  
        };

        animalDesconocido.voz();
        animalDesconocido.vozDurmiendo();


        p.anunciar();
        g.anunciar();

    }
}
