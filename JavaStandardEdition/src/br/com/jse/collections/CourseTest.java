package br.com.jse.collections;

import java.util.*;

public class CourseTest {
    public static void main(String[] args) throws NoSuchFieldException {
        Course course = new Course("Java Collections", 12);

        Classes classJavaCollections = new Classes("LinkedList", 9);
        Classes classDesignPattern = new Classes("ArrayList", 12);

        /**
         * Collection List
         */
        List<Classes> classes = new ArrayList<>();

        course.setClasses(classes);

        classes.add(classJavaCollections);
        classes.add(classDesignPattern);

        System.out.println(classes.toString());

        /**
         * Sort List
         */

        Collections.sort(classes, Comparator.comparing(Classes::getTime));

        System.out.println(classes.toString());

        classes.sort(Comparator.comparing(Classes::getName));

        System.out.println(classes);

        System.out.println(course.toString());


        /**
         * Collection Set
         */
        Set<Students> students = new HashSet<>();
        students.add(new Students("Bryan", "0001"));
        students.add(new Students("Irys", "0002"));
        students.add(new Students("Ellora", "0003"));

        students.forEach(student ->{
            course.registerStudent(student);
        });

       course.getStudents().forEach(student -> System.out.println(student));

        Set<Students> studentsLinked = new LinkedHashSet<>();
        studentsLinked.add(new Students("Bryan", "0001"));
        studentsLinked.add(new Students("Irys", "0002"));
        studentsLinked.add(new Students("Ellora", "0003"));

        studentsLinked.forEach(student -> System.out.println(student));

        System.out.println("Found student: " + course.getStudentByRegister(new Students("Bryan", "0001")));


    }
}
