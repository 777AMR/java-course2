package multithreading;

public class Foo {

    volatile int methodCompleted;

    public Foo() {
        methodCompleted = 0;
    }

    public void first(Runnable printFirst) throws InterruptedException {
        printFirst.run();
        methodCompleted =  1;
    }

    public void second(Runnable printSecond) throws InterruptedException {
        while (methodCompleted != 1) ;
        printSecond.run();
        methodCompleted =  2;
    }

    public void third(Runnable printThird) throws InterruptedException {
        while (methodCompleted != 2) ;
        printThird.run();
        methodCompleted =  3;
    }
}

class PrintFirst extends Thread{
    @Override
    public void run() {
    }
}