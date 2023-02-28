package severo;

import java.util.Scanner;

/**
 * este es un comentario multilinea.
 * Empiezo con la barra y el doble asterisco.
 * Mejor frases cortas y mas intros que una frase larga
 *
 * Con arroba puedes rellenar campos.
 * @author Albert
 * @deprecated
 */
public class Main {

    /**
     * Metodo principal o para poner comentarios en el main.
     * @param args lo de args es argumentos de entrada.
     */

    public static void main(String[] args) {

        /* Esto es para comentarios multilineas dentro del codigo.
        si le voy dando returns sigue siendo comentario
         Asi y mas. Escasos.
         */

        //System.err.println("codigo para error");

        System.out.println("Introduce un numero: ");
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce número uno:");
        int numero = entrada.nextInt();
        System.out.println("Introduce número dos:");
        int numero2 = entrada.nextInt();

        System.out.println("Introduce texto uno:");
        String texto = entrada.nextLine();
        System.out.println("Introduce texto dos:");
        String texto2 = entrada.nextLine();

        System.out.println("numero = " + numero);
        System.out.println("numero2 = " + numero2);
        System.out.println("texto = " + texto);
        System.out.println("texto2 = " + texto2);

    }
}
