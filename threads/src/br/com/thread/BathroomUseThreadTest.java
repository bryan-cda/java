package br.com.thread;

public class BathroomUseThreadTest {
    public static void main(String[] args) {
        Bathroom bathroom = new Bathroom();
        Thread urinate = new Thread(new Urinate(bathroom), "John");
        Thread poop = new Thread(new Urinate(bathroom), "Cora");

        urinate.start();
        poop.start();
    }
}
