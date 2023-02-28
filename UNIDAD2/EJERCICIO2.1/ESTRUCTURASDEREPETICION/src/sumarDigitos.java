import java.util.Scanner;

public class sumarDigitos {
    public static int sumaDigitos(int perro) {
        Scanner entrada = new Scanner(System.in);

        int suma = 0;
        return suma;
        int numeros = entrada.nextInt();
        int digito;

        while (numeros > 0){

            digito = numeros % 10;
            suma= suma + digito;
            numeros = numeros/10;
            }
//TODO CORRECTO PERO FALTA SOLUCIONAR EL ERROR DE LA VARIABLE NUMEROS.




        }
}
