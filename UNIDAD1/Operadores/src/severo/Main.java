package severo;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        String gos = "Pijo de cortijo";

        String minus = gos.toLowerCase(); //Convierte en minusculas
        String mayus = gos.toUpperCase(); //Convierte en mayusculas
        boolean hayTexto = gos.isEmpty(); //Respuesta Boleana a si el string gos está vacia.

        System.out.println(minus);
        System.out.println(mayus);
        System.out.println(hayTexto);



    }
}
