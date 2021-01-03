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
        System.out.println("     ");

        IDE intelliJ = new IDE("Intellij Ultimate", "JetBrains");
        IDE eclipse = new IDE("Eclipse Oxygen", "Eclipse Foundation");
        IDE netbeans = new IDE("Netbeans", "Apache");

        List<IDE> ides = new ArrayList<>();
        ides.add(intelliJ);
        ides.add(eclipse);
        ides.add(netbeans);

        ides.sort(Comparator.comparing(IDE::getName));

        ides.forEach(i -> System.out.println(i.getName()));

        ides.stream().filter(i ->
                i.getBrand().toLowerCase().startsWith("e")
        ).forEach(i -> System.out.println(i.getBrand()));


        int len = ides.stream().filter(i -> i.getBrand().length() > 5).mapToInt(i -> i.getBrand().length()).sum();

        System.out.println(len);




    }
}
