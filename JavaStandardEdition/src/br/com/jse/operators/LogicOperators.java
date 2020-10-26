package br.com.jse.operators;

public class LogicOperators {
    public static void main(String[] args) {
        char token = 'b';
        byte password = 45;

        System.out.println(token == 'b' && password == 55  ? "welcome" : "user not found.");
    }
}
