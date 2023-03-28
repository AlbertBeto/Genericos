package PredicateSupplierConsumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateTarea {
    public static void main(String[] args) {


        Predicate<Integer> mayorCien = numero -> numero < 100;

        Predicate<Integer> enterCienTrescientos = numero -> numero < 100 & numero < 300;

        Predicate<Integer> mayorCienOMenorCincuenta = numero -> numero < 100 | numero < 50;

        Predicate<Integer> noCien = numero -> !numero.equals(100);

        BiPredicate<String, String> textoIgual = (text1, text2) -> text1.equals(text2);

        List<Integer> enteros = new ArrayList<>();

        enteros.add(1);
        enteros.add(29);
        enteros.add(4);
        enteros.add(2);
        enteros.add(67);
        enteros.add(25);
        enteros.add(12);
        enteros.add(32);
        enteros.add(28);
        enteros.add(22);

        Predicate<Integer> menorVenticinco = numero -> numero<25;
        Predicate<Integer> mayorTreinta = numero -> numero>30;

        for (Integer numero: enteros){
           if (menorVenticinco.and(mayorTreinta).test(numero)){
               System.out.println("El número está en el varemo");
           }
        }


//main
    }

    //class
}
