package br.com.thread;

public class Urinate implements Runnable {

    private Bathroom bathroom;

    public Urinate(Bathroom bathroom){
        this.bathroom = bathroom;
    }
    @Override
    public void run() {
        bathroom.urinate();
    }
}
