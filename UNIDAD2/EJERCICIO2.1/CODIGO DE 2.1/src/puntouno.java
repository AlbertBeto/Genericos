import java.util.Scanner;

public class puntouno {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Hola! Eres el propietario de la maquina? (True or False)");

        boolean isOwner = entrada.nextBoolean();


        if(isOwner==true){
            System.out.println("Hola, bienvenido al sistema.");
        } else {
            System.out.println("Abandone el equipo.");
        }



    }
}
