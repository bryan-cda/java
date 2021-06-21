package br.com.jse.collections;

import java.util.*;

public class SortObjects {
    public static void main(String[] args) {
        Student student001 = new Student("Alan", "001", 11, "Java");
        Student student002 = new Student("Bryan", "002", 12, "Python");
        Student student003 = new Student("Chloe", "003", 10, "Golang");

        List<Student> studentClass = new ArrayList<>();
        studentClass.add(student001);
        studentClass.add(student002);
        studentClass.add(student003);

        studentClass.forEach(System.out::println);

        studentClass.sort((f, s) -> f.getAge() - s.getAge());

        System.out.println(studentClass);

        studentClass.sort(Comparator.comparingInt(Student::getAge).reversed());

        System.out.println(studentClass);

        Collections.sort(studentClass);

        System.out.println(studentClass);
    }
}
