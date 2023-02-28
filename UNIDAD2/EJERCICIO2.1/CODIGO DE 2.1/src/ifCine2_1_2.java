import java.util.Scanner;

public class ifCine2_1_2 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Hola! Introduzca la edad del cliente:");

        int ageCostumer = entrada.nextInt();


        if(ageCostumer<13){
            System.out.println("Cobrar tarifa para niños.");
        } else {
            System.out.println("Cobrar tarifa de adulto.");
        }


    }
}
