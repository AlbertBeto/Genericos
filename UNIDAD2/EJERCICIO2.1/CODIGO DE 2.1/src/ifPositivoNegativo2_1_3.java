import java.util.Scanner;

public class ifPositivoNegativo2_1_3 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Hola, por favor introduzca un número positivo o negativo:");

        int numeroPositivoNega = entrada.nextInt();

        if(numeroPositivoNega <0){
            System.out.println("El número " + numeroPositivoNega + " es negativo");
        } else {
            if(numeroPositivoNega >0){
                System.out.println("El número " + numeroPositivoNega + "  es positivo");
                System.out.println("Todos los números positivos son mayores a cero");
            }else {
                System.out.println("Ha introducido un " + numeroPositivoNega);
            }
        }



    }
}
