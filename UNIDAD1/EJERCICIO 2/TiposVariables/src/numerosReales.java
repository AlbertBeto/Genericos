public class numerosReales {
    public static void main(String[] args) {

        float maxFloat = Float.MAX_VALUE ;
        float minFloat = Float.MIN_VALUE ;

        double maxDouble = Double.MAX_VALUE ;
        double minDouble = Double.MIN_VALUE ;

        System.out.println(maxFloat);
        System.out.println(minFloat);
        System.out.println(maxDouble);
        System.out.println(minDouble);

        double notaMath = 8;
        double notaIngles = 7.5;

        double mediaNotas = (notaMath + notaIngles)/2;
        int mediaNotasFull = (int) ((notaMath + notaIngles)/2); //para redondear

        System.out.println(mediaNotas);
        System.out.println(mediaNotasFull);


    }
}
