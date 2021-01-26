package br.com.thread.test;

import br.com.thread.activity.ReadFile;

public class FileReaderThreadTest {
    public static void main(String[] args) {
        Thread assignment1 = new Thread(new ReadFile("assinaturas1.txt","Afik"));
        Thread assignment2 = new Thread(new ReadFile("assinaturas1.txt","Lippert"));
        Thread assignment3 = new Thread(new ReadFile("assinaturas1.txt","Winter"));

        assignment1.start();
        assignment2.start();
        assignment3.start();
    }

}
