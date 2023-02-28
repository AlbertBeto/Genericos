import java.util.Scanner;

public class EjerciciosMatriz {
    public static void main(String[] args) {

        for (int i=0; i<4; i++) {
            for (int j=i; j>=0; j--)
                System.out.print(j);
            System.out.println();
        }


        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j < i; j++) {
                if(i == 4)
                    break;
                System.out.print(j);
            }
            System.out.println( );
        }
        System.out.println();
        System.out.println();

/*
        for (int i=0; i<filas;i++){
            for (int j=0; j<columnas; j++){
                System.out.print("*");
            }
            System.out.println();
        }

   */

        for (int i=0; i<5;i++){
            for (int j=0; j<5; j++){
                if (j==i){
                    System.out.print("*");
                }else{
                    System.out.print("");
                }
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();


        for (int i=0; i<5;i++){
            for (int j=0; j<5; j++){
                if (j<=i){
                    System.out.print("*");
                }
            }
            System.out.println();
        }


        System.out.println();
        System.out.println();


        int columnas, filas=0;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Vamos a imprimir una tabla de caracteres.");
        System.out.println("Introduce la cantidad de columnas:");
        columnas = entrada.nextInt();
        System.out.println("Introduce la cantidad de filas:");
        filas = entrada.nextInt();

        for (int i=0; i<filas;i++){
            for (int j=0; j<columnas; j++){
                System.out.print("*");
            }
            System.out.println();
        }



    }
}
