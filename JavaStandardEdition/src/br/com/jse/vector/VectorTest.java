package br.com.jse.vector;

public class VectorTest {
    public static void main(String[] args) {
        Student student1 = new Student("Foo");
        Student student2 = new Student("Bar");
        Student student3 = new Student("Tom");
        Student student4 = new Student("Jamie");
        Student student5 = new Student("Julian");
        Student student6 = new Student("Cora");

        Vector vector = new Vector();
        vector.addStudent(student1);
        vector.addStudent(student2);
        vector.addStudent(student4);
        vector.addStudent(student5);
        vector.addStudent(student6);

        System.out.println(vector.getSchool());

        System.out.println(vector.contains(student1));

        System.out.println(vector.getStudent(1));

        System.out.println(vector.getStudent(0));

        vector.addAtPosition(1, student3);

        System.out.println(vector.getSchool());

        System.out.println(vector.freePosition);

        vector.removeAtPosition(3);

        System.out.println(vector.freePosition);

        System.out.println(vector.getSchool());

        vector.removeAtPosition(4);

        System.out.println(vector.freePosition);

        System.out.println(vector.getSchool());

        vector.removeAtPosition(3);

        System.out.println(vector.freePosition);

        System.out.println(vector.getSchool());

        vector.removeAtPosition(1);
        vector.addAtPosition(1, student2);
        vector.removeAtPosition(2);
        vector.addAtPosition(2, student3);


        System.out.println(vector.freePosition);

        System.out.println(vector.getSchool());

//        test exception -> vector.removeAtPosition(8);

    }
}
