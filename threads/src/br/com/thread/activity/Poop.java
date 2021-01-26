package br.com.thread.activity;

import br.com.thread.Bathroom;

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
