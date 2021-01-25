package br.com.thread;

public class Bathroom {

    private String person;


    public void urinate(String name) {
        System.out.println(String.format("%s joined bathroom", name));

        synchronized(this) {
            System.out.println(String.format("%s is urinating", name));

            try {
                Thread.sleep(180);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(String.format("%s is washing hands", name));
            try {
                Thread.sleep(80);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(String.format("%s exit bathroom", name));
        }
    }

    public void poop(String name){
        System.out.println(String.format("%s joined bathroom", name));
        System.out.println(String.format("%s is pooping", name));
        try{
            Thread.sleep(180);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(String.format("%s is washing hands", name));
        try{
            Thread.sleep(80);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(String.format("%s exit bathroom", name));
    }
}
