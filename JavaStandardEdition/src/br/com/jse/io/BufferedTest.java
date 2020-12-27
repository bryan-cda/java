package br.com.jse.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedTest  {
    public static void main(String[] args) throws IOException {
        BufferedWriter br = new BufferedWriter(new FileWriter("mg.txt"));
        br.write("Z");
        br.newLine();
        br.close();

    }
}
