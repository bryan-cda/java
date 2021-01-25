package br.com.thread;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile implements Runnable{

    private String archiveName;
    private String personName;

    public ReadFile(String archiveName, String personName){
        this.archiveName = archiveName;
        this.personName = personName;
    }



    @Override
    public void run() {
        try {
            Scanner scanner = new Scanner(new File(archiveName));
            int lineNumber = 1;
            String line = "";
            while(scanner.hasNextLine()){
                line =  scanner.nextLine();

                if(line.toLowerCase().contains(personName.toLowerCase())){
                    System.out.println(String.format("Archive: %s, Line: %s, Name: %s ",
                            archiveName, lineNumber, line));
                }
                lineNumber++;
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
