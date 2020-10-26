package br.com.jse.operators;

public class AssignmentOperators {
    public static void main(String[] args) {
        int i = 10;

        System.out.println(i += 10);//i = 10 + 10  -> 20
        System.out.println(i -= 10);//i = 20 - 10 -> 10
        System.out.println(i /= 10);//i = 10 / 10 -> 1
        System.out.println(i *= 10);//i = 1 * 10 -> 10;
        System.out.println(i %= 10);//i = 10 % 10 -> 0;

    }
}
