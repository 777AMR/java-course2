package work_with_files;

import java.io.*;

public class CopyEx {
    public static void main(String[] args) {
        try (BufferedReader bufferedReader = new BufferedReader(
                new FileReader("C:\\Users\\777AMR\\Desktop\\1.jpg"));
             BufferedWriter writer = new BufferedWriter(
                     new FileWriter("11.jpg"));
        ) {
            int character;
            while ((character = bufferedReader.read()) != -1) {
                writer.write(character);
            }

//            String line;
//            while ((line = bufferedReader.readLine()) != null) {
//                writer.write(line);
//                writer.write('\n');
//            }
            System.out.println("Done");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
