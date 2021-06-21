package br.com.jse.collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

import static java.lang.Thread.sleep;

public class JavaUtilCollectionQueueExam {
    public static void main(String[] args) throws InterruptedException {
        Queue bankQueue = new LinkedList();
        bankQueue.add("Chloe");
        bankQueue.add("John");
        bankQueue.add("Dean");
        bankQueue.add("Ruby");

        bankService(bankQueue);

        bankQueue.forEach(System.out::println);

        //Remove using FIFO
        Object poll = bankQueue.poll();
        print(poll);

        //Return first element of queue
        Object peek = bankQueue.peek();
        print(peek);

        bankQueue.add("Chloe");
        print(bankQueue);
    }

    public static void print(Object object){
        System.out.println(object);
    }

    public static void bankService(Object object) throws InterruptedException {
        Queue queue = new LinkedList();
        queue = (Queue) object;
        Iterator iterator = queue.iterator();
        Random random = new Random();
        while(iterator.hasNext()){
            System.out.println(String.format("Welcome mr/ms %s", queue.element()));
            sleep(random.nextInt(5000));
            System.out.println(". . . . .");
            System.out.println("service performed");
            queue.poll();
            if(queue.isEmpty()){
                System.out.println("free cash");
            } else{
                System.out.println("next customer");
            }
        }
    }
}
