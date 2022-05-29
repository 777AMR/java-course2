package stream;

import java.util.ArrayList;
import java.util.List;

public class Parallel_Stream {
    public static void main(String[] args) {

        List<Double> list = new ArrayList<>();
        list.add(10.0);
        list.add(5.0);
        list.add(1.0);
        list.add(0.25);

//        double sumResult = list.parallelStream()
//                .reduce((a, e) -> a + e).get();
//        System.out.println("sumResult: " + sumResult);

        double sumResult = list.parallelStream()
                .reduce((a, e) -> a / e).get();
        System.out.println("sumResult: " + sumResult);


    }
}
