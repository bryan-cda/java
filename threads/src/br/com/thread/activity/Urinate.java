package br.com.thread.activity;

import br.com.thread.Bathroom;

public class Urinate implements Runnable {

    private Bathroom bathroom;

    public Urinate(Bathroom bathroom){
        this.bathroom = bathroom;
    }
    @Override
    public void run() {
        bathroom.urinate(Thread.currentThread().getName());
    }
}
