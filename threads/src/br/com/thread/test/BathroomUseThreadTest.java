package br.com.thread.test;

import br.com.thread.Bathroom;
import br.com.thread.activity.Poop;
import br.com.thread.activity.Urinate;
import br.com.thread.task.ClearBathroom;

public class BathroomUseThreadTest {
    public static void main(String[] args) {
        Bathroom bathroom = new Bathroom();
        Thread urinate = new Thread(new Urinate(bathroom), "John");
        Thread poop = new Thread(new Poop(bathroom), "Cora");
        Thread cleaning = new Thread(new ClearBathroom(bathroom), "Cleaning Service");

        cleaning.setDaemon(true);

        urinate.start();
        poop.start();
        cleaning.start();
    }
}
