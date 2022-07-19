package StreamsFilesAndDirectories.Lab;

import java.io.*;

public class _5_WriteEveryThirdLine {
    public static void main(String[] args) throws IOException {

        String input = "D:\\input.txt";
        String output = "D:\\output.txt";

        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(input)));
        BufferedWriter writer = new BufferedWriter(new FileWriter(output));

        String line = reader.readLine();
        int counter = 0;

        while (line != null) {
            counter++;

            if (counter%3==0) {
                writer.write(line);
                writer.newLine();
            }


            line = reader.readLine();
        }
        reader.close();
        writer.close();



    }
}
