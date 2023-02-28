package severo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("introduce valor:");
        int n = entrada.nextInt();
        for (int i = 1; i <=n; i++) {
            if (i % 2 == 0) {
                System.out.print(i+" ");
            } else {
                System.out.print(i * (-1)+" ");
            }


        }
        System.out.println();
  System.out.println("introduce valor:");

  n = entrada.nextInt();
  int j=1;
       while (j <=n)  {
        if (j % 2 == 0) {
            System.out.print(j+" ");
            j++;

       }else{
            System.out.print(j*(-1)+" ");
            j++;
        }
       }









    }
}