package stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test2_filter {
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

        Student first = students.stream().map(element ->
        {
            element.setName(element.getName().toUpperCase());
            return element;
        })
                .filter(element -> element.getSex() == 'f')
                .sorted((x, y) -> x.getAge() - y.getAge())
                .findFirst().get();

        System.out.println(first);


//        students.stream().map(element ->
//        {
//            element.setName(element.getName().toUpperCase());
//            return element;
//        })
//                .filter(element -> element.getSex() == 'f')
//                .sorted((x, y) -> x.getAge() - y.getAge())
//                .forEach(element -> System.out.println(element));


        //students = students.stream().sorted((x, y) -> x.getName().compareTo(y.getName())).collect(Collectors.toList());
//        students = students.stream().sorted(Comparator.comparing(Student::getName)).collect(Collectors.toList());
//
//        System.out.println(students);
//        students = students.stream().filter(element ->
//                element.getAge() > 22 && element.getAvgGrade() < 72.3)
//                .collect(Collectors.toList());
//        System.out.println(students);
//
//        Stream<Student> myStream = Stream.of(st1, st2, st3, st4, st5);
//
//        myStream.filter(element ->
//                element.getAge() > 22 && element.getAvgGrade() < 72.3)
//                .collect(Collectors.toList());
//        System.out.println(students);
    }
}

class Student {
    private String name;
    private char sex;
    private int age;
    private int course;
    private double avgGrade;

    public Student(String name, char sex, int age, int course, double avgGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", course=" + course +
                ", avgGrade=" + avgGrade +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public double getAvgGrade() {
        return avgGrade;
    }

    public void setAvgGrade(double avgGrade) {
        this.avgGrade = avgGrade;
    }
}