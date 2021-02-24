package br.com.jse.declarations;

import java.time.LocalDate;
import java.time.Period;
import java.util.Arrays;

public class VariablesDeclarations {
    public static void main(String[] args) {
        int age;
        if(args.length > 1 && args.length < 10){
            age = 10;
            System.out.println(Arrays.toString(args));
        } else{
            System.out.println(Arrays.toString(args));
            age = 20;
        }

        System.out.println(age);
    }

}

class VariableDeclarationsTest{
    public static void main(String[] args) {
        VariablesDeclarations declarations = new VariablesDeclarations();
        String[] langs ={"Java", "Python", "JS"};
        VariablesDeclarations.main(langs);

        Car car = new Car();
        car.setFirstLetter('f');
        System.out.println(car.getAge());
        System.out.println(car.getFirstLetter());


        System.out.println(Person.size);
        System.out.println(Person.height);
        System.out.println(Person.octal);
        System.out.println(Person.binary);
        System.out.println(Person.decimal);
        System.out.println(Person.c);
    }
}

class Car {
    private int age;
    private char firstLetter;

    public int getAge(){
        if(age == 0){
            this.age = Integer.parseInt(LocalDate.now().toString().replace("-","").substring(0,4));
        }
        return this.age;
    }

    public char getFirstLetter(){
        return this.firstLetter;
    }

    public void setFirstLetter(char c){
        this.firstLetter = c;
    }

    public void setAge(int age){
        this.age = age;
    }
}

class Person{
    static double size = 110;
    static float height = 1.73F;
    static int octal = 0710;
    static int binary = 0b0101;
    static int decimal = 0xE;
    static long premium = 123_456_567_012l;
    static char c = 7;


}