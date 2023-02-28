public class ConfirmarImparesDiferente {

    public static boolean main(int numero) {
        boolean resultado = true;
        int digitoMenosSig;


        while (numero > 0){

            digitoMenosSig = numero % 10;
            if (digitoMenosSig % 2 == 0){
                return false;
            } else {
                numero = numero/10;
            }



        }
            return resultado;  }



}
