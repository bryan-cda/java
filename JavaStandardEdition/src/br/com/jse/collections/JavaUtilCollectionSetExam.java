package br.com.jse.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class JavaUtilCollectionSetExam {
    public static void main(String[] args) {
        System.out.println("[HASHSET]");
        System.out.println("Define implementation, performative, does not maintain insertion or ordering.");
        Set<String> technology = new HashSet<>();
        technology.add("2G");
        technology.add("4G");
        technology.add("5G");
        technology.add("5G");
        technology.forEach(System.out::println);

        //Size
        System.out.println(technology.size());

        //Remove
        technology.remove("2G");
        System.out.println(technology);

        //IsEmpty
        System.out.println(technology.isEmpty());

        //Clear
        technology.clear();
        System.out.println(technology);
        System.out.println("");


        System.out.println("[LINKED HASHSET]");
        System.out.println("Guarantees the order of entry, but cannot be modified later, slower than HashSet");
        Set<String> colors = new LinkedHashSet<>();
        colors.add("Green");
        colors.add("Blue");
        colors.add("Red");
        colors.add("Orange");
        colors.forEach(System.out::println);
        System.out.println("");

        System.out.println("[TREE SET]");
        System.out.println("Keeps input order, can sort through comparators, slower than LinkedHashSet, performative for reading");

        TreeSet<String> movies = new TreeSet<>();
        movies.add("Matrix");
        movies.add("Avengers");
        movies.add("Death Note");
        System.out.println(String.format("First element: %s",movies.first()));
        System.out.println(String.format("Last element: %s",movies.last()));
        System.out.println(String.format("Lower element: %s",movies.lower("Death Notes")));
        System.out.println(String.format("Higher element: %s",movies.higher("Avengers")));
        System.out.println(movies);
        movies.forEach(System.out::println);



    }
}
