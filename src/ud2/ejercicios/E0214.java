package ud2.ejercicios;

import java.util.Scanner;

public class E0214 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.print("Inserta el día: ");
        int dia = sc.nextInt();
        System.out.print("Inserta el mes: ");
        int mes = sc.nextInt();
        System.out.print("Inserta el año: ");
        int anho = sc.nextInt();
        sc.close();

        dia++;
        boolean esBisiesto = anho % 400 == 0 || anho % 4 == 0 && anho % 100 != 0;
        
         switch (mes) {
            case 1, 3, 5, 7, 10, 12:
                if (dia >= 31) {
                    mes++;
                    dia = 1;
                }
                break;
            case 2:
                if ((dia >= 28 && !esBisiesto) || (dia > 29 && esBisiesto)) {
                    mes++;
                    dia = 1;
                }
                break;
            case 4, 6, 8, 9, 11:
                if (dia >= 30) {
                    mes++;
                    dia = 1;
                } 
                break;
            default:
                System.out.println("Fecha incorrecta");
                break;
            }
            
            if (mes == 13) {
                anho++;
                dia = 1;
                mes = 1;
            }
            System.out.println(dia + "/" + mes + "/" + anho);
        }
    }

