import java.util.Scanner;

public class PRUEBA1 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Vamos a introducir varios datos. Por favor sigue los pasos.");

        System.out.println("Introduce un número Byte:");
        byte numeroByte = entrada.nextByte();

        System.out.println("Introduce un número Short:");
        short numeroShort = entrada.nextShort();

        System.out.println("Introduce un número Int:");
        int numeroInt = entrada.nextInt();

        System.out.println("Introduce un número Long: ");
        long numeroLong = entrada.nextLong();

        System.out.println("Introduce un estado Boolenao:");
        boolean numeroBoolean = entrada.nextBoolean();

        //Se introduce linea por error con los returns.
entrada.nextLine();

        System.out.println("Introduce una linea de texto:");
        String textoEntrada = entrada.nextLine();

        System.out.println("numeroByte = " + numeroByte);
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("numeroBoolean = " + numeroBoolean);
        System.out.println("textoEntrada = " + textoEntrada);

    }
}
