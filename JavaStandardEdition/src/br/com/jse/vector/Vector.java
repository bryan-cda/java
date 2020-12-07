package br.com.jse.vector;

import java.util.Arrays;

public class Vector {
    Student[] school = new Student[100];

    int freePosition = 0;


    @Override
    public String toString() {
        return "Vector{" +
                "school=" + Arrays.toString(school) +
                '}';
    }

    public void addStudent(Student student){
            school[freePosition] = student;
            freePosition++;
    }

    public Boolean contains(Student student){
       Boolean found = false;
        for(int i = 0; i < freePosition; i++){
            if(student.equals(school[i])){
                found = true;
            }
        }
        return found;
    }
    public Boolean positionIsValid(int position) {
        return position >= 0 && position <= freePosition;
    }

    public Boolean validPositionToRemove(int position) {
        return position >= 0 && position <= freePosition -1;
    }


    public Student getStudent(int position){
        if(!positionIsValid(position)){
            throw new IllegalArgumentException("Posição invalida");
        }
        return school[position];
    }

    public void addAtPosition(int position, Student student){
        for(int i = freePosition; i >= position; i--){
            school[i+1] = school[i];
        }
        school[position] = student;
        freePosition++;
    }

    public void removeAtPosition(int position){

        if(! validPositionToRemove(position)){
            throw new IllegalArgumentException("Invalid Position");
        }
        for(int i = position; i < freePosition; i++){
            school[i] = school[i+1];
        }
        freePosition --;
    }


    public String getSchool() {
        return Arrays.toString(school);
    }

    public void setSchool(Student[] school) {
        this.school = school;
    }

    public int getFreePosition() {
        return freePosition;
    }

    public void setFreePosition(int freePosition) {
        this.freePosition = freePosition;
    }

}
