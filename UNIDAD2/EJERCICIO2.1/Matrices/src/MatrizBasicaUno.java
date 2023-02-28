public class MatrizBasicaUno {
    public static void main(String[] args) {


/*        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 4; j++) {
                System.out.print("*");
            }
            System.out.println("*");
        }
        System.out.println();
        System.out.println();
*/

        for (int i = 0; i < 5; i++) {

            for (int j = 0; j < 5; j++) {
                if (i != 0 && i != 4 && j != 0 && j != 4) {
                    System.out.print(" ");
                } else {
                   System.out.print("*");
                }
            }
            System.out.println();

        }

        for (int i = 1; i < 5; i++) {

            for (int j = 0; j < i; j++) {

                System.out.print("*");
            }

            System.out.println();
        }

        for (int i = 1; i < 5; i++) {

            for (int j = 5; j > i; j--) {

                System.out.print("*");
            }

            System.out.println();
        }


        for (int x = 1; x < 5; x++) {

            for (int y = 0; y < x; y++) {

                System.out.print("*");
            }

            System.out.println();
        }


    }
}

