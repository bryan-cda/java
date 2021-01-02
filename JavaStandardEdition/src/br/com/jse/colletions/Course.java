package br.com.jse.colletions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Course implements Comparable<Course> {

    private String name;
    private Integer duration;
    private List<Classes> classes = new ArrayList<>();

    public Course(String name, Integer duration) {
        this.name = name;
        this.duration = duration;
        this.classes = classes;
    }

    public Course(String name, Integer duration, List<Classes> classes) {
        this.name = name;
        this.duration = duration;
        this.classes = classes;
    }

    @Override
    public String toString() {
        StringBuilder course = new StringBuilder("{");
        course.append("'Name':"+ name+",");

        Integer duration = 0;
        for(Classes c : classes){
            duration += c.getTime();
        }
        course.append("'Duration':"+ duration+" min}");

        return course.toString();
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


}
