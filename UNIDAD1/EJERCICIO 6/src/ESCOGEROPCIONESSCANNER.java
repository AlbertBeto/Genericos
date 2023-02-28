import java.sql.SQLOutput;
import java.util.Scanner;

public class ESCOGEROPCIONESSCANNER {

    public static void main(String[] args) {


/*
***** MENÚ DE SELECCIÓN *****
***** 1. Añadir un entrante. *****
***** 2. Añadir un plato principal. *****
***** 3. Elegir postre. *****
***** 4. No sentarme en este restaurante porque... *****
Elige una opción:
 */
        Scanner entrada = new Scanner(System.in);

        System.out.println("***** MENÚ DE SELECCIÓN *****");
        System.out.println("***** 1. Añadir un entrante. *****");
        System.out.println("***** 2. Añadir un plato principal. *****");
        System.out.println("***** 3. Elegir postre. *****");
        System.out.println("***** 4. No sentarme en este restaurante porque... *****");
        System.out.println("Elige una opción:");

        int opcionPrimerMenu = entrada.nextInt();

        System.out.println("Ha escogido botella de Agua como bebida para su menu. Escoja una marca.");
        System.out.println("1. Bezoya");
        System.out.println("2. Fontbella");
        System.out.println("3. Aigues Termals");
        System.out.println("4. Viguense");




    }
}
