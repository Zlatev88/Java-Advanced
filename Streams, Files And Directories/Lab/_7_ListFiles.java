package StreamsFilesAndDirectories.Lab;

import java.io.File;
import java.util.Arrays;

public class _7_ListFiles {
    public static void main(String[] args) {
        File root = new File("C:\\Users\\Zlatin Zlatev\\Desktop" +
                "\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\Files-and-Streams");

        Arrays.stream(root.listFiles()).filter(File::isFile)
                .forEach(e-> System.out.println(e.getName() + ": " + "[" + e.length() + "]"));
    }
}
