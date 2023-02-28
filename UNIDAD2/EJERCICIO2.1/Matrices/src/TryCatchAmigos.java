import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchAmigos {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un número:");
        int numero=0;


        try {
            numero = entrada.nextInt();

        }catch (InputMismatchException errorTexto){
            System.out.println("Tiene que introducir numeros");
        }catch (ArithmeticException errorNumeral){
            System.out.println("Numeración erronea");
        }//los catch de hijos a padres
        finally {
            //esto siempre se lanza. Se suele usar para cortar conexiones con base de datos o cortar scanner.
            entrada.close();//esto es cerrar el scanner para evitar que consuma recursos.
        }



    }
}
