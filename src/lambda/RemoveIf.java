package lambda;

import java.util.ArrayList;
import java.util.function.Predicate;

public class RemoveIf {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("privet");
        arrayList.add("poka");
        arrayList.add("ok");
        arrayList.add("uchim java");
        arrayList.add("lambda imenno");

//        arrayList.removeIf(element -> element.length() < 5);

        Predicate<String> p = element -> element.length() < 5;
        arrayList.removeIf(p);
        System.out.println(arrayList);
    }
}
