package multithreading;

public class Ex6 implements Runnable {
    @Override
    public void run() {
        System.out.println("Method run. Name: " +
                Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new Ex6());
        thread.run();
        System.out.println("Method run. Name: " +
                Thread.currentThread().getName());
    }
}
