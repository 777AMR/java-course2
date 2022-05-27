package generics.game;

public class Test {
    public static void main(String[] args) {
        Scholar scholar1 = new Scholar("Ivan", 13);
        Scholar scholar2 = new Scholar("Masha", 15);
        Student student1 = new Student("Kolya", 20);
        Student student2 = new Student("Kseniya", 18);
        Employee employee1 = new Employee("Zaur", 32);
        Employee employee2 = new Employee("Mikhail", 47);

        Team<Scholar> scholarTeam = new Team<>("Drakony");
        Team<Student> studentTeam = new Team<>("Vpered");
        Team<Employee> employeeTeam = new Team<>("Rabotyagi");
        scholarTeam.addNewParticipant(scholar1);
        scholarTeam.addNewParticipant(scholar2);
        studentTeam.addNewParticipant(student1);
        studentTeam.addNewParticipant(student2);
        employeeTeam.addNewParticipant(employee1);
        employeeTeam.addNewParticipant(employee2);

        Team<Scholar> scholarTeam2 = new Team<>("Mudreci");
        Scholar scholar3 = new Scholar("Sergei", 12);
        Scholar scholar4 = new Scholar("Olya", 14);
        scholarTeam2.addNewParticipant(scholar3);
        scholarTeam2.addNewParticipant(scholar4);

//        scholarTeam.playWith(employeeTeam);
        scholarTeam.playWith(scholarTeam2);

    }
}
