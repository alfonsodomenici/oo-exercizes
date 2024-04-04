package ex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class App {
    public static void main(String[] args) {

        Predicate<String> isEmpty = a -> a.isEmpty();
        
        List<String> parole = Arrays.asList("intervallo", "nota", "suono", "ottava", "quinta");

        parole.stream().filter(v -> v.length() < 5).forEach(System.out::println);

        System.out.println(filtra(v -> v.length() > 5, parole));
    }

    private static List<String> filtra(Predicate<String> p, List<String> source) {
        List<String> result = new ArrayList<>();
        for (String el : source) {
            if (p.test(el)) {
                result.add(el);
            }
        }
        return result;
    }
}
