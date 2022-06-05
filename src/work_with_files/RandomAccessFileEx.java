package work_with_files;

import java.io.FileNotFoundException;
import java.io.IOException;

public class RandomAccessFileEx {
    public static void main(String[] args) {
        try (java.io.RandomAccessFile file =
                     new java.io.RandomAccessFile("text10.txt", "rw")) {

            int a = file.read();
            System.out.println((char) a);
            String s1 = file.readLine();
            System.out.println(s1);

            file.seek(101);
            String s2 = file.readLine();
            System.out.println(s2);

            long position = file.getFilePointer();
            System.out.println(position);

//            file.seek(0);
//            file.writeBytes("privet");
            file.seek(file.length() - 1);

            file.writeBytes("\n\t\t\t\t\tWilliam Butler");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
