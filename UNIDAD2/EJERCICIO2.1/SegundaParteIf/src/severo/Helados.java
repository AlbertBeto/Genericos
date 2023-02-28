package severo;

import java.util.Scanner;

public class Helados {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Escoge que sabor de helado quieres:");
        System.out.println("0 - Vainilla");
        System.out.println("1 - Chocolate");
        System.out.println("2 - Fresa");

        int sabor = input.nextInt();

        System.out.println("Por favor confirme el sabor con un ok.");

        switch (sabor) {
            case 0:
                System.out.println("Vainilla");
                break;

            case 1:
                System.out.println("Chocolate");
                break;

            case 2:
                System.out.println("Fresa");
                break;

            default:
                System.out.println("Error en la confirmación.");



        }
    }
}
