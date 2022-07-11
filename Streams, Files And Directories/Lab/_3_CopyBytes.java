package StreamsFilesAndDirectories.Lab;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class _3_CopyBytes {
    public static void main(String[] args) throws IOException {
        String input = "D:\\input.txt";
        String output = "D:\\output.txt";

        FileInputStream inputStream = new FileInputStream(input);
        FileOutputStream outputStream = new FileOutputStream(output);

        int read = inputStream.read();

        while (read != -1) {


            if (read == 32 || read ==10) {
                outputStream.write(read);
            }
            else {
                String digits = String.valueOf(read);
            for (int i = 0; i < digits.length(); i++) {
                char current = digits.charAt(i);

                outputStream.write(current);

            }

            }

            read = inputStream.read();
        }
    }
}
