import org.w3c.dom.ls.LSOutput;

public class MetodoNuevo {
        public static void main(String[] args) {
        String str = reemplazar("Hola", 3);
            System.out.println(str);
            String str1 = reemplazar("hola",2);
            System.out.println(str1);

    }

    public static String reemplazar(String str, int n) {
        String str1="";
        for (int i = 0; i < n; i++) {
            str1= str1.concat(str);



        }
                return str1;

    }


}
