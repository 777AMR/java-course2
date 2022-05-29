package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test8_collect {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student st2 = new Student("Kolya", 'm', 23, 4, 6.4);
        Student st3 = new Student("Elena", 'f', 19, 1, 7.3);
        Student st4 = new Student("Petr", 'm', 20, 2, 9.1);
        Student st5 = new Student("Masha", 'f', 20, 2, 5.6);
        List<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

//        Map<Integer, List<Student>> map = students.stream().map(el -> {
//            el.setName(el.getName().toUpperCase());
//            return el;
//        })
//                .collect(Collectors.groupingBy(el -> el.getCourse()));
//
//        for (Map.Entry<Integer, List<Student>> entry: map.entrySet()){
//            System.out.println(entry.getKey() + " : " + entry.getValue());
//        }

        Map<Boolean, List<Student>> map =
        students.stream()
                .collect(Collectors.partitioningBy(el -> el.getAvgGrade() > 7));
        for (Map.Entry<Boolean, List<Student>> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
