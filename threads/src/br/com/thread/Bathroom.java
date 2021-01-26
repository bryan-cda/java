package br.com.thread;

public class Bathroom {

    private String person;
    boolean isDirty = true;


    public void urinate(String name) {

        synchronized(this) {
            System.out.println(String.format("[%s] try to use bathroom...", name));

            while(isDirty){
                waitingOut();
            }
            try {
                System.out.println(String.format("[%s] is urinating...", name));
                Thread.sleep(180);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(String.format("[%s] is washing hands...", name));
            try {
                Thread.sleep(80);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(String.format("[%s] exit bathroom.", name));
            isDirty = true;
        }
    }

    public void poop(String name){

        synchronized (this) {
            System.out.println(String.format("[%s]  try to use bathroom...", name));
            while(isDirty){
                waitingOut();
            }

            try {
                System.out.println(String.format("[%s] is pooping...", name));
                Thread.sleep(180);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(String.format("[%s] is washing hands...", name));
            try {
                Thread.sleep(80);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(String.format("[%s] exit bathroom.", name));
            isDirty = true;
        }
    }

    public void clear(String name){
        if(Boolean.FALSE.equals(isDirty)){
            System.out.println("Bathroom is clear!");
            return;
        }

        synchronized (this){
            System.out.println(String.format("[%s] is cleaning bathroom...", name));
            try {
                this.wait(13000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Finish clear service!");
            this.isDirty = false;
            System.out.println(String.format("[%s] is out of bathroom.", name));

            this.notifyAll();
        }

    }

    public void waitingOut(){
        try {
            System.out.println("Bathroom is dirty, Cleaning Service is working. Waiting cleaning service out of bathroom");
            this.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
