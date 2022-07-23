package StreamsFilesAndDirectories.Exercise;

import java.io.*;
import java.util.Locale;

public class _3_AllCapitals {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new FileReader("src/input.txt"));
        PrintWriter pw = new PrintWriter("out.txt");

        String line = bf.readLine();
        while (line != null) {

                pw.println(line.toUpperCase(Locale.ROOT));


            line = bf.readLine();

        }
        pw.close();
    }
}
