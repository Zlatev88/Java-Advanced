package StreamsFilesAndDirectories.Lab;

import java.io.*;
import java.util.Set;

public class _2_WriteToAFile {
    public static void main(String[] args) throws IOException {

        String inputPath = "D:\\input.txt";
        String outputPath = "D:\\output.txt";

        FileInputStream fileStream = new FileInputStream(inputPath);
        OutputStream out = new FileOutputStream(outputPath);
        Set<Character> punctuations = Set.of(',', '.', '!', '?');

        int read = fileStream.read();
        while (read >=0) {

            if (!punctuations.contains((char)read)) {

            out.write(read);
            }


            read = fileStream.read();
        }

    }
}
