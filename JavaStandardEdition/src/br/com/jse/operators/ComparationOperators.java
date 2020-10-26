package br.com.jse.operators;

public class ComparationOperators {
    /**
     * [ + sum ]
     * [ - subtraction ]
     * [ / - division ]
     * [ * - multiplication ]
     * [ ++ - increment ]
     * [ -- - decrement ]
     *
     */
    public static void main(String[] args) {
        int i = 100;
        int j = 50;
        int k = 110;

        //sum
        System.out.printf("Sum i + j = ");
        System.out.println(i + j);

        //subtraction

        System.out.printf("Subtraction i - j = ");
        System.out.println(i - j);

        //multiplication

        System.out.printf("Multiplication i * j = ");
        System.out.println(i * j);

        System.out.printf("Division i / j = ");
        System.out.println(i / j);

        System.out.println("Decrement i = ");

        while(i >= 0){
            System.out.println(i);
            i--;
        }

        System.out.printf("Increment j");

        while(j <= 100){
            System.out.println(j);
            j++;
        }

        //Modulus operator verify rest of division
        System.out.println(i % 2 == 0 ? "par"  : "ímpar");

        System.out.println(k % 10);
    }
}
