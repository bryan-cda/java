package br.com.thread.task;

import br.com.thread.Bathroom;

public class ClearBathroom implements Runnable{

    private Bathroom bathroom;

    public ClearBathroom(Bathroom bathroom){
        this.bathroom = bathroom;
    }
    @Override
    public void run() {
        while (true) {
            bathroom.clear(Thread.currentThread().getName());
            try {
                Thread.sleep(15000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
