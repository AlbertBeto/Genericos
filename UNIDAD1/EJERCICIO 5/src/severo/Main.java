package severo;

public class Main {

    public static void main(String[] args) {

        // System.out.println(1/2 + 1/2);  DA 0 EN PANTALLA


        System.out.println((double) 1/2 + (double) 1/2);
        System.out.println((float) 1/2 + (float) 1/2);
        System.out.println((int)((float) 1/2 + (float) 1/2));

    //(3/4 + 6.7) / 3.0
        double fracc = (3/4 + 6.7)/3.0;
        System.out.println((double)1/2 + (double)1/2);
        System.out.println(fracc);

        int entero = 10;
        double decimal = 20.0;
        double lolo = (decimal / entero - 2) / 4;
        System.out.println(lolo);
        double first = 18.0-23.3;
        double second = 64 - 13;
        System.out.println(first/second);
        System.out.println((18.0-23.3) / (64 - 13));
        System.out.println(-23.49 * 3.5);
        System.out.println((34 -12) * (9 / 10) + 1.2);
        System.out.println(-8 / 16 + 3.5);

        System.out.println(1%2);
        double alfa = -9;
        double beta = 10;
        double gamma = alfa % beta;
        System.out.println(gamma);


    }
}
