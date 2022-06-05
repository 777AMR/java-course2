package work_with_files.programmer1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationEx2 {
    public static void main(String[] args) {
        Car car = new Car("Tesla", "Yellow");
        Employee employees = new Employee("Oleg", "Ivanov", "HR", 500, car);

        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(
                new FileOutputStream("employees2.bin"))) {

            objectOutputStream.writeObject(employees);
            System.out.println("Done!");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
