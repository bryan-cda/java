package br.com.jse.colletions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CourseTest {
    public static void main(String[] args) {
        Course course = new Course("Java Collections", 12);

        Classes classJavaCollections = new Classes("LinkedList", 9);
        Classes classDesignPattern = new Classes("ArrayList", 12);

        List<Classes> classes = new ArrayList<>();

        course.setClasses(classes);

        classes.add(classJavaCollections);
        classes.add(classDesignPattern);

        System.out.println(classes.toString());

        Collections.sort(classes, Comparator.comparing(Classes::getTime));

        System.out.println(classes.toString());

        classes.sort(Comparator.comparing(Classes::getName));

        System.out.println(classes);

        System.out.println(course.toString());

    }
}
