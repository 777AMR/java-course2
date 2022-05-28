package lambda;

public class Test2 {
    static void def(I i) {
        System.out.println(i.abc("poka"));
    }

    public static void main(String[] args) {
        int i = 10;
        def((String s) -> {
            System.out.println("i: " + i);
            return s.length() + i;
        });
        System.out.println();
    }
}

interface I {
    int abc(String str);
}