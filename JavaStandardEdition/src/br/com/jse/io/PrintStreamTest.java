package br.com.jse.io;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class PrintStreamTest {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream ps = new PrintStream("lorem-ipsum.txt");
        ps.println("Hello, Hello!");
        ps.println("Vertigo = U2");
        ps.println();
    }
}
