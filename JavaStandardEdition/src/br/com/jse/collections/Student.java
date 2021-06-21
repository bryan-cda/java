package br.com.jse.collections;

public class Student implements Comparable<Student>{
    private String name;
    private String register;
    private int age;
    private String subject;

    public Student(String name, String register, int age, String subject) {
        this.name = name;
        this.register = register;
        this.age = age;
        this.subject = subject;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegister() {
        return register;
    }

    public void setRegister(String register) {
        this.register = register;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", register='" + register + '\'' +
                ", age=" + age +
                ", subject='" + subject + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student student) {
        return this.age - student.age;
    }
}
