package multithreading;

import java.util.concurrent.*;

public class CallableFactorial {
    static int factorialResult;

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Factorial1 factorial1 = new Factorial1(6);
        Future<Integer> future = executorService.submit(factorial1);
        try {
            System.out.println("Hotim poluxit resul'tat");
            factorialResult = future.get();
            System.out.println("Pou4ili resul'tat");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            System.out.println(e.getCause());
        } finally {
            executorService.shutdown();
        }
        System.out.println(factorialResult);
    }
}

class Factorial1 implements Callable<Integer> {

    int f;

    public Factorial1(int f) {
        this.f = f;
    }

    @Override
    public Integer call() throws Exception {
        if (f <= 0) {
            throw new Exception("Vi vveli nevernoe chislo");
        }
        int result = 1;
        for (int i = 1; i <= f; i++) {
            result *= i;
            Thread.sleep(1000);
        }
        return result;
    }
}