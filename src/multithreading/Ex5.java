package multithreading;

public class Ex5 {
    public static void main(String[] args) {
        MyThread5 myThread5 = new MyThread5();
        myThread5.setName("My potok");
//        myThread5.setPriority(9);
        myThread5.setPriority(Thread.MAX_PRIORITY);
        System.out.println("Name: " + myThread5.getName()
                + ", priority: " + myThread5.getPriority());

    }
}

class MyThread5 extends Thread {
    @Override
    public void run() {
        System.out.println("privet");
    }
}