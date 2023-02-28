import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchFinal {
    public static void main(String[] args) {

        //try {
        Scanner entrada=new Scanner(System.in);
        int salidaBucle=0;
        do {
            System.out.println("Por favor escoge una de las siguientes opciones:");
            System.out.println("Pulsa 1 para Bocadillo de ternera con cebolla caramelizada y jamon serrano");
                    System.out.println("Pulsa 2 para Patatas picantes con ajo al curry Masala");
                            System.out.println("Pulsa 3 para Sopa de cebolla a la pimienta con picatostes");
                                    System.out.println("Pulsa 4 para Tortilla rellena de queso semi de cabra con olivas negras griegas");
            try {
                int opcionPrimero = entrada.nextInt();
            }catch (InputMismatchException e) {
                System.out.println("Solo se permiten números");
            }
                System.out.println("Ha escogido "+ opcionPrimero);
                if(opcionPrimero >=1 && opcionPrimero <=4){
                    System.out.println("Opción valida");
                    salidaBucle=1;}

            if (opcionPrimero !=1 ||opcionPrimero !=2 ||opcionPrimero !=3 ||opcionPrimero !=4)
                salidaBucle=0;
        } while (salidaBucle==0);
/* }catch (Exception e) {
System.out.println("Solo se permiten números");
}*/


    }
}
