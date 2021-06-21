package br.com.jse.collections;

import java.util.*;
import java.util.stream.Collectors;

public class JavaStreamApiExam {
    public static void main(String[] args) {
        Student student001 = new Student("Love", "001", 30, "Data Science");
        Student student002 = new Student("Joe", "001", 32, "Software Engine");
        Student student003 = new Student("Cora", "003", 22, "UX");

        List<Student> students = new ArrayList<>();
        students.add(student001);
        students.add(student002);
        students.add(student003);


        System.out.println(students.stream().count());

        System.out.println(students.stream().max(Comparator.comparingInt(Student::getAge)));
        System.out.println(students.stream().min(Comparator.comparingInt(Student::getAge)));

        List<Student> studentFiltered = students.stream().filter(
                student -> student.getSubject().toLowerCase().contains("e")
        ).collect(Collectors.toList());

        System.out.println(studentFiltered);

        List<Student> studentMapped = students.stream().map(student -> {
            if (student.getSubject().toLowerCase().contains("data")) {
                student.setSubject("Data Engineer");
            }
            return student;
        }).collect(Collectors.toList());

        System.out.println(studentMapped);

        System.out.println(students.stream().limit(1).collect(Collectors.toList()));

        System.out.println(students.stream().allMatch(element -> element.getSubject().toLowerCase().contains("Data")));

        System.out.println(students.stream().anyMatch(element -> element.getSubject().toLowerCase().contains("data")));

        System.out.println(students.stream().noneMatch(element -> element.getSubject().toLowerCase().contains("7")));

       students.stream().findFirst().ifPresentOrElse(System.out::println, () -> System.out.println("not found"));


        List<Student> data = students.stream()
                .peek(System.out::println)
                .map(student -> {
                            if (student.getSubject().toLowerCase().contains("data")) {
                                student.setSubject(student.getSubject().concat(" * * * "));
                            }
                            return student;
                        }
                ).peek(System.out::println)
                .filter(student -> student.getAge() >= 30)
                .collect(Collectors.toList());

        System.out.println(data);

       Set<Student> dataSet = students.stream()
                .peek(System.out::println)
                .map(student -> {
                            if (student.getSubject().toLowerCase().contains("data")) {
                                student.setSubject(student.getSubject().concat(" * * * "));
                            }
                            return student;
                        }
                ).peek(System.out::println)
                .filter(student -> student.getAge() >= 30)
                .collect(Collectors.toSet());

        System.out.println(dataSet);


        Map<String, List<Student>> data1 = students.stream()
                .peek(System.out::println)
                .map(student -> {
                            if (student.getSubject().toLowerCase().contains("data")) {
                                student.setSubject(student.getSubject().concat(" * * * "));
                            }
                            return student;
                        }
                ).peek(System.out::println)
                .filter(student -> student.getAge() > 10)
                .collect(Collectors.groupingBy(student -> student.getRegister()));

        System.out.println(data1);
    }
}
