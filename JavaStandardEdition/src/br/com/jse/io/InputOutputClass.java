package br.com.jse.io;

import java.io.*;
import java.util.Arrays;
import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

public class InputOutputClass {

    public static void main (String[]args) throws IOException {

        InputStream inputStream = System.in;
        Reader reader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(reader);

        OutputStream outputStream = new FileOutputStream("libertas.txt");
        Writer writer = new OutputStreamWriter(outputStream);
        BufferedWriter bufferedWriter = new BufferedWriter(writer);

        String line = bufferedReader.readLine();

        while(line != null && !line.isEmpty()){
            bufferedWriter.write(line);
            bufferedWriter.newLine();
            bufferedWriter.flush();

            line = bufferedReader.readLine();
        }

        bufferedReader.close();
        bufferedWriter.close();

        InputStream input = new FileInputStream("nu.csv");
        Reader rd = new InputStreamReader(input);
        BufferedReader binp = new BufferedReader(rd);

        binp.close();
        }
}
