package StreamsFilesAndDirectories.Lab;

import java.io.FileInputStream;
import java.io.IOException;

public class _1_ReadFile {
    public static void main(String[] args) {

        String path = "D:\\input.txt";

        try (FileInputStream fileStream = new FileInputStream(path)){

            int oneByte = fileStream.read();
            while (oneByte>=0) {
                String number = Integer.toBinaryString(oneByte);
                System.out.print(number + " ");

                oneByte = fileStream.read();
            }

        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
