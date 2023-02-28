package severo;

public class VariableTresMistery {

    public static int numUnique(int a, int b, int c) {
        return 0;

        if(a != b && a != c && b !=c){
            return 3;
        } else if (a== b && a !=c){
            return 2;
        }else {
            return 1;
        }

    }


    public static void main(String[] args) {
        int resultado = numUnique(18,3,4);

        /*
        int diferentes;

        if (numUnique(int a) == numUnique(int b)){
            diferentes = diferentes+1;

        }
        if (numUnique(int a) == numUnique(int c)){
            diferentes = diferentes+1;

        }
        if (numUnique(int c) == numUnique(int b)) {
        diferentes = diferentes+1;


        }
        */




    }

}
