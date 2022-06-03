package multithreading;

public class WaitNotifyExample {
    public static void main(String[] args) {
        Market market = new Market();
        Producer producer = new Producer(market);
        Consumer consumer = new Consumer(market);
        Thread thread1 = new Thread(producer);
        Thread thread2 = new Thread(consumer);
        thread1.start();
        thread2.start();
    }
}

class Market {
    private final Object lock = new Object();
    private int breadCount = 0;

    public synchronized void getBread() {
        //synchronized (lock) {
        while (breadCount < 1) {
            try {
                wait(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        breadCount--;
        System.out.println("Potrebitel kupil 1 hleb");
        System.out.println("Kolvo hleba v magazine = " + breadCount);
        notify();
        //}
    }

    public synchronized void putBread() {
        //synchronized (lock) {
        while (breadCount >= 5) {
            try {
                wait(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        breadCount++;
        System.out.println("Proizvoditel dobavil na vetrinu 1 hleb");
        System.out.println("Kolvo hleba v magazine = " + breadCount);
        notify();
        //}
    }
}

class Producer implements Runnable {
    Market market;

    Producer(Market market) {
        this.market = market;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            market.putBread();
        }
    }
}

class Consumer implements Runnable {
    Market market;

    Consumer(Market market) {
        this.market = market;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            market.getBread();
        }
    }
}