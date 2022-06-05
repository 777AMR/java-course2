package work_with_files;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {
    public static void main(String[] args) throws IOException {
        String rubai = "Кто понял жизнь тот больше не спешит,\n" +
                "Смакует каждый миг и наблюдает,\n" +
                "Как спит ребёнок, молится старик,\n" +
                "Как дождь идёт и как снежинки тают.";

        try (FileWriter fileWriter = new FileWriter("C:\\Users\\777AMR\\Desktop\\test1.txt", true)) {

            for (int i = 0; i < rubai.length(); i++) {
                fileWriter.write(rubai.charAt(i));
            }
            System.out.println("Done!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
