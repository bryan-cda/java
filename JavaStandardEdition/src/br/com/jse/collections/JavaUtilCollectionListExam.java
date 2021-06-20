package br.com.jse.collections;

import java.util.*;

import static java.lang.String.format;

public class JavaUtilCollectionListExam {
    /**
     *  List - guarantee insertion order
     *  ArrayList - dynamically manipulates property of arrays
     *  Allows sorting using Comparators
     */

    public static void main(String[] args) {
        List<String> lang = new ArrayList<>();
        lang.add("Java");
        lang.add("Python");
        lang.add("Golang");
        lang.add("JavaScript");
        lang.add("R");

        //Print ArrayList
        print(lang);

        //Sorting list by alphabetical order

        Collections.sort(lang);

        //Print ArrayList
        print(lang);

        //Change element by index on list
        lang.set(3, "Node");

        print(lang);

        //Remove element by index int value
        lang.remove(2);

        print(lang);

        //Remove element by object
        lang.remove("Node");

        print(lang);

        //Get element by index int value
        print(lang.get(2));

        //Get size of list
        print(lang.size());

        //Verify if element exists in list
        print(lang.contains("R"));

        //Verify if list is empty
        print(lang.isEmpty());

        //Verify what index of element
        print(lang.indexOf("R"));

        //Clear list
        lang.clear();
        print(lang);

        lang.add("Java");
        lang.add("Python");
        lang.add("Golang");
        lang.add("JavaScript");
        lang.add("R");

        //Iterating list
        for (String element : lang){
           print(format("For: %s", element));
        }

        Iterator<String> iterator = lang.iterator();

        while (iterator.hasNext()){
            print(format("Iterator: %s", iterator.next()));
        }
    }

    public static void print(Object object){
        System.out.println(object);
    }
}
