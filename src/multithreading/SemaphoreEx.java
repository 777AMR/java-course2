package multithreading;

import java.util.concurrent.Semaphore;

public class SemaphoreEx {
    public static void main(String[] args) {
        Semaphore callBox = new Semaphore(2);
        new Person("Zaur", callBox);
        new Person("Masha", callBox);
        new Person("Oleg", callBox);
        new Person("Andrey", callBox);
        new Person("Elena", callBox);
    }
}

class Person extends Thread {
    String name;
    private Semaphore callBox;

    public Person(String name, Semaphore callBox) {
        this.name = name;
        this.callBox = callBox;
        this.start();
    }

    @Override
    public void run() {
        try {
            System.out.println(name + " zhdet...");
            callBox.acquire();
            System.out.println(name + " pol'zuetsya telefonom");
            sleep(2000);
            System.out.println(name + " zavershil zvonok");

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            callBox.release();
        }
    }
}