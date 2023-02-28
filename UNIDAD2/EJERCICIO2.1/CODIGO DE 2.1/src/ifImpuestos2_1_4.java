import java.util.Scanner;

public class ifImpuestos2_1_4 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Hola, por favor introduzca el précio del producto:");

        int precioProducto = entrada.nextInt();
        double impuesto5 = 0.05;
        double impuestoFinal= precioProducto * impuesto5;
        double precioFinal = impuestoFinal + precioProducto;

        if(precioProducto >=300){

            System.out.println("El impuesto es:" + impuestoFinal);
            System.out.println("El importe final es:" + precioFinal);
        } else {
            System.out.println("El producto no tiene ningun sobrecargo por impuesto.");

        }



    }
}
