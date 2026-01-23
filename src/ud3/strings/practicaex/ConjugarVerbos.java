package ud3.strings.practicaex;

public class ConjugarVerbos {
    static String conjuigarVerbo(String verbo, char tiempo) {
        if (verbo == null || verbo.length() == 0) {
            return null;
        }
        if (Character.isLetter(tiempo)) {
            tiempo = Character.toUpperCase(tiempo);
            if (tiempo != 'P' && tiempo != 'A' && tiempo != 'F') {
                return null;
            }
        } else {
            return null;
        }

        String terminacion = verbo.substring(verbo.length() - 2, verbo.length());
        String infinitivo = verbo.substring(0, verbo.length() - 2);
        String verboConjugado = "";

        switch (terminacion) {
            case "ar":
                switch (tiempo) {
                    case 'A':
                        verboConjugado = "yo " + infinitivo + "o \n" +
                                         "tú " + infinitivo + "as \n" +
                                         "él " + infinitivo + "a \n" +
                                         "nosotros " + infinitivo + "amos \n" +
                                         "vosotros " + infinitivo + "áis \n" +
                                         "ellos " + infinitivo + "an";
                        break;
                    case 'P':
                        verboConjugado = "yo " + infinitivo + "é \n" +
                                         "tú " + infinitivo + "aste \n" +
                                         "él " + infinitivo + "ó \n" +
                                         "nosotros " + infinitivo + "amos \n" +
                                         "vosotros " + infinitivo + "ásteis \n" +
                                         "ellos " + infinitivo + "aron";
                        break;
                    case 'F':
                        verboConjugado = "yo " + infinitivo + "aré \n" +
                                         "tú " + infinitivo + "arás \n" +
                                         "él " + infinitivo + "ará \n" +
                                         "nosotros " + infinitivo + "aremos \n" +
                                         "vosotros " + infinitivo + "aréis \n" +
                                         "ellos " + infinitivo + "arán";
                        break;
                }
                break;
            case "er":
                switch (tiempo) {
                    case 'A':
                        verboConjugado = "yo " + infinitivo + "o \n" +
                                         "tú " + infinitivo + "es \n" +
                                         "él " + infinitivo + "e \n" +
                                         "nosotros " + infinitivo + "emos \n" +
                                         "vosotros " + infinitivo + "éis \n" +
                                         "ellos " + infinitivo + "en";
                        break;
                    case 'P':
                        verboConjugado = "yo " + infinitivo + "í \n" +
                                         "tú " + infinitivo + "iste \n" +
                                         "él " + infinitivo + "ió \n" +
                                         "nosotros " + infinitivo + "imos \n" +
                                         "vosotros " + infinitivo + "ísteis \n" +
                                         "ellos " + infinitivo + "ieron";
                        break;
                    case 'F':
                        verboConjugado = "yo " + infinitivo + "eré \n" +
                                         "tú " + infinitivo + "erás \n" +
                                         "él " + infinitivo + "erá \n" +
                                         "nosotros " + infinitivo + "eremos \n" +
                                         "vosotros " + infinitivo + "eréis \n" +
                                         "ellos " + infinitivo + "erán";
                        break;
                }
                break;
            case "ir":
                switch (tiempo) {
                    case 'A':
                        verboConjugado = "yo " + infinitivo + "o \n" +
                                         "tú " + infinitivo + "es \n" +
                                         "él " + infinitivo + "e \n" +
                                         "nosotros " + infinitivo + "imos \n" +
                                         "vosotros " + infinitivo + "ís \n" +
                                         "ellos " + infinitivo + "en";
                        break;
                    case 'P':
                        verboConjugado = "yo " + infinitivo + "ía \n" +
                                         "tú " + infinitivo + "ías \n" +
                                         "él " + infinitivo + "ía \n" +
                                         "nosotros " + infinitivo + "íamos \n" +
                                         "vosotros " + infinitivo + "íais \n" +
                                         "ellos " + infinitivo + "ian";
                        break;
                    case 'F':
                        verboConjugado = "yo " + infinitivo + "iré \n" +
                                         "tú " + infinitivo + "irás \n" +
                                         "él " + infinitivo + "irá \n" +
                                         "nosotros " + infinitivo + "iremos \n" +
                                         "vosotros " + infinitivo + "iréis \n" +
                                         "ellos " + infinitivo + "irán";
                        break;
                }
                break;
            default:
                System.out.println("Lo iontroducido no es un infinitivo de un verbo.");
                break;
        }

        return verboConjugado;
    }

    public static void main(String[] args) {
        System.out.println(conjuigarVerbo("sobrevivir", 'a'));
    }
}
