package StreamsFilesAndDirectories.Lab;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class _4_ExtractIntegers {
    public static void main(String[] args) throws FileNotFoundException {
        String inputPath = "D:\\input.txt";
        String outputPath = "D:\\output.txt";

        Scanner scanner = new Scanner(new FileInputStream(inputPath));

        PrintWriter out = new PrintWriter(new FileOutputStream(outputPath));

        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                out.println(scanner.next());
            }
            scanner.next();
        }
        out.close();
    }
}
