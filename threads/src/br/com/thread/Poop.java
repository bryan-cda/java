package br.com.thread;

public class Poop implements Runnable{
    private Bathroom bathroom;

    public Poop(Bathroom bathroom){
        this.bathroom = bathroom;
    }
    @Override
    public void run() {
        bathroom.poop(Thread.currentThread().getName());
    }
}
