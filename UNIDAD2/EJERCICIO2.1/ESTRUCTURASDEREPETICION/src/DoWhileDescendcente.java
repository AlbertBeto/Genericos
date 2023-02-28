import java.util.Scanner;

public class DoWhileDescendcente {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Introduce numero de inicio de cuenta atras:");
        int numero= entrada.nextInt();
        do{
            System.out.println(numero);
            numero--;
        }while (numero>=1);
    }
}
