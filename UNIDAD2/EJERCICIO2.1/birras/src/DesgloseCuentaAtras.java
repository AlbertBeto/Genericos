import java.util.Scanner;

public class DesgloseCuentaAtras {
    public static void main(String[] args) {

        Scanner entrada= new Scanner(System.in);
int numero;
        int numeroReducido;

        System.out.println("Dame un número que desglosar:");
        numero= entrada.nextInt();
        do {
            int ultimoNumero = numero % 10;
            numero = numero / 10;
            System.out.println(ultimoNumero);
        }while (numero>0);
    }
}
