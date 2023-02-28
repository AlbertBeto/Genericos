package severo;

public class los7Errores {

    public static void main(String[] args) {
        int a = 7, b = 42;
        int smaller = minimum(a,b);
        if (smaller == a) { //{} son ()
            System.out.println("a is the smallest!");
        }
    }

    public static int minimum(int a, int b){
        int smaller;
        if (a < b) {
             smaller = 'a';//No int sino char

        }else {
             smaller = 'b';
               }
        return smaller;



    }


}
