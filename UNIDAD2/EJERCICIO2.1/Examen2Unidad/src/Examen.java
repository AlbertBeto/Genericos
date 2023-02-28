import java.util.InputMismatchException;
import java.util.Scanner;

public class Examen {
    public static void main(String[] args) {
  /* EJERCICIO UNO
   Scanner sc=new Scanner(System.in);
int numero = (int) (Math.random()* 100)+1;
int intentos=1;
int exito=0;
int numeroUsuario=0;
        System.out.println("Inserta un número:");
           do {
               try{numeroUsuario = sc.nextInt();
               }catch (InputMismatchException noNumero){
                   System.out.println("No has introducido un número");
                   sc.nextLine();
               }
               if (numeroUsuario == numero) {
                   System.out.println("¡Acertaste! En " + intentos + " intentos");
                   exito = 1;
               } else if (numeroUsuario < numero) {
                   System.out.println("Te has quedado corto...");
                   intentos++;
               } else if (numeroUsuario > numero){
                   System.out.println("Te has pasado de largo, sigue intentandolo.");
                   intentos++;
               }
           }
            while (exito==0);
*/
            // FIGURA

        int filas=13;
        int colu=7;

        for (int i=0;i<filas;i++){
            for (int j=0; j<=colu; j++){

                if(j>i){
                    System.out.print(" "+j);
                }



            }System.out.println();
        }


       //main
    }
    // METODOS CON BUCLES
/*
    public static int digitosUnicos(int numero){
int internoNumero=numero;
       int unico=0;
       int muestra=0;
       int salida=0;


           if (internoNumero<0){
               System.out.println(-1);
           }else if(internoNumero>0){
               muestra=internoNumero%10;
               internoNumero=internoNumero/10;

           }

    }


    */
    //class
}
