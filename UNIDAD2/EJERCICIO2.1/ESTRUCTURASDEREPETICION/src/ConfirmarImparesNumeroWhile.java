import java.util.Scanner;

public class ConfirmarImparesNumeroWhile {
    public static void main(String[] args) {


        Scanner entrada = new Scanner(System.in);


        System.out.println("Introduce número a confirmar maximo 6 digitos:");
        int numeroCompleto = entrada.nextInt(); //123456

        int unidades=0, decenas=0, centenas=0, milares, decimosMillar;


        while (true) {
            unidades = numeroCompleto % 10;
            int decenasPre = numeroCompleto /10;
            decenas = decenasPre %10;
            int centenaresPre = decenasPre/10;
            centenas = centenaresPre%10;
            int milaresPre = centenaresPre/10;
            milares = milaresPre%10;
            int decimosMillarPre = milaresPre/10;
            decimosMillar = decimosMillarPre%10;





            System.out.println("unidades = " + unidades);
            System.out.println("decenas = " + decenas);
            System.out.println("centenas = " + centenas);
            System.out.println("milares = " + milares);
            System.out.println("decimosMillar = " + decimosMillar);
        }


    }
}
