package StreamsFilesAndDirectories.Lab;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Collections;
import java.util.List;

public class _6_SortLines {
    public static void main(String[] args) throws IOException {
        String input = "D:\\input.txt";
        String output = "D:\\output.txt";

        List<String> lines = Files.readAllLines(Paths.get(input));
        Collections.sort(lines);

        Files.write(Paths.get(output), lines);
    }
}
