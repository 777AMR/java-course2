package multithreading;

public class SynchronizedBlock {
    public static void main(String[] args) {

        MyRunnableImplementation2 runnableImplementation =
                new MyRunnableImplementation2();
        Thread thread1 = new Thread(runnableImplementation);
        Thread thread2 = new Thread(runnableImplementation);
        Thread thread3 = new Thread(runnableImplementation);
        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class Counter2 {
    volatile static int count = 0;
}

class MyRunnableImplementation2 implements Runnable {

    private void doWork2() {
        System.out.println("Ura!!!");
    }

    public void doWork1() {
        doWork2();
        synchronized (this) {
            Counter2.count++;
            System.out.println(Counter2.count);
        }
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            doWork1();
        }
    }
}