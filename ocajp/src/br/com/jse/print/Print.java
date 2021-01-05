package br.com.jse.print;

public class Print {
    public static void main(String[] args) {

        //Print primitive types
        int i = 10;
        char c = 'q';
        System.out.print(c);
        System.out.print(i);

        // \n break line
        System.out.println("\n________________________________________________");

        // Interpolation
        System.out.format("Hello, %s!", "world\n");

        System.out.println(new byte[10]);

        /**
         * Attention (!) Only char array don't print using Object toString format
         */
        char[] chars = {'a', 'b'};
        System.out.println(chars);

        int age = 30;

        System.out.format("Age = %d years old\n", age);

        boolean isLoggedOn = true;

        System.out.format("Is logged? %b\n", isLoggedOn);

        /**
         * Keep on () only negative numbers
         */

        System.out.format("R$ [%(05f]%n\n", 1443.0);
        System.out.format("R$ [%09d]%n", 1443);
        System.out.format("R$ [%.2f]%n", 1443.0);


    }
}
