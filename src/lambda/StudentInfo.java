package lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Function;

public class StudentInfo {


    void testStudents(ArrayList<Student> al, Predicate<Student> pr) {
        for (Student s : al) {
            if (pr.test(s)) {
                System.out.println(s);
            }
        }
    }

    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student st2 = new Student("Kolya", 'm', 23, 4, 6.4);
        Student st3 = new Student("Elena", 'f', 19, 1, 7.3);
        Student st4 = new Student("Petr", 'm', 20, 2, 9.1);
        Student st5 = new Student("Masha", 'f', 20, 2, 5.6);

        ArrayList<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        StudentInfo info = new StudentInfo();

        Function<Student, Double> f = student -> student.avgGrade;
        double res = avgOfSmth(students, student -> student.avgGrade);
        System.out.println(res);

//        info.testStudents(students, (Student p) -> p.avgGrade > 8);
//        info.testStudents(students, (p) -> {
//            System.out.println("hello");
//            return p.avgGrade > 8;
//        });


//        System.out.println("---------------------------------------");
//        Predicate<Student> p1 = p -> p.avgGrade > 7;
//        Predicate<Student> p2 = p -> p.sex == 'f';
//        info.testStudents(students, p1.negate());


//        System.out.println("---------------------------------------");
//
//        info.testStudents(students, (Student p) -> p.age < 22);
//        System.out.println("---------------------------------------");
//        info.testStudents(students, (Student p) -> p.age > 20 && p.avgGrade < 7.5 && p.sex == 'm');


//        Collections.sort(students, new Comparator<Student>() {
//            @Override
//            public int compare(Student s1, Student s2) {
//                return s1.course - s2.course;
//            }
//        });
//
//        Collections.sort(students, (stud1, stud2) -> stud1.course - stud2.course);
//        Collections.sort(students, Comparator.comparingInt(stud -> stud.course));
//        System.out.println(students);


    }

    private static double avgOfSmth(List<Student> list, Function<Student, Double> f) {
        double result = 0;
        for (Student s : list) {
            result += f.apply(s);
        }
        result = result / list.size();
        return result;
    }

}

//interface StudentChecks {
//    boolean check(Student s);
//}

//class CheckOverGrade implements StudentChecks {
//
//    @Override
//    public boolean check(Student s) {
//        return s.avgGrade > 8;
//    }
//}