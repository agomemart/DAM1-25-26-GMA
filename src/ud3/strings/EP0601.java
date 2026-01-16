package ud3.strings;

import java.util.Scanner;

public class EP0601 {
    public static String eliminarComentarios(String codigo) {
        
        int contComentarios = 0;

        int posInicioComentario = codigo.indexOf("/*");
        

        while (posInicioComentario != -1) {
            contComentarios++;
            int posFinComentario = codigo.indexOf("*/", posInicioComentario);

            codigo = codigo.substring(0, posInicioComentario) + codigo.substring(posFinComentario + 2, codigo.length());

            
            posInicioComentario = codigo.indexOf("/*", posFinComentario);
        }

        System.out.println("El código tiene " + contComentarios + " bloques de comentarios.");

        return "";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Inserta una sentancia: ");
        String sentencia = sc.nextLine();
        sc.close();

        System.out.println(eliminarComentarios(sentencia));
    }
}
