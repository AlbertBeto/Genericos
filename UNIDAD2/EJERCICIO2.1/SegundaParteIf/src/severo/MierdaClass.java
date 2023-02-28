package severo;

import java.util.Scanner;

public class MierdaClass {

   public static void main(String[] args) {

        double ticket;
        int stars;
            Scanner entrada = new Scanner(System.in);
            String ganasVerPeli;

       System.out.println("Introduce puntuación peli: ");
            stars = entrada.nextInt();

       System.out.println("Introduce precio con centimos: ");
            ticket = entrada.nextDouble();


            if (ticket <= 5.0){
                ganasVerPeli="Very";
            }else if (ticket >= 12.0 && stars == 5){
                ganasVerPeli="Sort of";
            }else if (ticket >= 12.0 && stars <5){
                ganasVerPeli="Not";
            }else if (ticket < 12.0 && stars == 5){
                ganasVerPeli="Very";
            }else if (ticket >= 5.0 && ticket <= 11.99 && stars >=2 && stars <= 4){
                ganasVerPeli="sort of";
            }else {
                ganasVerPeli="not";}


            System.out.println("ganasVerPeli = " + ganasVerPeli);
        }



    }

