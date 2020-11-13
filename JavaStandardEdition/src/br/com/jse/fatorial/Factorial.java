package br.com.jse.fatorial;

public class Factorial {
    public static void main(String[] args) {
        Factorial f = new Factorial();
        int fat = 0;
       for(int i = 0; i < 11; i++){
           System.out.println("The factorial of "+ fat + " = "+ f.calcFact(i));
           fat++;
       }
        System.out.println(" ");
    }

     public int calcFact(int x){
        if(x == 0){
            return 1;
        }

        return x * calcFact(x-1);
    }
}
