package severo;

import java.util.Scanner;

public class CheckAlquilerCoche {

    public static void main(String[] args) {

        //byte edad;
        //int creditoTarjeta;

        Scanner input = new Scanner(System.in);

        System.out.println("Bienvenido al sistema de confirmación de alquiler de coches.");
        System.out.println("Por favor, introduzca su edad:");
        byte edad = input.nextByte();

        System.out.println("Por favor, introduzca su disponibilidad de credito maximo de su tarjeta:");
        int creditoTarjeta = input.nextInt();

        if (edad>=21 && creditoTarjeta >=100000) {
            System.out.println("Gracias por introducir los datos. Usted es apto para alquilar.");

        }else{
            System.out.println("Lamento informarle que no cumples los requisitos minimos para alquilar");


        }



    }

}
