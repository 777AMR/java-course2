package stream;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Test9_min_max_limit_skip_mapToInt {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 44, 3, 8.3);
        Student st2 = new Student("Kolya", 'm', 33, 4, 6.4);
        Student st3 = new Student("Elena", 'f', 37, 2, 7.3);
        Student st4 = new Student("Petr", 'm', 20, 2, 9.1);
        Student st5 = new Student("Masha", 'f', 20, 2, 5.6);
        List<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        int sum = students.stream().mapToInt(e -> e.getCourse()).sum();
//        System.out.println(sum);

        double average = students.stream().mapToInt(e -> e.getCourse()).average().getAsDouble();
//        System.out.println(average);

        int min = students.stream().mapToInt(e -> e.getCourse()).min().getAsInt();
//        System.out.println(min);

        int max = students.stream().mapToInt(e -> e.getCourse()).max().getAsInt();
//        System.out.println(max);

//        List<Integer> courses = students.stream().mapToInt(e -> e.getCourse())
//                .boxed()
//                .collect(Collectors.toList());
//        System.out.println(courses);

//        Student min = students.stream().min(Comparator.comparingInt(Student::getAge)).get();
//        System.out.println(min);
//
//        Student max = students.stream().max(Comparator.comparingInt(Student::getAge)).get();
//        System.out.println(max);

//        students.stream().filter(e -> e.getAge() > 30).forEach(System.out::println);
//        System.out.println("---------------------");
//        students.stream().filter(e -> e.getAge() > 30).limit(2).forEach(System.out::println);
//        System.out.println("---------------------");
//        students.stream().filter(e -> e.getAge() > 30).skip(2).forEach(System.out::println);
    }
}
