package multithreading;

public class Ex7 {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 5; i++) {
            System.out.println(i+1);
            Thread.sleep(1000);
        }
        System.out.println("Поехали!!!");
    }
}
