package br.com.jse.colletions;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LambdaExpressions {
    public static void main(String[] args) throws NoSuchFieldException {
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

        IDE intelliJ = new IDE("Intellij Ultimate", "JetBrains", 3500);
        IDE eclipse = new IDE("Eclipse Oxygen", "Eclipse Foundation", 100);
        IDE netbeans = new IDE("Netbeans", "Apache", 1000);
        IDE vsCode = new IDE("Vs Code", "Microsoft", 1200);
        IDE atom = new IDE("Atom", "Atom", 1400);
        IDE notepadPlusPlus = new IDE("Notepad++", "Notepad++", 1500);
        IDE phpStorm = new IDE("PhpStorm", "PhpStorm", 1300);
        IDE pycharm = new IDE("Pycharm", "JetBrains", 1600);
        IDE goland = new IDE("Goland", "JetBrains", 1900);
        IDE sublimeText = new IDE("SublimeText", "SublimeText", 600);

        List<IDE> ides = new ArrayList<>();
        ides.add(intelliJ);
        ides.add(eclipse);
        ides.add(netbeans);
        ides.add(vsCode);
        ides.add(atom);
        ides.add(notepadPlusPlus);
        ides.add(phpStorm);
        ides.add(pycharm);
        ides.add(goland);
        ides.add(sublimeText);

        ides.sort(Comparator.comparing(IDE::getPrice));

        ides.forEach(i -> System.out.println(i.getPrice()));
        System.out.println(" ");

        ides.sort(Comparator.comparing(IDE::getName));
        System.out.println(" ");

        ides.forEach(i -> System.out.println(i.getName()));
        System.out.println(" ");

        ides.stream().filter(i ->
                i.getBrand().toLowerCase().startsWith("e")
        ).forEach(i -> System.out.println(i.getBrand()));
        System.out.println(" ");

        /**
         * Return total of IDE with have price major than 600
         */
        int total = (int) ides.stream()
                .filter(i -> i.getPrice() > 600)
                .mapToInt(IDE::getPrice)
                .count();


        System.out.println("Print find any starts with p");
        ides.stream()
                .filter(i -> i.getName().toLowerCase()
                        .startsWith("p"))
                        .findAny()
                        .stream().forEach(i -> System.out.println(i.getName()));
        System.out.println(" ");


        System.out.println(total);
        System.out.println(" ");

        Stream<String> stringStream = ides.stream().map(IDE::getName);

        System.out.println(Arrays.toString(stringStream.toArray()));
        System.out.println(" ");

        List<IDE> collect = ides.stream().filter(i -> i.getPrice() > 600)
                .collect(Collectors.toList());

        IDE e = ides.stream()
                .filter(i -> i.getBrand().toLowerCase().startsWith("e"))
                .findAny()
                .orElseThrow(NoSuchFieldException::new);

        System.out.println(e);
        System.out.println(" ");


        ides.stream()
                .filter(i -> i.getPrice() > 600)
                .collect(Collectors.toMap(c -> c.getName(), c -> c.getPrice()))
                .forEach((name, price) -> System.out.println(String.format("{'name': '%s', 'price': %d} ", name, price)));
    }
}
