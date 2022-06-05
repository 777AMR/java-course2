package work_with_files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class PathAndFilesEx3 {
    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("test10.txt");
//        Files.createFile(filePath);
//        String dialog = "-Privet\n-Privet\n-Kak dela?\n-Xorosho";
//        Files.write(filePath, dialog.getBytes());

        List<String> strings = Files.readAllLines(filePath);
        for (String s :
                strings) {
            System.out.println(s);
        }
    }
}
