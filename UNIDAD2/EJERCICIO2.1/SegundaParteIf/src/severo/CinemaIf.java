package severo;

public class CinemaIf {

        public static void seeMovie(double ticket, int stars) {
            //Scanner input = new Scanner(System.in);
            String ganasVerPeli;
            ticket = 12.0;
            stars = 3;


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