package br.com.jse.controlflux;

public class ControlFluxIf {
    public static void main(String[] args) {
        //When have just one condition
        if(true)
            System.out.println("Open.");

        int age = 18;

        if(age < 15){
            System.out.println("JR");
        } else if(age > 15 && age < 18){
            System.out.println("PL");
        }else{
            System.out.println("SR");
        }

        //Ternary If
        String level = age-4 > 15 ? "SR" : "PL";

        System.out.println(level);
    }
}
