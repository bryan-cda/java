package br.com.thread;

public class BathroomUseThreadTest {
    public static void main(String[] args) {
        Thread urinate = new Thread(new Urinate(new Bathroom("John")));
        Thread poop = new Thread(new Poop(new Bathroom("Cora")));

        urinate.start();
        poop.start();
    }
}
