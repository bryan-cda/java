package br.com.jse.collections;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class JavaUtilCollectionVectorExam {
    public static void main(String[] args) {
        List<String> frameworks = new Vector<>();
        frameworks.add("Spring");
        frameworks.add("Node");
        frameworks.add("Django");
        frameworks.add("Cake");

        for (String f : frameworks){
            System.out.println(f);
        }

        Iterator<String> iterator = frameworks.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println(Arrays.toString(frameworks.toArray()));

        for(Object s : frameworks.toArray()){
            System.out.println(s);
        }
    }
}