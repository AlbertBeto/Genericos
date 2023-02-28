package severo;

import java.util.Scanner;

public class DoWhileDescendente {
    public static void main(String[] args) {


                Scanner entrada = new Scanner(System.in);
                System.out.println("Introduce el número de la tabla que quieres");
                int tabla=entrada.nextInt();
                int multiplicador=0;
                do{
                    System.out.println(tabla+"X"+multiplicador+"="+(tabla*multiplicador));
                    multiplicador++;
                }while(multiplicador<11);
            }
        }