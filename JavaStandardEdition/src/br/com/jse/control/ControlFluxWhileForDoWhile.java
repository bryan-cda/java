package br.com.jse.control;

public class ControlFluxWhileForDoWhile {


    public static void main(String[] args) {
        int count = 10;

        //verify condition before execute
        while (count > 0){
            System.out.println("Count: " + count);
            count --;
        }

        count = -1;

        //unless one time will execute the instruction because the verification is after loop
        do {
            System.out.println("Count: " + count);
            count --;
        } while (count >0);

        for(int i = 0; i <= 100; i ++){
            System.out.println("i = " + i);
        }
    }
}
