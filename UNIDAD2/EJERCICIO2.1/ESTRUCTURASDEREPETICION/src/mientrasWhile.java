import java.util.Scanner;

public class mientrasWhile {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

int contador;
int limite;

        System.out.println("Introduce en que cifra inicia el contador:");
        contador = entrada.nextInt();

        System.out.println("Introduce la cifra limite:");
        limite = entrada.nextInt();

while (contador <=limite){
    System.out.println("contador = " + contador);
    contador = contador +1;
}

        System.out.println("Termina el bucle");
    }
}
