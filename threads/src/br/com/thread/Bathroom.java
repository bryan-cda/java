package br.com.thread;

public class Bathroom {

    private String person;

    public Bathroom(String person){
        this.person = person;
    }

    public void urinate(){
        System.out.println(String.format("%s joined bathroom", person));
        System.out.println(String.format("%s is urinating", person));

        try{
            Thread.sleep(180);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(String.format("%s is washing hands", person));
        try {
            Thread.sleep(80);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(String.format("%s exit bathroom", person));
    }

    public void poop(){
        System.out.println(String.format("%s joined bathroom", person));
        System.out.println(String.format("%s is pooping", person));
        try{
            Thread.sleep(180);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(String.format("%s is washing hands", person));
        try{
            Thread.sleep(80);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(String.format("%s exit bathroom", person));
    }
}
