package ud4.interfaces.relacionable;

public interface Relacionable {
    boolean esMayorQue(Relacionable a);
    boolean esMenorQue(Relacionable a);
    boolean esIgualQue(Relacionable a); 

    default String nombreClase(){ //método por defecto
        String clase = getClass().toString();
        int posicion = clase.lastIndexOf(".");
        return clase.substring(posicion+1);                                                                       
    }   
    
   static boolean esNull(Relacionable a){
        return a == null;
    }    

}
