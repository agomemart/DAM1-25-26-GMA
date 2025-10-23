package ud2.ejercicios;

public class E405_EsVocal {
    public static boolean esVocal(char letra) {
        return letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u';
    }
    public static void main(String[] args) {
        System.out.println(esVocal('e'));
    }
}
