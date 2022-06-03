package multithreading;

public class Ex2 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <= 1000; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
//        MyThread1 myThread1 = new MyThread1();
//        MyThread2 myThread2 = new MyThread2();
//        myThread1.start();
//        myThread2.start();
        Ex2 thread1 = new Ex2();
        thread1.start();

        for (int i = 1000; i > 0; i--) {
            System.out.println(i);
        }
    }
}

//class MyThread1 extends Thread {
//    @Override
//    public void run() {
//        for (int i = 0; i <= 1000; i++) {
//            System.out.println(i);
//        }
//    }
//}
//
//class MyThread2 extends Thread {
//    @Override
//    public void run() {
//        for (int i = 1000; i > 0; i--) {
//            System.out.println(i);
//        }
//    }
//}