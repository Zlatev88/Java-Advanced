package StreamsFilesAndDirectories.Exercise;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class _5_LineNumbers {
    public static void main(String[] args) throws IOException {
        try(PrintWriter pw = new PrintWriter("src/output.txt")){
            Path inputFile = Paths.get("src/inputLineNumbers.txt");
            List<String> lines = Files.readAllLines(inputFile);
            for (int i = 0; i < lines.size(); i++) {
                pw.println((i+1) +". " + lines.get(i));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}