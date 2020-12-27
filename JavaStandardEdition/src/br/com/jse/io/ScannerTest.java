package br.com.jse.io;

import java.io.File;
import java.util.Locale;
import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(new File("nu.csv"));
        while(scanner.hasNextLine()) {
            String line = scanner.nextLine();

            Scanner scannerLine = new Scanner(line);
            scannerLine.useLocale(Locale.US);
            scannerLine.useDelimiter(",");

            String owner = scannerLine.next();
            int agency = scannerLine.nextInt();
            int account = scannerLine.nextInt();
            double amount = scannerLine.nextDouble();

            String terminal = String.format
                    (new Locale("pt_BR"),
                    "Name: %s, Agency: %04d, Account: %06d, Amount R$ %1.2f",
                    owner.toUpperCase(),
                    agency,
                    account,
                    amount);

            System.out.println(terminal);

            scannerLine.close();
        }
        scanner.close();
    }
}
