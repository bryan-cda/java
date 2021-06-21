package br.com.jse.collections;

import java.util.*;

import static java.util.Arrays.asList;

public class JavaUtilMapExam {
    public static void main(String[] args) {
        Map<String, Integer> worldCup = new HashMap<>();
        worldCup.put("Brasil", 5);
        worldCup.put("Alemanhã", 4);
        worldCup.put("Itália", 4);
        worldCup.put("Argentina", 2);
        worldCup.put("Uruguai", 2);
        worldCup.put("Espanha", 1);
        worldCup.put("França", 1);

        System.out.println(worldCup);

        System.out.println(worldCup.get("Itália"));

        System.out.println(worldCup.containsKey("Espanha"));

        System.out.println(worldCup.containsValue(0));

        System.out.println(worldCup.keySet());

        System.out.println(worldCup.size());

        worldCup.keySet().stream().sorted();

        System.out.println(worldCup);

        worldCup.entrySet().forEach(System.out::println);

       Map<String, List<String>> phones = new LinkedHashMap<>();
       phones.put("Motorola", asList("Moto G1", "Moto G2", "Moto G3", "Moto G4", "Moto G5", "Moto G6", "Moto G7", "Moto G8", "Moto G9"));
       phones.put("Iphone", asList("X", "XI"));

        System.out.println(phones);

        phones.entrySet().forEach(System.out::println);

    }
}
