import java.util.Scanner;

public class ifDiagrama2_1_5 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String despedida = "Gracias por su colaboración";

        System.out.println("Bienvenido. Porfavor siga los pasos e intrduzca datos númericos para los tres campos.");
        System.out.println("Introduzca el valor númerico de A:");

        int valorA = entrada.nextInt();

        System.out.println("Introduzca el valor númerico de B:");

        int valorB = entrada.nextInt();

        System.out.println("Introduzca el valor númerico de C:");
        int valorC = entrada.nextInt();

        if(valorA>valorB && valorA>valorC){
            System.out.println("A \"Es el mayor\"");
            System.out.println(despedida);
        }else{
            if(valorB>valorA && valorB>valorC){
                System.out.println("B \"Es el mayor\"");
                System.out.println(despedida);
            }

        else{
            System.out.println("C \"Es el mayor\"");
            System.out.println(despedida);
                    }

    }
}}
