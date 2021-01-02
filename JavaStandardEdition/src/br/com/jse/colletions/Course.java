package br.com.jse.colletions;

import java.util.*;

public class Course implements Comparable<Course> {

    private String name;
    private Integer duration;
    private List<Classes> classes = new ArrayList<>();
    private List<Students> students = new ArrayList<>();
    private Map<String, Students> studentByRegister = new HashMap<>();

    public Course(String name, Integer duration) {
        this.name = name;
        this.duration = duration;
    }

    public Course(String name, Integer duration, List<Classes> classes) {
        this.name = name;
        this.duration = duration;
        this.classes = classes;
    }

    @Override
    public String toString() {
        return "Course {" +
                " Name = '" + name + '\'' +
                ", Duration = " + getTotalOfDuration()+ " minutes " +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public List<Classes> getClasses() {
        return Collections.unmodifiableList(this.classes);
    }

    public void setClasses(List<Classes> classes) {
        this.classes = classes;
    }

    public void setClass(Classes classes){
        this.classes.add(classes);
    }

    @Override
    public int compareTo(Course o) {
        return this.name.compareTo(o.name);
    }

    public Integer getTotalOfDuration(){
       return classes.stream().mapToInt(Classes::getTime).sum();
    }

    public List<Students> getStudents() {
        return Collections.unmodifiableList(students);
    }

    public void setStudents(List<Students> students) {
        this.students = students;
    }

    public void registerStudent(Students student){
        this.students.add(student);
        this.studentByRegister.put(student.getRegister(), student);
    }

    public Students getStudentByRegister(Students students) throws NoSuchFieldException {
        Students foundStudent = studentByRegister.get(students.getRegister());

        if(!Objects.nonNull(foundStudent)){
            throw new NoSuchFieldException(String.format("Student not found for register '%s'", students.getRegister()));
        }
        return foundStudent;
    }
}
