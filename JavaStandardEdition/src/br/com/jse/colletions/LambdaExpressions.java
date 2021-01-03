package br.com.jse.colletions;

import java.util.*;
import java.util.function.Function;

public class LambdaExpressions {
    public static void main(String[] args) {
        List<String> backEndMainLanguages = new ArrayList<>();

        backEndMainLanguages.add("Java");
        backEndMainLanguages.add("Python");
        backEndMainLanguages.add("GO");
        backEndMainLanguages.add("R");
        backEndMainLanguages.add("JavaScript");


        /**
         * Lambda expression replacing Comparator functional interface
         */

        backEndMainLanguages.sort((l1, l2) -> {
            return l1.compareTo(l2);
        });

        /**
         * Alphabetical or lexicographic order to sort
         */
        backEndMainLanguages.sort(String::compareTo);

        System.out.println(backEndMainLanguages);
        System.out.println("     ");

        List<String> frontEndFrameworks = new ArrayList<>();

        frontEndFrameworks.add("React");
        frontEndFrameworks.add("Angular");
        frontEndFrameworks.add("Vue");
        frontEndFrameworks.add("Node");
        frontEndFrameworks.add("Express");
        System.out.println("     ");

        Function<String, Integer> functionComparator = s -> s.length();

        /**
         * Reference Method
         */
        Function<String, Integer> comparatorFunction = String::length;

        Comparator<String> comparator = Comparator.comparing(functionComparator);
        Comparator<String> comparing = Comparator.comparing(comparatorFunction);

        frontEndFrameworks.sort(comparator);
        frontEndFrameworks.sort(comparing);

        frontEndFrameworks.forEach(l -> System.out.println(l));

    }
}
